package by.jonline.basic.loop;

import java.util.Scanner;

// 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

public class Task7 {

	public static void main(String[] args) {
		int m;
		int n;
		
		
		m = enterFromConsole("m >> ");
		n = enterFromConsole("n >> ");
		
		for (int i = m; i <= n; i++) {
			System.out.print(i + " - ");
			int count = 0;
			
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					++count;
					System.out.print(k + " ");
				} 
			}
			if (count == 0) {
				System.out.println("Делителей у такого числа нет");
			} else {
				System.out.println();
			}
			
		}
		
	}
	
	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int value;
		
		System.out.print(message);
		while (!sc.hasNextInt()) {
			System.out.println(message);
			sc.next();
		}
		value = sc.nextInt();
		
		return value;
	}

}
