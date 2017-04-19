package antena.logica.dominio;

public class AntenaOmnidirecional extends Antena{
	
	public AntenaOmnidirecional(String id, double potencia, double posX, double posY) {
		super(id, potencia, posX, posY);
	}	
	
	public double getPotencia(double x, double y){
		return 1.0 / Math.pow(this.getDistancia(x, y), 2);
	}	

}
