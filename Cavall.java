public class Cavall /*extends peces*/ {
    private int posicionX;
    private int posicionY;
    public Cavall(int posicionX, int posicionY) {
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
        if(){
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
