//Creado por Eduard Corral
public class Cavall extends Peces{
    private int posicionX;
    private int posicionY;
    public Cavall(String color) {
        if (color.equals("blanc") | color.equals("negre")) {
            setColor(color);
        }
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public void veureMoviments() {
        for (int i = getX()+1; i < 9 ; i++) {
            System.out.println(i);
        }

       
        for (int i = getX()-1;i > 0     ; i--) {
            System.out.println(i);
        }
    }
    public boolean movimentPossible(int posicioX, int posicioY){
        int xActual=getPosicionX();
        int yActual=getPosicionY();
        //Movimientos possibles caballo:
        //2 arriba uno a la derecha
        if(yActual+2==posicioY && xActual+1==posicioX && posicioX<=8 && posicioY<=8){
            return true;
        ////2 arriba uno a la izquierda
        }else if(yActual+2==posicioY && xActual-1==posicioX && posicioX<=8 && posicioY<=8){
            return true;
        //2 a la derecha uno arriba
        }else if(yActual+1==posicioY && xActual+2==posicioX && posicioX<=8 && posicioY<=8){
            return true;
        //2 a la derecha uno abajo
        }else if(yActual-1==posicioY && xActual+2==posicioX && posicioX<=8 && posicioY<=8){
            return true;
        //2 a la izquierda uno arriba
        }else if(yActual+1==posicioY && xActual-2==posicioX && posicioX<=8 && posicioY<=8){
            return true;
        //2 a la izquierda uno abajo
        }else if(yActual-1==posicioY && xActual-2==posicioX && posicioX<=8 && posicioY<=8){
            return true;
        //2 abajo uno a la derecha
        }else if(yActual-2==posicioY && xActual+1==posicioX && posicioX<=8 && posicioY<=8){
            return true;
        //dos abajo uno a la izquierda
        }else if(yActual-2==posicioY && xActual-1==posicioX && posicioX<=8 && posicioY<=8){
            return true;
        }else{
            return false;
        }
    }
    public void cambiarPos(int x,int y){
        if (movimentPossible(x,y)==true){
            setPosicionX(x);
            setPosicionY(y);
        }else{
            System.out.println("Movimiento no valido");
        }
    }














}
