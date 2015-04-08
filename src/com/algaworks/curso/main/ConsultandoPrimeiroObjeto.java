package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class ConsultandoPrimeiroObjeto {

	public static void main(String[] args){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class,1L);
//Arriba entre paréntesis (NombreDeLaClase.class,númeroDePrimaryKey)
/*la "L" al lado del número se pone porque la variable "código" del cliente, que
 equivale a la "Primary Key" de la tabla, es de tipo Long*/
		
		
		if (cliente != null) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Idade: " + cliente.getIdade());
			System.out.println("Profissao" + cliente.getProfissao());
			System.out.println("Sexo" + cliente.getSexo());
		}else{
			System.out.println("Cliente não encontrado");
		}
	}
}