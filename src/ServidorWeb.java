import java.io.*;
import java.net.*;
import java.util.*;


public final class ServidorWeb
{
    public static void main (String argv[]) throws Excepton
    {
        //Número de puerto
        int puerto = 6789;

        //Establece el socket de escucha

        ServerSocket servidor = new ServerSocket(pueto);

        // Procesando las solicitudes HTTP en un ciclo infinito.
        while (true)
        {
            // Escuhando las solicitudes de conexión TCP.
            Socket cliente = servidor.accept();

            // Construye un objeto para procesar el mensaje de solicitud HTTP.
            SolicitudHttp solicitud = new SolicitudHttp(cliente);

            // Crea un nuevo hilo para procesar la solicitud.
            Thread hilo = new Thread(solicitud);

            // Inicia el hilo.
            hilo.start();
        }
    }
}
