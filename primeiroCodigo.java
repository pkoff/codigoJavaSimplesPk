package principal;

import java.util.Scanner;

// Faça um programa em java que receba um salario;
// e o nome de uma pessoa e;
// ao final dê 20% de aumento se for ímpar;
// 40% se for par;
// e imprima o novo salario;

public class CalculaSalario {
	public static void main(String[] args) {
		// NomeClasse variavel = new NomeClasse(parametros);
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o nome da pessoa:");
		String nome = leitor.nextLine();

		System.out.print("Digite o salario:");
		double salario = leitor.nextDouble();

		System.out.println("Nome: " + nome + ", Salario: " + salario);

		double salarioAumentado = salario;
		
		if (salario % 2 == 0) 
		{
			salarioAumentado *= 1.2;
		} 
		else if (salario != 0) 
		{
			salarioAumentado *= 1.5;
		}

		System.out.println("Salario aumentado: " + salarioAumentado);
	}
}
