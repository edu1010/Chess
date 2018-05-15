public class Jugador {
	private String Email;
	private String ColorPeça;
	private int Puntuació;
	private int PartidasGuanyadas;
	
	public Jugador(String Email, String ColorPeça) {
		super();
		setEmail(Email);
		setColorPeça(ColorPeça);
	}
	
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		if (Email.contains("@") && Email.contains(".") ) {
			this.Email = Email;
		}
		if (!Email.contains("@") && !Email.contains(".")) {
			this.Email = "Pordefecto@Pordefecto.com";
		}
	}

	public String getColorPeça() {
		return ColorPeça;
	}

	public void setColorPeça(String ColorPeça) {
		
		if (ColorPeça.equalsIgnoreCase("blanco") || ColorPeça.equalsIgnoreCase("negro")) {
			this.ColorPeça = ColorPeça;
		}
		
		if (!ColorPeça.equalsIgnoreCase("blanco") || !ColorPeça.equalsIgnoreCase("negro")) {
			this.ColorPeça = "Blanco";
		}
		
	}

	public int getPuntuació() {
		return Puntuació;
	}

	public void setPuntuació(int Puntuació) {
		
		if (Puntuació > 0) {
			this.Puntuació = Puntuació;
		}
		
		if (Puntuació < 0) {
			this.Puntuació = 0;
		}
	}

	public int getPartidasGuanyadas() {
		return PartidasGuanyadas;
	}

	public void setPartidasGuanyadas(int PartidasGuanyadas) {
		if (PartidasGuanyadas > 0) {
			this.PartidasGuanyadas = PartidasGuanyadas;
		}
		
		if (PartidasGuanyadas < 0) {
			this.PartidasGuanyadas = 0;
		}
	}
	
	public String ComprobarPeça(String Peça) {
		if (Peça.equalsIgnoreCase("Rei")) {
			return "Rei";
		}
		
		if (Peça.equalsIgnoreCase("dama")) {
			return "Dama";
		}
		
		if (Peça.equalsIgnoreCase("peon")) {
			return "Peón";
		}
		
		if (Peça.equalsIgnoreCase("alfil")) {
			return "Alfil";
		}
		
		if (Peça.equalsIgnoreCase("torre")) {
			return "Torre";
		}
		
		if (Peça.equalsIgnoreCase("caballo")) {
			return "Caballo";
		}
		
		return Peça;
	}
	
	public void
	biarPos(String Peça,int x,int y) {
		
	}
	

}
