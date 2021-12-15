package by.jonline.algoritmization.decomposition;

// 5. Составить программу, которая в массиве A[N] находит второе по величине число 
// (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

public class Task5 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 7, 4, 0};
		
		System.out.println(sec_max(numbers));
	}
	
	public static int sec_max(int[] numbers) {
		
		int max = numbers[0];
		int sec_max = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] > max) {
				sec_max = max;
				max = numbers[i];
			} else if (numbers[i] > sec_max) {
				sec_max = numbers[i];
			}
		}
		
		return sec_max;
	}
	
	

}
