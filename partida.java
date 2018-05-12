import java.io.*;
import java.util.regex.*;

public class partida {
    public static String  comprovarColorPeça(String color){
        String colorDevolver="";

        try {
            if (color.equalsIgnoreCase("blanc")) {
                colorDevolver = "blanc";
                return colorDevolver;

            }
            if (color.equalsIgnoreCase("negre")) {
                colorDevolver = "negre";
                return colorDevolver;

            }
        } catch (Exception e) {
            System.out.println("Color no valid");
        }

        return colorDevolver;
    }

    public static String EjemploReplaceAll (String email){
        // compilamos el patron
         Pattern patron = Pattern.compile("[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4}");
        // creamos el Matcher a partir del patron, la cadena como parametro
        Matcher encaja = patron.matcher(email);
        // invocamos el metodo replaceAll
        if (!(encaja.find())){
            return email;
        }else{
            System.out.println("Email no valido");
        }


    }







    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String color;
        color = reader.readLine();
        Jugador jugador1=new Jugador(setEmail(String email),comprovarColorPeça(String color));
        Jugador jugador2=new Jugador(setEmail(String email),comprovarColorPeça(String color));
        tablero tablero1=new tablero();






    }

}
