package by.jonline.algoritmization.part_1;

// 8. Дана последовательность целых чисел a1,a2,,an. 
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,,an).

public class Task8 {

	public static void main(String[] args) {
		
		int[] numbers1 = { 2, 2, 3, 5 ,6, 10 };
		
		int min = numbers1[0];
		
		for (int i = 1; i < numbers1.length; i++) {
			if (numbers1[i] < min) {
				min = numbers1[i];
			}
		}
		
		int countMin = 0;
		for (int i = 0; i < numbers1.length; i++) {
			if (numbers1[i] == min) {
				countMin++;
			}
		}
		
		System.out.print("Исходная последовательность: ");
		for (int i = 0; i < numbers1.length; i++) {
			System.out.print(numbers1[i] + "  ");
		} 
		
		
		int[] numbers2 = new int[numbers1.length - countMin];
		
		int index = 0;
		for (int i = 0; i < numbers1.length; i++) {
			if (numbers1[i] == min) {
				continue;
			} else {
				numbers2[index++] = numbers1[i];
			}
		}
		
		System.out.print("\nКонечная последовательность: ");
		for (int i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + "  ");
		}

	}

}
