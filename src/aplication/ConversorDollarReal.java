package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ConversorDollarReal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?: ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought?:");
		double qdeDollar = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.converter(qdeDollar, dollar)));
		
		sc.close();

	}

}
