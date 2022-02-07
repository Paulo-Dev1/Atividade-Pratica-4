package br.com.crud.teste;
import java.util.Date;

import br.com.crud.dao.ClientesDAO;
import br.com.crud.dao.DestinosDAO;
import br.com.crud.model.Destinos;


public class DestinoCrud {

	public static void main(String[] args) {
		DestinosDAO destinosDAO = new DestinosDAO();
		
		// ------------ Cria um contato e salva no banco
		Destinos destino = new Destinos();
		destino.setCidade("NY");
		destino.setPais("EUA");
		
		
		
		destinosDAO.save(destino);
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		//Destinos destino1 = new Destinos();
		//destino1.setId_Destino(1);
		//destino1.setCidade("Salvador");
		//destino1.setPais("Brasil");
		
		
		//destinosDAO.update(destino1);
		
		// ------------ Remove o contato com id
		//destinosDAO.removeById(2);
		
		// ------------ Lista todos os contatos do banco de dados
		//for (Destinos c : destinosDAO.getDestinos()) {
			//System.out.println("----------------");
			//System.out.println("Cidade: " + c.getCidade());
			//System.out.println("País: " + c.getCidade());
			//System.out.println("-------------------");
			
		//}
	}
}
