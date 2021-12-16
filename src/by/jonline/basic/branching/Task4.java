package by.jonline.basic.branching;

// 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Task4 {

	public static void main(String[] args) {
		int x = 4;
		int y = 6;
		int z = 2;
		
		int a = 6;
		int b = 4;

		String str = (x <= b && z <= a) || (y <= b && z <= a) || (y <= a && x <= b) ? "пройдет" : "не пройдет";
		
		System.out.println(str);
	}

}
