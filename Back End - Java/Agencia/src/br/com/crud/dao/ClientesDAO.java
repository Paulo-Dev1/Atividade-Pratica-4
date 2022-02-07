package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Clientes;
import br.com.crud.model.Destinos;
import br.com.crud.model.Hospedagens;


public class ClientesDAO {
	
	public void save(Clientes cliente) {
		/*
		 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Clientes (Nome, Idade, CPF, Telefone, Endereco, DestinoId_destino, HospedagemId_hospedagem)" + "VALUES(?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parámetro da sql
			pstm.setString(1, cliente.getNome());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setInt(2, cliente.getIdade());

			// Adicionar o valor do terceiro parâmetro da sql
			pstm.setInt(3, cliente.getCPF());
			
			pstm.setString(4, cliente.getTelefone());
			
			pstm.setString(5, cliente.getEndereco());
			
			pstm.setInt(6, cliente.getId_Destino());
			
			pstm.setInt(7, cliente.getId_Hospedagem());
			
			

			// Executar a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conexões
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
		String sql = "DELETE FROM Clientes WHERE Id = ?";

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

	public void update(Clientes cliente) {
		String sql = "UPDATE Clientes SET Nome = ?, Idade = ?, CPF = ?, Telefone = ?, Endereco = ?, DestinoId_destino = ?, HospedagemId_hospedagem = ? WHERE Id_Cliente = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro parâmetro da sql
			pstm.setString(1, cliente.getNome());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setInt(2, cliente.getIdade());

			// Adicionar o valor do terceiro parâmetro da sql
			pstm.setInt(3, cliente.getCPF());

			pstm.setString(4, cliente.getTelefone());
			
			pstm.setString(5, cliente.getEndereco());
			
			pstm.setInt(6, cliente.getId_Destino());
			
			pstm.setInt(7, cliente.getId_Hospedagem());
			
			pstm.setInt(8, cliente.getId_Cliente());
			
			
			

			// Executa a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexões
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

	public List<Clientes> getClientes() {

		String sql = "select * from Clientes as l inner join Destinos as a on l.DestinoId_destino = a.Id_Destino inner join Hospedagens as e on l.HospedagemId_hospedagem = e.Id_Hospedagem";

		List<Clientes> clientes = new ArrayList<Clientes>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {
				Clientes cliente = new Clientes();
				Destinos destino = new Destinos();
				Hospedagens hospedagem = new Hospedagens();
				
				// Recupera o id do banco e atribui ele ao objeto
				cliente.setId_Cliente(rset.getInt("Id_Cliente"));

				
				cliente.setNome(rset.getString("Nome"));

				
				cliente.setIdade(rset.getInt("Idade"));
				
				cliente.setCPF(rset.getInt("CPF"));
				
				cliente.setTelefone(rset.getString("Telefone"));
				
				cliente.setEndereco(rset.getString("Endereco"));
				
				// parte do Destinos
				
				destino.setId_Destino(rset.getInt("Id_Destino"));
				destino.setCidade(rset.getString("Cidade"));
				destino.setPais(rset.getString("Pais"));
				
				cliente.setDestino(destino);
				
				//Parte da Hospedagens
				hospedagem.setId_Hospedagem(rset.getInt("Id_Hospedagem"));
				hospedagem.setTipo_Hospedagem(rset.getString("Tipo_hospedagem"));
				hospedagem.setData_Entrada(rset.getString("Data_Entrada"));
				hospedagem.setData_Saida(rset.getString("Data_Saida"));
				
				cliente.setHospedagem(hospedagem);
				
				// Adiciona o contato recuperado, a lista de contatos
				clientes.add(cliente);
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
		return clientes;
	}
}
