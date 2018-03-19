package fr.diginamic;

public class TestArray1 {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int i = 0;
		System.out.println("Step 1 :");
		while (i < array.length) {
			System.out.println("array[" + i + "] = " + array[i]);
			i++;
		}
		System.out.println("Step 2 :");
		while (i > 0) {
			i--;
			System.out.println("array[" + i + "] = " + array[i]);
		}
		System.out.println("Step 3 :");
		while (i < array.length) {
			
			if (array[i] > 3) {
				System.out.println("array[" + i + "] = " + array[i]);
			}
			i++;
		}
		i = 0;
		System.out.println("Step 4 :");
		while (i < array.length) {
			
			if ((array[i] % 2) == 0) {
				System.out.println("array[" + i + "] = " + array[i]);
			}
			i++;
		}
		System.out.println("Step 5 :");
		i = 0;
		int result = array[i];
		while ((i + 1) < array.length) {
			i++;
			if (array[i] > result) {
				result = array[i];		
				}
		}
		System.out.println("Greater number : " + result);
		System.out.println("Step 6 :");
		i = 0;
		while ((i + 1) < array.length) {
			i++;
			if (array[i] < result) {
				result = array[i];		
				}
		}
	}
}
