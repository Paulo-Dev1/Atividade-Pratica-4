package br.com.crud.model;

public class Clientes {

	private int Id_Cliente;
	private String Nome;
	private int Idade;
	private int CPF;
	private String Telefone;
	private String Endereco;
	
	private int Id_Destino;
	private Destinos Destino;
	
	private int Id_Hospedagem;
	private Hospedagens Hospedagem;
	
	public int getId_Cliente() {
		return Id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		Id_Cliente = id_Cliente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public int getId_Destino() {
		return Id_Destino;
	}
	public void setId_Destino(int id_Destino) {
		Id_Destino = id_Destino;
	}
	public Destinos getDestino() {
		return Destino;
	}
	public void setDestino(Destinos destino) {
		Destino = destino;
	}
	public int getId_Hospedagem() {
		return Id_Hospedagem;
	}
	public void setId_Hospedagem(int id_Hospedagem) {
		Id_Hospedagem = id_Hospedagem;
	}
	public Hospedagens getHospedagem() {
		return Hospedagem;
	}
	public void setHospedagem(Hospedagens hospedagem) {
		Hospedagem = hospedagem;
	}
	
	
	
	
}
