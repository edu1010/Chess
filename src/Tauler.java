
public class Tauler {
	private int tamany=8;
	
	private enum Color{ Blanc("blanc"), Negre("negre");
		String colors;
		Color(String colors){
			this.colors = colors;
		}
	}
	
	private Peces[][] taulerescacs = {
            { new Torre(Blanc), new Cavall(WHITE), new Alfil(WHITE),
                new Dama(WHITE), new Rei(WHITE), new Alfil(WHITE),
                new Cavall(WHITE), new Torre(WHITE) },
        { new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE),
                new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE),
                new Pawn(WHITE), new Pawn(WHITE) },
        { null, null, null, null, null, null, null, null },
        { null, null, null, null, null, null, null, null },
        { null, null, null, null, null, null, null, null },
        { null, null, null, null, null, null, null, null },
        { new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK),
                new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK),
                new Pawn(BLACK), new Pawn(BLACK) },
        { new Rook(BLACK), new Cavall(BLACK), new Alfil(BLACK),
                new Dama(BLACK), new Rei(BLACK), new Alfil(BLACK),
                new Cavall(BLACK), new Torre(BLACK) } };
	};
	
	public Tauler() {
		for (int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				
			}
		}
	}
	
	private String detectarGuanyador() {
		return "blanc";
	}
	
	private boolean acabarPartida() {
		return true;
	}
	
	public boolean torn() {
		return true;
	}
	
}
