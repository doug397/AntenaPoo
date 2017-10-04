package antena.logica.persistencia;

import java.util.Set;

import antena.logica.dominio.Antena;

public interface AntenaDAOIF {

	
	public Set<Antena> buscarTodas() throws Exception;
	public void atualizar(Antena antena) throws Exception;
	public Antena buscarPeloId(String id) throws Exception;	
	

}
