package com.curvello.atendimento;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
	
	private Date dataNascimento;
	private String nome;
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calcularIdade() {
		
		Date novo =new Date();
		
		novo=LocalDate.now();
		
		int anos=(dataNascimento.getYear()-novo.getYear());
		
		return  ;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
