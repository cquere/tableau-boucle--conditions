package fr.diginamic;

import java.util.Arrays;

public class TestArrayTri {
	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int i = 0;
		int y;
		int tmp;

		while ((i + 1) < array.length) {
			y = i + 1;
			while (y < array.length) {
				if (array[i] > array[y]) {
					tmp = array[i];
					array[i] = array[y];
					array[y] = tmp;
				}
				y++;
			}
			i++;
		}

		System.out.println("Step 1 :");
		i = 0;
		while (i < array.length) {
			System.out.println("array[" + i + "] = " + array[i]);
			i++;
		}
		
		
		int[] array2 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		Arrays.sort(array2);
		System.out.println("Step 2 :");
		i = 0;
		while (i < array.length) {
			System.out.println("array[" + i + "] = " + array[i]);
			i++;
		}
	}

}
