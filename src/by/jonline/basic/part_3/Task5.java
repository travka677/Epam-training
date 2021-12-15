package by.jonline.basic.part_3;

// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
// Общий член ряда имеет вид: ai = 1/2^i + 1/3^i

public class Task5 {

	public static void main(String[] args) {
		double e = 0.25;
		double sum = 0.0;
		
		double[] numbers = new double [10];
		
		for (int i = 1; i <= numbers.length; i++) {
			numbers[i-1] = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			double n = Math.abs(numbers[i]);
			if (n >= e) {
				sum += n;
			}
		}
		
		System.out.println("sum = " + sum);
		
	}

}
