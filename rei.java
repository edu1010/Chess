public class rei /*extends peces*/ {
    private int posicionX;
    private int posicionY;
    public rei(int posicionX, int posicionY) {
        cambiarPos(posicionX,posicionY);
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

    public boolean movimentPossible(int posicioX, int posicioY){
        int xActual=getPosicionX();
        int yActual=getPosicionY();
        if((xActual+1==posicioX && yActual==posicioY && posicioX<=8 && posicioY<=8 )||(xActual-1==posicioX && yActual==posicioY && posicioX<=8 && posicioY<=8)||(yActual+1==posicioY && xActual==posicioX && posicioX<=8 && posicioY<=8)||(yActual-1==posicioY && posicioX==xActual && posicioX<=8 && posicioY<=8)||(yActual+1==posicioY && (xActual+1==posicioX ||xActual-1==posicioX)&& posicioX<=8 && posicioY<=8)||(yActual-1==posicioY &&(xActual+1==posicioX ||xActual-1==posicioX)&& posicioX<=8 && posicioY<=8 )){
            //getPosicionTablero(posicioX,posicioY)
            return true;
        }else {
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
