package aplication;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rented = new Rent[10];
		
		System.out.print("Insira quantos estudantes vao alugar quartos: ");
		int n = sc.nextInt();
		while (n > 10) {
			System.out.println("Por favor insira um numero menor do que 10");
			n = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			while(room >= 10) {
				System.out.println("Insira um numero de quarto menor do que 10");
				room = sc.nextInt();
			}
			
			rented[room] = new Rent(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < rented.length; i++) {
			if(rented[i] != null) {
				System.out.println(rented[i].room + ": " + rented[i].name + ", " + rented[i].email);
			}
		}
		sc.close();
	}
}
