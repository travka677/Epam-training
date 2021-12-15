package by.jonline.algoritmization.decomposition;

// 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6 {

	public static void main(String[] args) {
		
		int[] numbers = { 7, 9, 14 };
		
		System.out.println(isCoprimeNumbers(numbers));
	}
	
	public static boolean isCoprimeNumbers(int[] numbers) {
		
		return Task2.gcf(numbers) == 1;
	}

}
