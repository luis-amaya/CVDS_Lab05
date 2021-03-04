# CVDS_Lab05
## Comando Telnet
- Antes de poder ejecutar el comando telnet en la consola de comando de Windows, es necesario activar este servicio. Por tanto solo basta ejecutar la siguiente sentencia en el Windows Power Shell ejecutandolo como Admin. " dism /online /Enable-Feature /FeatureName:TelnetClient " 
![Activacion Comando Telnet](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Activacion%20comando%20Telnet.PNG)

## Parte 1. Jugando a ser un cliente Http
- Realizando la conexion sincrona TCP/IP a traves de Telnet
![Capture1](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture1.PNG)
- Peticion GET solicitando el recurso 'sssss/abc.html', utilizando la version 1.0 de HTTP
![Capture2](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture2.PNG)
  * El codigo de error que sale es el 505 cuyo significado es: El servidor no soporta la version del protocolo HTTP utilizada en la solicitud.
  * Otros codigos de error:
    *  500 Internal Server Error: Un mesnaje de error, dado cuando una condicion inesperada fue encontrada y no otro mensaje de error especifico se puede dar.
    *  502 Bad Gateway: El servidor esta actuando como una compuerta o un proxy y recibio una respuesta invalida del servidor superior.
    *  504 Gateway Timeout: El servidor estaba actuando como una compuerta o proxy y no revicio una respuesta a tiempo del servidor superior.
    *  400 Bad Request: El servidor no puede o no procesara la solicitud debido a un aparente error de cliente.
    *  404 Not Found: El recurso solicitado no pudo ser encontrado pero puede estar disponible en el futuro.
- Nueva conexion con telnet a "www.httpbin.org" 
![Capture3](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture3.PNG)
  * Obteniendo el recurso /html
![Capture4](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture4.PNG)
- Contando las Palabras
![Capture5](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture5.PNG)
  * GET: Es utilizado para solicitar datos de un recurso especifico.
  * POST: Es utilizado para enviar datos a un servidor para crear/actualizar un recurso.
  * Otras Peticiones:
    * PUT: Es utilizado para enviar datos a un servidor para crear/actualizar un recurso.
    * HEAD: Es casi identido a GET, pero sin el cuerpo de respuesta
    * DELETE: Elimina el recurso especificado.
    * OPTIONS: Describe las opciones de comunicacion para el recurso target.
- Utilizando curl
  * curl -v
![Capture6](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture6.PNG)
  * curl -i
![Capture7](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture7.PNG)
  * Diferencias entre parametros:
    * curl -v se utiliza para obtener el encabezado de la solicitud y su respuesta.
    * curl -i se utiliza para incluir el encabezado de la direccion remota en el output.
## Parte 2. Haciendo una Aplicacion Web Dinamica a Bajo Nivel
- Creacion de proyecto maven utilizando el arquetipo de aplicacion web estandar.
![Capture8](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture8.PNG)
![Capture9](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture9.PNG)

- En el pom.xml, modifique la propiedad "packaging" con el valor "war".
![Capture10](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture10.PNG)

- Compile y ejecute la aplicación en el servidor embebido Tomcat.
![Capture11](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture11.PNG)
![Capture12](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture12.PNG)

- Abra un navegador, y en la barra de direcciones ponga la URL con la cual se le enviarán peticiones al ‘SampleServlet’. Tenga en cuenta que la URL tendrá como host ‘localhost’, como puerto, el configurado en el pom.xml y el path debe ser el del Servlet. Debería obtener un mensaje de saludo.
![Capture13](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture13.PNG)
![Capture14](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture14.PNG)
![Capture15](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture15.PNG)

- Busque el artefacto gson en el repositorio de maven y agregue la dependencia.
![Capture16](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture16.PNG)

- En el navegador revise la dirección https://jsonplaceholder.typicode.com/todos/1. Intente cambiando diferentes números al final del path de la url.
![Capture17](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture17.PNG)

- Basado en la respuesta que le da el servicio del punto anterior, cree la clase edu.eci.cvds.servlet.model.Todo con un constructor vacío y los métodos getter y setter para las propiedades de los "To Dos" que se encuentran en la url indicada.
![Capture18](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture18.PNG)

- Cree una clase que herede de la clase HttpServlet (similar a SampleServlet), y para la misma sobrescriba el método heredado doGet. Incluya la anotación @Override para verificar –en tiempo de compilación- que efectivamente se esté sobreescribiendo un método de las superclases.
![Capture19](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture19.PNG)

- A continuación, se muestra que compiló correctamente y algunas pruebas:
![Capture20](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture20.PNG)
![Capture21](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture21.PNG)
![Capture22](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture22.PNG)
![Capture23](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture23.PNG)

