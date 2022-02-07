package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Hospedagens;


public class HospedagensDAO {
	
	public void save(Hospedagens hospedagem) {
		/*
		 * Isso � uma sql comum, os ? s�o os par�metros que n�s vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Hospedagens (Tipo_Hospedagem, Data_Entrada, Data_Saida)" + "VALUES(?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conex�o com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro par�metro da sql
			pstm.setString(1, hospedagem.getTipo_Hospedagem());

			// Adicionar o valor do segundo par�metro da sql
			pstm.setString(2, hospedagem.getData_Entrada());

			// Adicionar o valor do terceiro par�metro da sql
			pstm.setString(3, hospedagem.getData_Saida());
			
			

			// Executar a sql para inser��o dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conex�es
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int id) {
		String sql = "DELETE FROM Hospedagens WHERE Id_Hospedagem = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Hospedagens hospedagem) {
		String sql = "UPDATE Hospedagens SET Tipo_Hospedagem = ?, Data_Entrada = ?, Data_Saida = ? WHERE Id_Hospedagem = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conex�o com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro par�metro da sql
			pstm.setString(1, hospedagem.getTipo_Hospedagem());

			// Adicionar o valor do segundo par�metro da sql
			pstm.setString(2, hospedagem.getData_Entrada());

			// Adicionar o valor do terceiro par�metro da sql
			pstm.setString(3, hospedagem.getData_Saida());
			
			pstm.setInt(4, hospedagem.getId_Hospedagem());

			// Executa a sql para inser��o dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conex�es
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Hospedagens> getHospedagens() {

		String sql = "SELECT * FROM Hospedagens";

		List<Hospedagens> hospedagens = new ArrayList<Hospedagens>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, fa�a
			while (rset.next()) {
				Hospedagens hospedagem = new Hospedagens();

				// Recupera o id do banco e atribui ele ao objeto
				hospedagem.setId_Hospedagem(rset.getInt("Id_Hospedagem"));

				// Recupera o nome do banco e atribui ele ao objeto
				hospedagem.setTipo_Hospedagem(rset.getString("Tipo_Hospedagem"));

				// Recupera a idade do banco e atribui ele ao objeto
				hospedagem.setData_Entrada(rset.getString("Data_Entrada"));
				
				hospedagem.setData_Saida(rset.getString("Data_Saida"));
				
				

				

				// Adiciona o contato recuperado, a lista de contatos
				hospedagens.add(hospedagem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return hospedagens;
	}
}
