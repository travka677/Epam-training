package by.jonline.string.as_object;

// 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//  длинных слов может быть несколько, не обрабатывать.

public class Task8 {

	public static void main(String[] args) {
		
		String str = " helo hi  privet   zdraste";
		
		System.out.println(str);;
		System.out.println(longestWord(str));
	}
	
	public static String longestWord(String str) {
		
		String[] words = str.split("\s");
		
		if (words.length == 0) {
			return "В строке нет слов";
		}
		
		int max = words[0].length();
		String longestWord = words[0];
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > max) {
				max = words[i].length();
				longestWord = words[i];
			}
		}
		
		return longestWord;
	}

}
