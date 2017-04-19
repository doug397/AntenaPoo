package antena.logica.dominio;

import java.util.HashSet;
import java.util.Set;

public abstract class Antena  extends Host{
	
	private Set<Celular> celulares ;
	
	public Antena(String id, double potencia, double posX, double posY) {
		super(id, potencia, posX, posY);
		this.celulares = new HashSet<Celular>();
	}

	protected double getDistancia(double x, double y){
		return Math.sqrt(
				 Math.pow(this.getPosX() - x, 2) +
				 Math.pow(this.getPosY() - y, 2)
			   );		
	}
	
	public double getAlcance(){
		return Math.sqrt(this.getPotencia());
	}
	
	public boolean cobre(double x, double y) {
		return this.getDistancia(x, y) <= this.getAlcance();
	}

	public void dissociar(Celular celular) {
		this.celulares.remove(celular);
	}

	public void associar(Celular celular) {
		this.celulares.add(celular);
	}
	
	public abstract double getPotencia(double x, double y);
	
	
}
