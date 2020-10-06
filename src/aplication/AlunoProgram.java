package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

// obs: manter a logica de aprovação no programa e não na entidade aluno, fazendo a correta delegação de responsabilidade

public class AlunoProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();

		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		if (aluno.notaFinal() < 60) {
			System.out.println("FINAL GRADE = " + aluno.notaFinal());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINS", aluno.pontosFaltantes());
		} else {
			System.out.println("FINAL GRADE = " + aluno.notaFinal());
			System.out.println("PASS");
		}

		sc.close();

	}

}
