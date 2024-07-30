package application;

import demo_jdbc.models.DriverResult;
import demo_jdbc.respositories.DriverResultRepository;
import demo_jdbc.respositories.SeasonRepository;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class ConductoresWindow extends Application {

    private TableView<DriverResult> tableView;
    private DriverResultRepository driverResultRepository;
    private SeasonRepository seasonRepository;

    public ConductoresWindow(DriverResultRepository driverResultRepository, SeasonRepository seasonRepository) {
        this.driverResultRepository = driverResultRepository;
        this.seasonRepository = seasonRepository;
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("RESULTADOS DE LOS DRIVERS");

        // Crear Label
        Label label = new Label("SELECCIONE EL AÑO QUE DESEA CONSULTAR: :");
        label.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        // Crear ComboBox
        ComboBox<Integer> comboBox = new ComboBox<>();
        List<Integer> years = seasonRepository.getYears();
        comboBox.getItems().addAll(years);
        comboBox.setOnAction(e -> loadResults(comboBox.getValue()));

        // Crear TableView
        tableView = new TableView<>();

        TableColumn<DriverResult, String> nameColumn = new TableColumn<>("NOMBRE DE LOS DRIVERS");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("driverName"));
        nameColumn.setMinWidth(200);

        TableColumn<DriverResult, Integer> winsColumn = new TableColumn<>("VWINS");
        winsColumn.setCellValueFactory(new PropertyValueFactory<>("wins"));
        winsColumn.setMinWidth(100);

        TableColumn<DriverResult, Integer> pointsColumn = new TableColumn<>("TOTAL POINTS");
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("totalPoints"));
        pointsColumn.setMinWidth(100);

        TableColumn<DriverResult, Integer> rankColumn = new TableColumn<>("RANK");
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        rankColumn.setMinWidth(100);

        tableView.getColumns().addAll(nameColumn, winsColumn, pointsColumn, rankColumn);

        // Organizar layout
        HBox hbox = new HBox(10, label, comboBox);
        hbox.setPadding(new Insets(10));
        hbox.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #d0d0d0; -fx-border-width: 1px;");
        hbox.setEffect(new DropShadow(10, Color.LIGHTGRAY));

        VBox vbox = new VBox(10, hbox, tableView);
        vbox.setPadding(new Insets(10));
        vbox.setStyle("-fx-background-color: #ffffff; -fx-border-color: #d0d0d0; -fx-border-width: 1px;");
        vbox.setEffect(new DropShadow(15, Color.LIGHTGRAY));

        Scene scene = new Scene(vbox, 800, 600);

        stage.setScene(scene);
        stage.show();
    }

    private void loadResults(int year) {
        if (year != 0) {
            List<DriverResult> results = driverResultRepository.getResultByYear(year);
            ObservableList<DriverResult> data = FXCollections.observableArrayList(results);
            tableView.setItems(data);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
