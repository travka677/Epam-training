package by.jonline.algoritmization.decomposition;

import java.util.Arrays;

// 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность 
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task15 {

	public static void main(String[] args) {
		
		int n = 3;
		
		if (n > 0 && n < 10) {
			System.out.println(Arrays.toString(createSequence(n)));
		} else {
			System.out.println("Некорректные данные");
		}
		
		

	}
	
	public static int[] createSequence(int n) {
		
		int[] sequence = new int[9 / n];
		int count = 1;
		int degree = n;
		int k = 0;
		
		for (int i = 0; i < sequence.length; i++) {
			
			for (int j = 0; j < n; j++) {
				k += (int)(count++ * Math.pow(10, --degree));
				
			}
			sequence[i] = k;
			degree = n;
			k = 0;
		}
		
		return sequence;
	}

}
