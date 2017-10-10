package antena.logica.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDAO {
	
	private static final String USER="root";
	private static final String SENHA="root";
	private static final String URL="jdbc:mysql://localhost/java";
	
	protected Connection getConexao() throws SQLException, ClassNotFoundException{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection conexao=(Connection) DriverManager.getConnection(URL,USER,SENHA);
		return conexao;
	}

}
