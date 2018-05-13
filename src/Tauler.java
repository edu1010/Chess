
public class Tauler {
	private int tamany=8;
	
	private Peces[][] tauler;
	private Peces[][] taulerescacs = {
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
	
	private boolean acabarPartida(Peces Rei) {
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
	
}
