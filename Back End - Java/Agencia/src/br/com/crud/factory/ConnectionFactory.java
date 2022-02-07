package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
		
		public static Connection createConnectionSQLServer() throws Exception {
			// Faz com que a classe seja carregada pela JVM
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			
			
			
			// Cria a conex�o com o banco de dados ----------------------- COM senha
			 Connection connection = DriverManager.getConnection(
					"jdbc:sqlserver://DESKTOP-0IIS626;databaseName=Fly_Turismo;", "sa", "Mi61606182");
			
		
			
			return connection;
		}
		public static void main(String[] args) throws Exception{
			// Recupera uma conex�o com o banco de dados
			Connection con = createConnectionSQLServer();
			// Testa se a conex�o � nula
			if (con != null) {
				System.out.println("Conex�o obtida com sucesso! " + con);
				con.close();
			}
		}
}
