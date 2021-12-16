package by.jonline.string.as_object;

// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {

	public static void main(String[] args) {
		
		String str = " helo hi  privet   zdraste";
		
		System.out.println(maxAmountOfSpaces(str));

	}
	
	public static int maxAmountOfSpaces(String str) {
		
		String[] spaces = str.split("[^\s]");
		
		if (spaces.length == 0) {
			return 0;
		}
		
		int max = spaces[0].length();
		
		for (int i = 1; i < spaces.length; i++) {
			if (spaces[i].length() > max) {
				max = spaces[i].length();
			}
		}
		
		return max;
	}

}
