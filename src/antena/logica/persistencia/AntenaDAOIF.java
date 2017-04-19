package antena.logica.persistencia;

import java.util.Set;

import antena.logica.dominio.Antena;

public interface AntenaDAOIF {
	
	public Set<Antena> buscarTodas();
	public void atualizar(Antena antena);

}
