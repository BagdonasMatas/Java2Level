package app;

public class Apsilimas {

	public static Integer calculator(Integer a, char sign, Integer b) throws Exception {
		Integer temp = 0;

		if (sign == '+') {
			temp = a + b;
		} else if (sign == '-') {
			temp = a - b;
		} else if (sign == '*') {
			temp = a * b;
		} else if (sign == '/') {
			if (b == 0) {
				throw new ArithmeticException("Division by zero");
			} else
				temp = a / b;

		} else {
			System.out.println("No such operation");
		}
		;
		return temp;
	}

	public static Integer calculator(String row) {
		Integer temp = 0, a = 0, b = 0;

		String[] numbers = row.split("[+-/*]");

		a = Integer.parseInt(numbers[0]);
		b = Integer.parseInt(numbers[1]);

		String[] operators = row.split("[\\d]");
		char[] sign = operators[1].toCharArray();

		if (sign[0] == '+') {
			temp = a + b;
		} else if (sign[0] == '-') {
			temp = a - b;
		} else if (sign[0] == '*') {
			temp = a * b;
		} else if (sign[0] == '/') {
			if (b == 0) {
				throw new ArithmeticException("Division by zero");
			} else
				temp = a / b;

		} else {
			System.out.println("No such operation");
		}


		return temp;
	}
	
	public static Integer countWords(String text) {
		Integer result = 0;
		
		result = text.split(" ").length;
		
		return result;
	}

}
