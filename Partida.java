import java.io.*;
import java.util.regex.*;

public class Partida {
    public static String  comprovarColorPeça(String color){
        String colorDevolver="";
            if (color.equalsIgnoreCase("blanc")) {
                colorDevolver = "blanc";
                return colorDevolver;

            }
            if (color.equalsIgnoreCase("negre")) {
                colorDevolver = "negre";
                return colorDevolver;

            }else{
                return "Color no valid";
            }
    }

    public static String Email (String email){
        // compilamos el patron
         Pattern patron;
         //expresio regular treta de: http://librosweb.es/foro/pregunta/228/validando-direcciones-de-email-con-expresiones-regulares/
        patron = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$");
        // creamos el Matcher a partir del patron, la cadena como parametro
        Matcher encaja = patron.matcher(email);
        // invocamos el metodo replaceAll
        if (!(encaja.find())){
            return email;
        }else{
            return ("Email no valido");
        }


    }

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String color;
        color = reader.readLine();
        String email;
        email = reader.readLine();
        //Comprobacio per garantizar que sigui un email valid
        String emailCorrecte=Email(email);
        while(true){
            if(!(emailCorrecte.equals("Email no valido"))){
                break;
            }else{
                System.out.println("Email incorrecto, introduce un email correcto");
                email = reader.readLine();
                emailCorrecte=Email(email);
                }
        }
        //Comprobacio per garantizar que sigui un color valid
        String colorCorrecte=comprovarColorPeça(color);
        while(true){
            if(!(colorCorrecte.equals("Color no valid"))){
                break;
            }else{
                System.out.println("Color no valido, vulva a introducirlo");
                color = reader.readLine();
                colorCorrecte=comprovarColorPeça(color);
            }
        }
        Jugador jugador1=new Jugador(emailCorrecte,colorCorrecte);
        Jugador jugador2=new Jugador(emailCorrecte,colorCorrecte);
        Tauler tauler1=new Tauler();






    }

}
