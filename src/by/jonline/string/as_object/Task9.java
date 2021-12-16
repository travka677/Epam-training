package by.jonline.string.as_object;

// 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
// буквы.

public class Task9 {

	public static void main(String[] args) {

		String str = " hjlO hi  prWiVet   ZdraЛtЖ";

		System.out.println(str);
		System.out.println(countLatinUppercaseLetters(str));
		System.out.println(countLatinLowercaseLetters(str));


	}

	public static int countLatinUppercaseLetters(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(str.charAt(i)).matches("[A-Z]")) {
				count++;
			}
		}

		return count;
	}

	public static int countLatinLowercaseLetters(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(str.charAt(i)).matches("[a-z]")) {
				count++;
			}
		}

		return count;
	}

}
