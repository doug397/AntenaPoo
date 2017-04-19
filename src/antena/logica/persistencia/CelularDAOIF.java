package antena.logica.persistencia;

import antena.logica.dominio.Celular;

public interface CelularDAOIF {
	
	public Celular buscarPeloId(String id);
	public void atualizar(Celular antena);

}
