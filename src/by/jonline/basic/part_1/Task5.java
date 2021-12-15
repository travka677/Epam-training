package by.jonline.basic.part_1;

// 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
// данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.

public class Task5 {

	public static void main(String[] args) {
		int t = 4000;
		
		int h;
		int m;
		int s;
		
		h = t / 60 / 60;
		m = (t - h * 60 * 60) / 60;
		s = t - h * 60 * 60 - m * 60;
		
		System.out.printf("%02dч %02dм %02dс", h, m, s);

	}

}
