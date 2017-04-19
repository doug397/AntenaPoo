package antena.logica.dominio;

public class AntenaDirecional extends Antena{
	private int quadrante;

	
	
	public AntenaDirecional(String id, double potencia, double posX, double posY, int quadrante) {
		super(id, potencia, posX, posY);
		this.quadrante = quadrante;
	}

	@Override
	public boolean cobre(double x, double y) {
		if(!super.cobre(x, y))
			return false;
		return ((this.getQuadrante() == 1 &&  x >= this.getPosX() && y >= this.getPosY()) ||
				(this.getQuadrante() == 2 &&  x <= this.getPosX() && y >= this.getPosY()) ||
				(this.getQuadrante() == 3 &&  x <= this.getPosX() && y <= this.getPosY()) ||
				(this.getQuadrante() == 4 &&  x >= this.getPosX() && y <= this.getPosY()));
	}
	
	@Override
	public double getAlcance(){
		return 2 * super.getAlcance();
	}

	public int getQuadrante() {
		return quadrante;
	}

	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}
	
	
	public double getPotencia(double x, double y){
		return 2.0 / Math.pow(this.getDistancia(x, y), 2);
	}
	
	
	
	
}
