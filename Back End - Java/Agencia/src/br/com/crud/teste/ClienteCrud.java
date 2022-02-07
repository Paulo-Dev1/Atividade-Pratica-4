package br.com.crud.teste;
import java.util.Date;

import br.com.crud.dao.ClientesDAO;
import br.com.crud.dao.DestinosDAO;
import br.com.crud.model.Clientes;
import br.com.crud.model.Destinos;


public class ClienteCrud {

	public static void main(String[] args) {
		ClientesDAO clientesDAO = new ClientesDAO();
		
		// ------------ Cria um Cliente e salva no banco
		//Clientes cliente = new Clientes();
		//cliente.setNome("NY");
		//cliente.setIdade(18);
		//cliente.setCPF(999999);
		//cliente.setTelefone("(21) 99999-9999");
		//cliente.setEndereco("Rua A2");
		
		//cliente.setId_Destino(1);
		//cliente.setId_Hospedagem(1);
		
		
		
		
		
		//clientesDAO.save(cliente);
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		//Clientes cliente = new Clientes();
		//cliente.setId_Cliente(1);
		//cliente.setNome("Marisvaldo");
		//cliente.setIdade(35);
		//cliente.setCPF(959845);
		//cliente.setTelefone("(11) 11111-1111");
		//cliente.setEndereco("Rua 402");
		
		//cliente.setId_Destino(1);
		//cliente.setId_Hospedagem(1);
		
		//clientesDAO.update(cliente);
		
		// ------------ Remove o contato com id
		//clientesDAO.removeById(2);
		
		// ------------ Lista todos os contatos do banco de dados
		for (Clientes l : clientesDAO.getClientes()) {
			System.out.println("----------------");
			System.out.println("=====CLIENTE======");
			System.out.println("Nome: " + l.getNome());
			System.out.println("Idade: " + l.getIdade());
			System.out.println("CPF: " + l.getCPF());
			System.out.println("Telefone: " + l.getTelefone());
			System.out.println("Endereço: " + l.getEndereco());
			System.out.println("=====DESTINO DO CLIENTE===");
			System.out.println("Cidade: "+ l.getDestino().getCidade());
			System.out.println("Pais: "+ l.getDestino().getPais());
			System.out.println("===HOSPEDAGEM DO CLIENTE====");
			System.out.println("Tipo de Hospedagem: "+ l.getHospedagem().getTipo_Hospedagem());
			System.out.println("Data de Entrada: "+ l.getHospedagem().getData_Entrada());
			System.out.println("Data de Saida: "+ l.getHospedagem().getData_Saida());
			System.out.println("-------------------");
			
			
		}
	}
}
