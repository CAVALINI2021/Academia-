package br.com.academia.model;

import java.time.LocalDate;
import java.time.Period;


public class Academia {

	
		private String nome;
		private double peso;
		private double altura;
		private char sexo;
		private LocalDate dataNascimento;
		private NivelAtividade nivelAtividade;

		
		//NOME
		public void setNome(String nome) {
			this.nome = nome;
			
		}
		
		public String getNome() {
			return this.nome;
		}	
		
		//NIVEL DE ATIVIDADE
		public void setNivelAtividade(NivelAtividade nivelAtividade) {
			this.nivelAtividade = nivelAtividade;
			
		}
		
		public NivelAtividade getNivelAtividade() {
			return this.nivelAtividade;
		}	
		
		// PESO
		public void setPeso(double peso) {
			this.peso = peso;
			
		}
		
		public double getPeso() {
			return this.peso;
		}	
		
		
		
		//ALTURA 
		public void setAltura(double altura) {
			this.altura = altura;
			
		}
		
		public double getAltura() {
			return this.altura;
		}	
		
		
		//SEXO
		
		public void setSexo(char sexo) {
			this.sexo = sexo;
			
		}
		
		public void getSexo(char sexo) {
			 this.sexo = sexo;
		}	
		
		
		
		// DATA DE NASCIMENTO
		public void  setDataNascimento (LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
			
		}
		
		public LocalDate getDateNascimento() {
			return dataNascimento;
		}	
		
		//IDADE
		public int getIdade() {
			LocalDate hoje = LocalDate.now();
			Period period = Period.between(this.dataNascimento, hoje);
			return period.getYears();
		}
		
		
		// CALCULAR IMC
		
		public double getImc() {
			
			return this.peso / Math.pow(this.altura, 2);
		}	
		
		
		public String getStatusImc() {
			if (this.getImc() < 18.5) {
				return " Abaixo do Peso";
			} else if (this.getImc() > 18.5 && this.getImc() <25) {
				return " Peso ideal";
			} else if (this.getImc() >= 25 && this.getImc() < 30) {
				return " Levemente Acima do peso";
			} else if (this.getImc() >= 30 && this.getImc() < 35) {
				return " Obesidade Grau 1";
			} else if (this.getImc() >= 35 && this.getImc() < 40) {
				return " Obesidade Grau 2";
			} else {
				return " Obesidade Grau 3";
			}	
			
			}
			
		
		// CALCULAR NCD 
		
		public double getNcd() {
			double ncd = 0;
			
			if (this.sexo == 'M') {
				
			if (this.getIdade() >= 18 && this.getIdade() < 31) {
				ncd = 15.3 + this.peso + 679;
			} else if (this.getIdade() >= 31 && this.getIdade() <= 60) {
				ncd = 11.6 + this.peso + 879;
			} else {
				ncd= 13.5 + this.peso + 487;
			}
			
			if (this.nivelAtividade == nivelAtividade) {
				ncd += 1.5;
			}
			}
		
		
		}
		
		
		}
		

		
		
	

