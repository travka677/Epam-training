package by.jonline.algoritmization.decomposition;

// 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task11 {

	public static void main(String[] args) {
		
		int n1 = 324288;
		int n2 = 235240;
		
		if (Task10.length(n1) > Task10.length(n2)) {
			System.out.println("В первом числе цифр больше");
		} else if (Task10.length(n1) < Task10.length(n2)) {
			System.out.println("Во втором числе цифр больше");
		} else {
			System.out.println("В первом и во втором числах одинаковое кол-во цифр");
		}
		

	}

}
