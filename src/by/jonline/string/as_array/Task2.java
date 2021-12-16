package by.jonline.string.as_array;

// 2. Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {

	public static void main(String[] args) {
		String str = "some word. Word2010wordgg4";
		System.out.println("Исходная строка: " + str);
		
		String newStr = str.replace("word", "letter");
		System.out.println("Конечная строка: " + newStr);

	}

}
