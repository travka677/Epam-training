package by.jonline.algoritmization.decomposition;

// 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

public class Task12 {

	public static void main(String[] args) {

		int k = 10;
		int n = 900;

		if (k > 0 && n > k) {
			print(createAnArray(k, n));
		} else {
			System.out.println("Некорректные данные");
		}
		
	}

	public static int[] createAnArray(int k, int n) {
		
		int a[] = new int[length(k, n)];

		int sum = 0;
		int index = 0;

		for (int i = k+1; i <= n; i++) {

			for (int j = i; j > 0; j /= 10) {
				sum += j % 10;
			}
			if (sum == k) {
				a[index++] = i;
			}
			sum = 0;
		}

		return a;
	}

	public static int length(int k, int n) {

		int sum = 0;
		int count = 0;

		for (int i = k+1; i <= n; i++) {

			for (int j = i; j > 0; j /= 10) {
				sum += j % 10;
			}
			if (sum == k) {
				count++;
			}
			sum = 0;
		}

		return count;
	}

	public static void print(int a[]) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
