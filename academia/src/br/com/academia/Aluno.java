package br.com.academia;

import java.time.LocalDate;

import br.com.academia.model.Academia;

public class Aluno {
	
	public static void main (String args[]) {
		
	Academia nome = new Academia();
	nome.setNome("Alice Cavalini");
	nome.setSexo('F');
	nome.setPeso(68);
	nome.setAltura(1.68);
	nome.setDataNascimento(LocalDate.of(2004, 10, 21));
	System.out.println("Nome: " + nome.getNome());
	System.out.println("Imc: " + nome.getImc());
	System.out.println("Status: " + nome.getStatusImc());
	
	

	}
}
