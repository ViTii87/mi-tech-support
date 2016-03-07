import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random rnd;
    private ArrayList<String> respuestas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        this.rnd = new Random();
        this.respuestas = new ArrayList<>(Arrays.asList("Tienes problemas de conexion","Cual es tu problema","Necesitas reiniciar","Puedo ayudarte en algo?","Tenemos excelentes servidores."));
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String palabra)
    {
        String respuesta = respuestas.get(rnd.nextInt(respuestas.size()));
        int i = 0;
        boolean encontrado = false;
        while(i < respuestas.size() && !encontrado){
            if (respuestas.get(i).contains(palabra)){
                respuesta = respuestas.get(i);
                encontrado = true;
            }
            i++;
        }
        return respuesta;
    }
}
