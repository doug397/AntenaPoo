package antena.logica.persistencia;

import antena.logica.dominio.Celular;

public interface CelularDAOIF {
	
	public Celular buscarPeloId(String id) throws Exception;
	public void atualizar(Celular celular) throws Exception;

}
