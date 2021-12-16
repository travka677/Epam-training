package by.jonline.basic.branching;

// 1. Даны два угла треугольника (в градусах). 
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Task1 {

	public static void main(String[] args) {
		int a = 45;
		int b = 90;
		
		if ((a > 0 && a <= 90) && (b > 0 && b <= 90)) {
			System.out.println("Такой треугольник существует");
			
			if (a == 90 || b == 90 || (180 - a - b) == 90) {
				System.out.println("Треугольник прямоугольный");
			} else {
				System.out.println("Треугольник не прямоугольный");
			}
		} else {
			System.out.println("Такого треугольника не существует");
		}

	}

}
