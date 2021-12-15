package by.jonline.algoritmization.decomposition;

// 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

public class Task10 {

	public static void main(String[] args) {
		
		int n = 2346023;
		
		print(breakNumber(n));
	}
	
	public static int length(int n) {
		
		int length = 0;
		while (n > 0) {
			n /= 10;
			length++;
		}
		
		return length;
	}
	
	public static int[] breakNumber(int n) {
		
		int[] array = new int[length(n)];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = n % 10;
			n /= 10;
		}
		
		return array;
	}
	
	public static void print(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
