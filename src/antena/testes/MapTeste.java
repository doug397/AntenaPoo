package antena.testes;

import java.util.HashMap;
import java.util.Map;

import antena.logica.dominio.Celular;

public class MapTeste {
	
	private Map<String, Celular> celulares;
	
	
	public void run(){
		this.celulares = new HashMap<String, Celular>();
		
		Celular c1 = new Celular("1", 100, 10, 10);
		Celular c2 = new Celular("2", 200, 20, 20);
		Celular c3 = new Celular("3", 300, 30, 30);
		
		this.celulares.put("1", c1);
		this.celulares.put("2", c2);
		this.celulares.put("3", c3);		
		
		Celular cel = this.celulares.get("3");
		
		System.out.println(cel);
		
		
	}
	
	public static void main(String[] args) {
		(new MapTeste()).run();
	}

}
