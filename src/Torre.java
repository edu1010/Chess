//Creado por Jordi Casalí
public class Torre extends Peces{
   
    public Torre(String color) {
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
