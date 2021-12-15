package by.jonline.string.part_2;

// 3. Проверить, является ли заданное слово палиндромом.

public class Task3 {

	public static void main(String[] args) {
		
		String str = "pop";
		
		System.out.println(isPalindrome(str));
		
	}
	
	public static boolean isPalindrome(String str) {
		
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		
		return str.equals(builder.toString());
	}

}
