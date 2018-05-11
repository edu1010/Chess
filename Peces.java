package ajedrez;
//Creado por Jordi Casalí
public class Peces {
	private String color;
	private int x;
	private int y;
	
	public Peces() {
		this.color="blanc";
		this.x=2;
		this.y=1;
	}
	
	public Peces(String color, int x, int y) {
		if (color.equals("blanc") | color.equals("negre")) {
			this.color=color;
		}
		if (x>0 & x<9) {
			this.x=x;
		}
		if (y>0 & y<9) {
			this.y=y;
		}
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void veureMoviement(int x,int y) {
		
	}
	
}
