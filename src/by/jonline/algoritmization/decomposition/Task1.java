package by.jonline.algoritmization.decomposition;

// 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного 
// двух натуральных чисел:

public class Task1 {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 28;

		if (a > 0 && b > 0) {
			System.out.println("НОД(" + a + ", " + b + ") = " + gcf(a, b));
			System.out.println("НОК(" + a + ", " + b + ") = " + lcm(a, b));
		} else {
			System.out.println("Error");
		}
		
		
	}

	public static int gcf(int a, int b) {
		
		int max = 1;

		for (int i = 2; i <= Math.min(a, b); i++) {
			
			if (a % i == 0 && b % i == 0) {
				max = i;
			}
		}
		
		return max;
	}
	
	public static int lcm(int a, int b) {
		
		return a * b / gcf(a, b);
	}

}
