# TableView_Lista_Barras

## INTRODUCCIÓN

Utilizando la biblioteca JavaFX y trabajando con la base de datos PostgreSQL, el objetivo principal de este proyecto Java es crear una aplicación de escritorio que pueda ver y analizar datos relacionados con la competencia de Fórmula 1. Presenta pilotos, fabricantes, circuitos y resultados de carreras de una manera atractiva. y formato fácil de entender.






## **DESARROLLO**

### Estructura
-	**` Aplicación`**: Contiene las clases que definen la interfaz de usuario (UI) de la aplicación. Las clases con nombres como ` ConstructorsWindow`  y ` GraphicConductorsWindow ` indican que se crean ventanas especiales para mostrar información sobre conductores, constructores y gráficos.
-	**` Demo_jdbc.models`**: Representa los datos del dominio como ` Circuit`, ` ConstructorsResult`, ` DriverResult`, etc. Estas clases se pueden asignar a tablas en su base de datos.
-	**` Demo_jdbc.repositories`**: Contiene las clases necesarias para interactuar con la base de datos. Los nombres de clases como ` DriverResultRepository` indican que cada clase maneja operaciones de lectura y escritura).











![Captura de pantalla 2024-07-29 194634](https://github.com/user-attachments/assets/b3a57c18-fbf1-4c3e-b02f-7977b54485b9)















### Diseño
-	**Ventana Principal**: La aplicación presenta una ventana principal limpia y sencilla, con un título claro: "Aplicación de Fórmula 1".
-	**Enfoque en la Tarea**: El propósito principal de la aplicación está inmediatamente claro: permitir al usuario consultar información sobre los resultados de las carreras de Fórmula 1.
-	**Botones**: Los cuatro botones principales están etiquetados de forma concisa y clara, indicando las acciones que realizarán.








![Captura de pantalla 2024-07-29 194702](https://github.com/user-attachments/assets/02b1dee6-a946-42db-bfd7-ed902582b54b)















![Captura de pantalla 2024-07-29 194731](https://github.com/user-attachments/assets/8e994923-0d44-4642-95c3-c00f55d10c1c)














-	**Consultar resultados de los `Drivers`**: Probablemente muestra una tabla o lista con los resultados de los pilotos en diferentes carreras.
-	**Consultar resultados de los` Constructors`**: Similar al anterior, pero muestra los resultados de los equipos constructores.
-	**Consultar gráfico de barras de los Drivers**: Presenta un gráfico de barras que compara el rendimiento de los pilotos.
-	**Consultar gráfico de barras de los `Constructors`**: Muestra un gráfico de barras comparando el rendimiento de los equipos constructores.





![Captura de pantalla 2024-07-29 194801](https://github.com/user-attachments/assets/a6f84d55-595c-4d9e-879a-15ba2931c44b)














![Captura de pantalla 2024-07-29 194828](https://github.com/user-attachments/assets/eb61841a-aa17-4378-a3e8-dbc2c18d0f3a)







## **CONCLUSIÓN**
Esta aplicación nos permite:

-	**Consulta de Resultados**: Permite al usuario consultar los resultados de las carreras, tanto a nivel de pilotos como de equipos.
-	**Visualización Gráfica**: Ofrece la posibilidad de visualizar los datos en forma de gráficos de barras, lo cual facilita la comparación de resultados.
-	**Navegación Simple**: La interfaz es muy sencilla, con solo cuatro botones principales, lo que hace que la navegación sea ligera para el usuario.




