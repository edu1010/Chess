import java.io.*;
import java.util.regex.*;

public class partida {
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
    public static String IntroducirColor()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String color;
        System.out.println("Introduce el color");
        color = reader.readLine();
        //Comprobacio per garantizar que sigui un color valid
        String colorCorrecte=comprovarColorPeça(color);
        while(colorCorrecte.equals("Color no valid")){
            System.out.println("Color no valido, vulva a introducirlo");
            color = reader.readLine();
            colorCorrecte=comprovarColorPeça(color);

        }
        return colorCorrecte;
    }
    public static String IntroducirEmail()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String email;
        System.out.println("Introduce tu email");
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
        return emailCorrecte;
    }

    public static void main(String[] args)throws IOException {




        Jugador jugador1=new Jugador(IntroducirEmail(),IntroducirColor());
        Jugador jugador2=new Jugador(IntroducirEmail(),IntroducirColor());
        Tauler tablero1=new Tauler();






    }

}
