package fr.diginamic;

public class TestArray2 {
	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int i = 0;
		int result = 0;
		while (i < array.length) {
			result += array[i];
			i++;
		}
		result = result / array.length;
		System.out.println("Step 1 :" + result);
		i = 0;
		while (array[i] != 15) {
			i++;
		}
		System.out.println("Step 2 : " + i);
		i = 0;
		result = 0;
		while (i < array.length) {
			int y = i;
			while (y < array.length) {
				if (array[y] == array[i] && y !=i){
					result++;
				}
				y++;
			}
			i++;
		}
		System.out.println("Step 3 : " + result);
	}
}

