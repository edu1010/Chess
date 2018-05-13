//Creado por Eduard Corral
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
         Pattern patron;
         //expresio regular treta de: http://librosweb.es/foro/pregunta/228/validando-direcciones-de-email-con-expresiones-regulares/
        patron = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$");
        // creamos el Matcher a partir del patron
        Matcher encaja = patron.matcher(email);
        // retornara el email si pasa el patro
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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        Jugador jugador1=new Jugador(IntroducirEmail(),IntroducirColor());
        Jugador jugador2=new Jugador(IntroducirEmail(),IntroducirColor());
        Tauler tauler1=new Tauler();
        String peça;
        String texto;
        int x;
        int y;
        tauler1.imprimirTablero();
        while (true){
            if(tauler1.acabarPartida()==true){
                break;
            }
            System.out.println("Que peça vol moure");
            peça = reader.readLine();
            System.out.println("Posicio x");
            texto= reader.readLine();
            x = Integer.parseInt(texto);
            System.out.println("Posicio y");
            texto= reader.readLine();
            y = Integer.parseInt(texto);
            jugador1.cambiarPos(peça,x,y);
            jugador2.cambiarPos(peça,x,y);
            tauler1.imprimirTablero();
        }






    }

}
