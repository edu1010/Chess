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



    public static void main(String[] args) {
        public jugador1=new Jugador(setEmail(String email,comprovarColorPeça(String color)));
        public jugador2=new Jugador(setEmail(String email,setColorPeça(String color)));
        public tablero1=new tablero();

    }

}
