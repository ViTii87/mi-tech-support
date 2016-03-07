import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
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
    private HashMap<String,String> respuestasMap;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        this.rnd = new Random();
        this.respuestas = new ArrayList<>(Arrays.asList("Tienes problemas de conexion","Cual es tu problema","Necesitas reiniciar","Puedo ayudarte en algo?","Tenemos excelentes servidores."));
        this.respuestasMap = new HashMap<>();
        
        respuestasMap.put("internet","Si no tienes internet prueba a apagar y encender el router");
        respuestasMap.put("conexion","Prueba a hacer ping al servidor.");
        respuestasMap.put("servidor","Tenemos excelentes servidores.");
        respuestasMap.put("pc","Puede ser que te hayas quedado sin disco duro.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String palabra)
    {
        String respuesta = respuestasMap.get(palabra);
        if(respuesta == null){
            respuesta = respuestas.get(rnd.nextInt(respuestas.size()));
        }
        return respuesta;
    }
}
