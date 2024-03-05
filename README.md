# Sistema de inventario Javafx

Este es un proyecto el cual me asignaron para corregir los errores que tenia. Los cuales son los siguientes:

1.	Falta de Integración de la Librería JavaFX:
:warning: El proyecto no tenía integrada la librería de JavaFX, lo que causaba una excepción “Not Found” al importar las herramientas de esa librería.

:bulb: Agregar la librería de JavaFX al proyecto para que las importaciones funcionen correctamente.



2.	Llamada Ambigua a javafx.event.ActionEvent en ContenidoController:
:warning: Había una llamada ambigua a javafx.event.ActionEvent en el archivo ContenidoController. Esto se debía a la importación innecesaria de java.awt.event.ActionEvent.

:bulb: Eliminar la importación de java.awt.event.ActionEvent.



3.	Expresión Incorrecta en ControlesBasicos (linea 15):
:warning: La expresión “pregunta == yes” no es correcta. Al usar JOptionPane.showConfirmDialog, los valores de retorno no son cadenas, acá se ponen constantes estáticas definidas en la clase JOptionPane, ya que no se esta comparando con el valor real devuelto por el mismo.

:bulb: Comparar con JOptionPane.YES_OPTION en lugar de “yes”.



4.	Falta de Import en ProductoController:
:warning: Le faltaba un import a PreparedStatement en el archivo ProductoController.

:bulb: Importar java.sql.PreparedStatement.



5.	Error de Sintaxis en ProductoController:
:warning: Se llama a una variable n que no está declarada previamente.

:bulb: Declarar la variable antes de evaluarla, de esta manera: int n = estado.executeUpdate();.



6.	Error de sintaxis en ProductoController (Línea 75):
:warning: El script que consulta la tabla “categoría” está mal escrito. Este hace referencia a “category” en lugar de “categoría”.

:bulb: Corregir la referencia a la tabla “categoría” en el script para que funcione correctamente.



7.	Error de sintaxis en ProductoController (Línea 269):
:warning: En el script de inserción a la tabla “producto”, el nombre de la tabla está mal escrito como “product” en lugar de “producto”.

:bulb: Corregir el nombre de la tabla en el script para que sea “producto”.



8.	 Error de sintaxis en RegistroController (Línea 129):

:warning: Al registrar usuarios, el sistema lanza una excepción porque no encuentra la tabla “usuario”. Sin embargo, la tabla correcta se llama “usuarios”.

:bulb: Agregar la letra “s” al final de la palabra “usuario” en el script de inserción a la tabla.




9.	 Error de sintaxis en RegistroController (Línea 130):

:warning: En el script de inserción de registro de usuario, dentro de las columnas, se utiliza “email” como nombre de columna. Sin embargo, en la tabla, la columna se llama “correo”.


:bulb: Cambiar “email” por “correo” en el script de inserción.



10.	Error lógico en RegistroController (Línea 151):

:warning: La condicional “n > 0” está mal expresada. Si n es mayor que 0, significa que el usuario se insertó correctamente y no debería lanzar un error de fallo en el registro.

:bulb: Invertir la condicional a “n < 0” para que el error se active cuando falle el registro. 



11.	Error de Autenticación en PostgreSQL:

:warning: Al compilar el proyecto, aparecia el siguiente error: “The authentication type 10 is not supported. Check that you have configured the pg_hba.conf file to include the client’s IP address or subnet, and that it is using an authentication scheme supported by the driver”.

:bulb: Ir a la ruta “C:\Program Files\PostgreSQL\16\data\pg_hba_conf”. Y en la sección “IPv4 local connections”, cambiar el método de conexión a “trust”.



