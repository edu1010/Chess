//Creado por Eduard Corral
public class Cavall extends Peces{
    private int posicionX;
    private int posicionY;
    public Cavall(String color) {
        if (color.equals("blanc") | color.equals("negre")) {
            setColor(color);
        }
    }
   
    public void veureMoviments() {
        for (int i = getX()+1; i < 9 ; i++) {
            System.out.println(i);
        }
       
        for (int i = getX()-1;i > 0     ; i--) {
            System.out.println(i);
        }
    }
}
