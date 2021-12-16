package by.jonline.basic.linear;

// 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
// дробную и целую части числа и вывести полученное значение числа.

public class Task4 {

	public static void main(String[] args) {
		double n = 456.123;
		
		double res;
		
		res = (n - (int)n) * 1000 + ((int)n / 1000.0);
		
		System.out.printf("%.3f", res);

	}

}
