package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
		
		public static Connection createConnectionSQLServer() throws Exception {
			// Faz com que a classe seja carregada pela JVM
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			
			
			
			// Cria a conexão com o banco de dados ----------------------- COM senha
			 Connection connection = DriverManager.getConnection(
					"jdbc:sqlserver://DESKTOP-0IIS626;databaseName=Fly_Turismo;", "sa", "Mi61606182");
			
		
			
			return connection;
		}
		public static void main(String[] args) throws Exception{
			// Recupera uma conexão com o banco de dados
			Connection con = createConnectionSQLServer();
			// Testa se a conexão é nula
			if (con != null) {
				System.out.println("Conexão obtida com sucesso! " + con);
				con.close();
			}
		}
}
