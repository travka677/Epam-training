package by.jonline.algoritmization.decomposition;

// 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
// Для решения задачи использовать декомпозицию.

public class Task13 {

	public static void main(String[] args) {

		int n = 22;

		if (n > 2) {
			print(twinPrimes(n));
		} else {
			System.out.println("Некорректные данные");
		}
		
	}

	public static int[][] twinPrimes(int n) {

		int[][] twins = new int[length(n)][2];

		int index = 0;
		for (int i = n; i + 2 <= 2 * n; i++) {

			if (isPrime(i) && isPrime(i + 2)) {
				twins[index][0] = i;
				twins[index][1] = i + 2;
				index++;
			}
		}

		return twins;
	}

	public static boolean isPrime(int n) {
		
		for (int i = 2; i <= n / i; i++) {
			
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int length(int n) {

		int length = 0;

		for (int i = n; i + 2 <= 2 * n; i++) {

			if (isPrime(i) && isPrime(i + 2)) {
				length++;
			}
		}

		return length;
	}

	public static void print(int[][] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i][0] + " " + numbers[i][1]);
		}
	}

}
