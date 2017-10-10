package antena.logica.sessao;

import java.util.HashSet;
import java.util.Set;

import antena.logica.dominio.Antena;
import antena.logica.dominio.Celular;
import antena.logica.persistencia.AntenaDAOIF;
import antena.logica.persistencia.CelularDAOIF;
import antena.logica.persistencia.DBAntenaDAO;
import antena.logica.persistencia.DBCelularDAO;

public class HangoutApp {
	
	private AntenaDAOIF antenaDAO;
	private CelularDAOIF celularDAO;
	

	public HangoutApp(){
		this.antenaDAO=new DBAntenaDAO();
		this.celularDAO=new DBCelularDAO();
	}
	
	public void moverCelular(String id, double x, double y) throws Exception{
		Set<Antena> antenasCobrem = this.cobrem(x, y);
		double potencia = 0;
		Antena escolhido = null;
		Antena antenaEscolhida = null;
		Celular celular = this.celularDAO.buscarPeloId(id);
		
		for(Antena atual : antenasCobrem){
			if(atual.getPotencia(x, y) > potencia){
				escolhido = atual;
				potencia = atual.getPotencia(x, y);
			}	
		}
		
		antenaEscolhida = escolhido;
		
		celular.getAntena().dissociar(celular);
		celular.setAntena(antenaEscolhida);
		
		this.celularDAO.atualizar(celular);
		
		antenaEscolhida.associar(celular);
		this.antenaDAO.atualizar(antenaEscolhida);
		
		
	}
	
	
	public Set<Antena> cobrem(double x, double y) throws Exception{
		Set<Antena> todas = this.antenaDAO.buscarTodas();
		Set<Antena> hostsCobrem = new HashSet<Antena>();
		for(Antena atual : todas){
			if(atual.cobre(x, y))
				hostsCobrem.add(atual);
		}
		return hostsCobrem;
	}

	
	
}
