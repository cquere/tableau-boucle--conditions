package fr.diginamic;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		System.out.println("Veuillez choisir un rang N de la suite de Finobacci...");
		Scanner question = new Scanner(System.in);
		int a = question.nextInt();

		long[] array = { 0, 1 };
		long tmp;

		for (int i = 0; i < a; i++) {
			tmp = array[1];
			array[1] += array[0];
			array[0] = tmp;
		}
		System.out.println("Le nombre correspondant au rang " + a + "de la suite de Finobacci est " + array[0]);

	}

}
