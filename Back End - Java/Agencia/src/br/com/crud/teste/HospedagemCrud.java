package br.com.crud.teste;
import java.util.Date;

import br.com.crud.dao.ClientesDAO;
import br.com.crud.dao.DestinosDAO;
import br.com.crud.dao.HospedagensDAO;
import br.com.crud.model.Destinos;
import br.com.crud.model.Hospedagens;


public class HospedagemCrud {

	public static void main(String[] args) {
		HospedagensDAO hospedagensDAO = new HospedagensDAO();
		
		// ------------ Cria um contato e salva no banco
		//Hospedagens hospedagem = new Hospedagens();
		//hospedagem.setTipo_Hospedagem("Resort");
		//hospedagem.setData_Entrada("08/02/2022");
		//hospedagem.setData_Saida("09/02/2022");
		
		
		
		//hospedagensDAO.save(hospedagem);
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		//Hospedagens hospedagem = new Hospedagens();
		//hospedagem.setId_Hospedagem(1);
		//hospedagem.setTipo_Hospedagem("Cobertura");
		//hospedagem.setData_Entrada("03/02/2022");
		//hospedagem.setData_Saida("10/02/2022");
		
		
		//hospedagensDAO.update(hospedagem);
		
		// ------------ Remove o contato com id
		//hospedagensDAO.removeById(2);
		
		// ------------ Lista todos os contatos do banco de dados
		for (Hospedagens c : hospedagensDAO.getHospedagens()) {
			System.out.println("------------------------------");
			System.out.println("====HOSPEDAGEM===");
			System.out.println("Tipo de Hospedagem: " + c.getTipo_Hospedagem());
			System.out.println("Data de Entrada: " + c.getData_Entrada());
			System.out.println("Data de Saída: " + c.getData_Saida());
			System.out.println("------------------------------");
			
		}
	}
}
