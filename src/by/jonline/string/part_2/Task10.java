package by.jonline.string.part_2;

// 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
// знаком. Определить количество предложений в строке X.

public class Task10 {

	public static void main(String[] args) {
		
		String str = "This is sentence 1. This is sentence 2! And also sentense three?";

		System.out.println(str);
		System.out.println(str.split("[.!?]").length);
	}
	

}
