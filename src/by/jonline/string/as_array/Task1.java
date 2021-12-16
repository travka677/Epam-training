package by.jonline.string.as_array;

// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {
	public static void main(String[] args) {
		
		String[] variablesInCamelCase = { "maxNumber", "minAmountOfAttempts", "isAlive", "iPP" };
		
		String[] variablesInLowerCase = variablesToLowerCase(variablesInCamelCase);
		String[] variables_in_snake_case = variablesToSnakeCase(variablesInCamelCase, variablesInLowerCase);
		
		System.out.println("Переменные в camelCase:");
		print(variablesInCamelCase);
		
		System.out.println("\nПеременные в snake_case:");
		print(variables_in_snake_case);
		
	}
	
	public static String[] variablesToLowerCase(String[] variables) {
		
		String[] variablesInLowerCase = new String[variables.length];
		
		for (int i = 0; i < variables.length; i++) {
			variablesInLowerCase[i] = variables[i].toLowerCase();
		}
		
		return variablesInLowerCase;
		
	}
	
	public static String[] variablesToSnakeCase(String[] variablesInCamelCase, String[] variablesInLowerCase) {
		
		int length = variablesInCamelCase.length;
		String[] variables_in_snake_case = new String[length];
		
		for (int i = 0; i < length; i++) {
			String newVariable = "" + variablesInCamelCase[i].charAt(0);
			
			if (variablesInCamelCase[i].length() > 1) {
				for (int j = 1; j < variablesInCamelCase[i].length(); j++) {
					if (variablesInCamelCase[i].charAt(j) != variablesInLowerCase[i].charAt(j)) {
						newVariable += "_" + variablesInLowerCase[i].charAt(j);
					} else {
						newVariable += variablesInLowerCase[i].charAt(j);
					}
				}
	
			}
			variables_in_snake_case[i] = newVariable;
		}
		
		return variables_in_snake_case;
	}
	
	public static void print(String[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
