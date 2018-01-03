# AutomationExercise
Ejercicio en Selenium con Java para Intive-FDV


 Patrones de Diseños utilizados:
  Se utiliza PageObjects el cual nos ayuda a encapsular las características y funcionalidades de la pagina, de esta manera interactuamos con la pagina desde el pageObjects y no desde el test; cualquier cambio que se produzca en la web solo afectaría a estas clases y no a los test haciendo más fácil el manejo de errores.

Requisitos para ejecutar Test:

-Eclipse
-Junit

Pasos para importar el proyecto:

1- Descargar la carpeta completa de este repositorio compartido "AutomationExercise".
2- Copiarla en el C: (Esto es para simplificar las dependencias con las librerias de selenium y los drivers).
3- Usar el C: como workspace en Eclipse e importar el proyecto.

Descripción de la estructura del proyecto:
  Aquí se encuentran las librerías de Selenium WebDriver: C:\AutomationExercise\libs  
  Los Drivers para los distintos navegadores chrome, firefox:  C:\AutomationExercise\Driver
  Paquete PageObjects para este test solo posee "BusquedaGoogle": C:\AutomationExercise\src\PageObjects
  Paquete Test, Con los casos de pruebas: C:\AutomationExercise\src\Test

  
  
  
 


