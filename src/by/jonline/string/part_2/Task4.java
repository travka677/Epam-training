package by.jonline.string.part_2;

// 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4 {

	public static void main(String[] args) {
		
		String word = "информатика";
		
	    StringBuilder newWord = new StringBuilder();
	    
	    newWord.append(word.charAt(7)).
	    		append(word.substring(3, 5)).
	    		append(word.charAt(7));
	    
	    System.out.println(word);
	    System.out.println(newWord.toString());
	}

}
