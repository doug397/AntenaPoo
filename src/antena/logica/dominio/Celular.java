package antena.logica.dominio;

public class Celular extends Host{
	
	private Antena antena;

	public Celular(String id, double potencia, double posX, double posY) {
		super(id, potencia, posX, posY);
	}

	public Antena getAntena() {
		return this.antena;
	}

	public void setAntena(Antena antenaEscolhida) {
		this.antena = antenaEscolhida;
	}

	@Override
	public String toString() {
		return "Celular ["+ this.getId() + 
				"(" + this.getPosX() + "," + this.getPosY() + ")]";
	}
	
	

}
