
public class Tauler {
	private int tamany=8;
	
	private Peces[][] tauler;
	private static Peces[][] taulerescacs = {
            { new Torre("blanc"), new Cavall("blanc"), new Alfil("blanc"),new Dama("blanc"), new Rei("blanc"), new Alfil("blanc"), new Cavall("blanc"), new Torre("blanc") },
            { new Peo("blanc"), new Peo("blanc"), new Peo("blanc"),new Peo("blanc"), new Peo("blanc"), new Peo("blanc"),new Peo("blanc"), new Peo("blanc") },
            { null, null, null, null, null, null, null, null },
            { null, null, null, null, null, null, null, null },
            { null, null, null, null, null, null, null, null },
            { null, null, null, null, null, null, null, null },
            { new Peo("negre"), new Peo("negre"), new Peo("negre"),new Peo("negre"), new Peo("negre"), new Peo("negre"),new Peo("negre"), new Peo("negre") },
            { new Torre("negre"), new Cavall("negre"), new Alfil("negre"), new Dama("negre"), new Rei("negre"), new Alfil("negre"), new Cavall("negre"), new Torre("negre") } };
	
	public Tauler() {
		this.tauler=taulerescacs;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	/**
	private String detectarGuanyador() {
		*if (Rei("blanc")==null) {
			return "negre";
		}
		else {
		return "blanc";
		}
	}
	*/

	public boolean acabarPartida(Peces Rei) {
		if (Rei == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean torn() {
		return true;
	}
	
	public static void main() {
		for (int i=0;i<taulerescacs.length;i++) {
			for (int j=0;j<taulerescacs[i].length;j++)
				System.out.println(taulerescacs[i][j]);
		}
	}
	
}
