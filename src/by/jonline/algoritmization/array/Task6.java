package by.jonline.algoritmization.array;

// 6. Задана последовательность N вещественных чисел. 
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class Task6 {

	public static void main(String[] args) {
		double[] numbers = {0.12, -3.5, 3.45, 0.18, 7.65, -99.1, 45.9, 125.0, 11.8, 2.35, 1.3, 0.7};
		
		double sum = 0.0;
		
		for (int i = 2; i < numbers.length; i++) {  // 0 и 1 - не простые числа
			boolean flag = true;
			
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sum += numbers[i];
			}
			
		}
		
		System.out.println("sum = " + sum);

	}

}
