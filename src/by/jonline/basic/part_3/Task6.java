package by.jonline.basic.part_3;

// 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task6 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= Character.MAX_VALUE; i++) {
			System.out.println(i + " - " + (char)i);
		}

	}

}
