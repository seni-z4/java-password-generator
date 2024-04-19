package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#inzio la generazione della programma#");
		
		/*creare dei variabli nome cognome colore data di nascita(giorni,mesi,anno)
		 * 
		 * poi stapare il nome, cognome, colore, somma della data di nascita 
		 * 
		 * 
		 * */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci il tuo nome");
		String nome = input.nextLine();
		
		System.out.println("inserici il tuo cognome");
		String cognome = input.nextLine();
		
		System.out.println("inserici il tuo colore preferito");
		String colore = input.nextLine();
		
		System.out.println("inserici il tuo giorno di nascita");
		int giorno = input.nextInt();
		
		System.out.println("inserici il tuo mese di nascita");
		int mese = input.nextInt();
		
		System.out.println("inserici il tuo anno di nascita");
		int anno = input.nextInt();
		
		int sommaAnni = (giorno + mese+anno);
		System.out.println(sommaAnni);
		
		
		System.out.println("#password generato e#: " +nome+cognome+colore+sommaAnni);
		
	}
	
}
		