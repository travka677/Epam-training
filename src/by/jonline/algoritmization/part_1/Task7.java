package by.jonline.algoritmization.part_1;

// 7. Даны действительные числа a1,a2,... ,an . Найти
// max(a1 +a2n,a2 +a2n−1,... ,an +an+1).

public class Task7 {

	public static void main(String[] args) {
		double[] numbers = {0.12, -3.5, 3.45, 0.18, 7.65, 14.99};
		
		double sum = numbers[0] + numbers[numbers.length - 1];
		
		for (int i = 1; i < numbers.length / 2; i++) {
			if (numbers[i] + numbers[numbers.length - i - 1] > sum) {
				sum = numbers[i] + numbers[numbers.length - i - 1];
			}
		}
		System.out.println("sum = " + sum);
	}

}
