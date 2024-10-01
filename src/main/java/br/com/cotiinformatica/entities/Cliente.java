package br.com.cotiinformatica.entities;

import java.util.Date;
import java.util.UUID;

public class Cliente {
	
	private UUID id;
	private String nome;
	private String email;
	private String telefone;
	private Date datacadastro;
	
	public Cliente(){
		
		
	}
	public Cliente(UUID id, String nome, String email, String telefone, Date datacadastro){
		
		
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDatacadastro() {
		return datacadastro;
	}
	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", datacadastro=" + datacadastro + "]";
	}


}
