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
- El servidor embebido Tomcat esta configurado para el Puerto TCP/IP 8080
- Compilando y ejecutando.
![Capture11](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture11.PNG)
![Capture12](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture12.PNG)

- Abriendo en navegador.
![Capture13](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture13.PNG)
![Capture14](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture14.PNG)
![Capture15](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture15.PNG)

- Agregando dependencias gson.
![Capture16](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture16.PNG)

- En el navegador revise la dirección https://jsonplaceholder.typicode.com/todos/1. Intente cambiando diferentes números al final del path de la url.
![Capture17](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture17.PNG)

- Creando los getters y setters.
![Capture18](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture18.PNG)

- Clase que hereda a HttpServlet
![Capture19](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture19.PNG)

- Compilando y probando.
![Capture20](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture20.PNG)
![Capture21](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture21.PNG)
![Capture22](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture22.PNG)
![Capture23](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture23.PNG)

## Parte 3.

![Capture24](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture24.PNG)
![Capture25](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture25.PNG)
![Capture26](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture26.PNG)

- Con el metodo GET, es necesario poner el parametro y valor del ID.

# Parte 4. FRAMEWORKS WEB MVC – JAVA SERVER FACES / PRIME FACES

A continuación se muestran las pruebas de la parte 4, incluyendo modificaciones en partes de código requeridas.
![Capture27](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture27.PNG)
![Capture28](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture28.PNG)
![Capture29](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture29.PNG)
![Capture30](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture30.PNG)
![Capture31](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture31.PNG)
![Capture32](https://github.com/luis-amaya/CVDS_Lab05/blob/main/images/Capture32.PNG)
- Diferencia entre SessionScoped y ApplicationScoped: No se encontro una diferencia notable durante la ejecucion 

