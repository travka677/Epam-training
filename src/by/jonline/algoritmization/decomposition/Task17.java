package by.jonline.algoritmization.decomposition;

// 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {

	public static void main(String[] args) {
		
		int n = 22;
		
		if (n > 0) {
			System.out.println(count(n));
		} else {
			System.out.println("Некорректные данные");
		}
		
	}
	
	public static int sumOfDigits(int n) {
		
		int sum = 0;
		
		for (int i = n; i > 0; i /= 10) {
			sum += i % 10;
		}
		
		return sum;
	}
	
	public static int count(int n) {
		
		int count = 0;
		int subtrahend = sumOfDigits(n);
		
		while (n > 0) {
			n -= subtrahend;
			count++;
		}
		
		return count;
	}


}
