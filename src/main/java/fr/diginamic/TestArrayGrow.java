package fr.diginamic;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrayGrow {

	public static void main(String[] args) {
		System.out.println("Choisissez une option :\n1. Ajouter un nombre\n2. Afficher les nombres existants.");
		int[] array = { 0 };
		int i;

		Scanner question = new Scanner(System.in);
		int a;
		while ((a = question.nextInt()) > 0) {
			if (a == 1) {
				System.out.println("Choisissez un nombre...");
				a = question.nextInt();

				array = Arrays.copyOf(array, (array.length + 1));
				array[array.length - 1] = a;
				System.out.println("Choisissez une option :\n1. Ajouter un nombre\n2. Afficher les nombres existants.");
			} else if (a == 2) {
				i = 1;
				while (i < array.length) {
					System.out.println("array[" + (i -1) + "] = " + array[i]);
					i++;
				}
				break;
			} else {
				System.out.println(
						"Mauvaise option, les options valides sont :\n1. Ajouter un nombre\n2. Afficher les nombres existants.");
			}
		}
	}
}
