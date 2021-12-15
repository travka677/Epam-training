package by.jonline.algoritmization.decomposition;

// 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {

	public static void main(String[] args) {
		
		System.out.println(factorial());

	}

	public static int factorial() {
		
		int fact = 1;
		int sum = 1;
		
		for (int i = 3; i <= 9; i += 2) {
			for (int j = 2; j < i; j++) {
				fact *= j;
			}
			sum += fact;
			fact = 1;
		}
		
		return sum;
	}
}
