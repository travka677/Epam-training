package by.jonline.basic.loop;

// 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task8 {

	public static void main(String[] args) {
		int a = 12003479;
		int b = 2033347;
		
		int[] uniqueA;
		int[] uniqueB;
		
		uniqueA = uniqueNumber(a);
		uniqueB = uniqueNumber(b);
		
		
		for (int i = 0; i < uniqueA.length; i++) {
			if (uniqueA[i] == 1 && uniqueB[i] == 1) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	// 1 записывается на место, индекс которого равен самому числу
	public static int[] uniqueNumber(int n) {
		int[] array = new int[10];
		
		while (n != 0) {
			array[n % 10] = 1;
			n /= 10;
		}
		
		return array;
	}

}
