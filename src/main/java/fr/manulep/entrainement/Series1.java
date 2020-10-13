package fr.manulep.entrainement;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Series1 {
	

	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		String message = "";
		if (name == null || name == "") {
			message = "Hello World" ;
		}else{
		 	message = "Hello " + name;
		}
		return message;
	}


	public static String[] removeNullElements(String[] array) {
		//2
		if(array != null ) {
			int nombreDeNonNull = 0;
			for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
				String s = array[i];
				if (s != null) {
					nombreDeNonNull++;
				}
			}

			String[] arrayResult = new String[nombreDeNonNull];

			int i = 0;
			for(String s:array) {
				if(s !=null ) {
					arrayResult[i] = s;
					i++;
				}
			}
			return arrayResult;

		}else {
			return array;
		}

	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3

		if(array !=null ) {
			int[] arrayResult = new int[array.length + 1];
			arrayResult[0] = element;
			for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
				arrayResult[i + 1] = array[i];

			}
			return arrayResult;
		} else {
			return new int[]{element};
		}
	}

	public static int[] allElementsExceptFirstThree(int[] array) {

		if (array != null && array.length > 3){
			int[] arrayResult = new int[array.length - 3];
			for (int i = 3, arrayLength = array.length; i < arrayLength; i++) {
				arrayResult[i-3] = array[i];
			}
			return arrayResult;
		} else if(array.length <= 3){
			return new int[]{};
		}else{
			throw new NullPointerException();
		}
	}

	public static String getFirstHalf(String word) {
		//5
		if(word != null) {
			if((word.length()/2)*2 ==  word.length() ){
				return word.substring(0, word.length()/2);
			}else{
				return word.substring(0, (word.length()/2) +1 );
			}

		}
		return null;
	}


	public static String[] selectElementsStartingWithA(String[] array) {
		if(array != null ) {
			int nombreDeNonNull = 0;
			for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
				String s = array[i];
				if (s != null && s.startsWith("a")) {
					nombreDeNonNull++;
				}
			}

			String[] arrayResult = new String[nombreDeNonNull];

			int i = 0;
			for(String s:array) {
				if (s != null && s.startsWith("a")) {
					arrayResult[i] = s;
					i++;
				}
			}
			return arrayResult;

		}else {
			return array;
		}
	}
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		if(array != null ) {
			int nombreDeNonNull = 0;
			for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
				String s = array[i];
				if (s != null && (s.startsWith("a") || s.startsWith("e") ||s.startsWith("i") ||s.startsWith("o") ||s.startsWith("u") )) {
					nombreDeNonNull++;
				}
			}

			String[] arrayResult = new String[nombreDeNonNull];

			int i = 0;
			for(String s:array) {
				if (s != null && (s.startsWith("a") || s.startsWith("e") ||s.startsWith("i") ||s.startsWith("o") ||s.startsWith("u") )){
					arrayResult[i] = s;
					i++;
				}
			}
			return arrayResult;

		}else {
			return array;
		}
	}
	
	public static String[] reverseOrderInArray(String[] array) {

		if(array != null){
			String[] arrayResult = new String[array.length];
			int i = 0;
			for (int j = 0; j < array.length; j++) {

					arrayResult[i] = array[array.length-j-1];
					i++;
			}
			return arrayResult;
		}
		return array;

	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		if(array != null && array.length>0 ){
			int[] arrayResult = new int[array.length+1];
			int indexMiddle = (array.length-1)/2;
			for (int j = 0; j < array.length; j++) {
				if(j < indexMiddle){
					arrayResult[j] = array[j];
				} else if(j == indexMiddle){
					if(indexMiddle*2 == array.length-1){
						arrayResult[j]=element;
						arrayResult[j+1] = array[j];
					}else{
						arrayResult[j] = array[j];
						arrayResult[j+1]=element;
					}

				}else {
					arrayResult[j+1]=array[j];
				}

			}
			return arrayResult;
		}
		return new int[]{element};
	}

	public static String shortestWord(String text) {
		//10
		String[] array = text.split(" ");
		String shortest =array[0];
		for (String s: array) {

			if( shortest.length() > s.length() ){
				shortest =s;
			}
		}

		return shortest;
	}

	public static String removeCapitals(String text) {
		//11
		return text.replaceAll("[A-Z]", "");
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {

		//14
		return Arrays.stream(numbers).mapToInt(x -> x.intValue()).sum();
	}

	public static float makeNegative(float number) {
		//15
		return 0-Math.abs(number);
	}

	public static boolean checkForSpecialCharacters(String string) {
		Pattern p = Pattern.compile("[^a-z0-9! ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(string);
		boolean resultatFinal = m.find();
		return resultatFinal;
	}
	
	public static boolean checkIfStringStartsWithConsonant(String word) {
		//17
		return !(word!= null && (word.toLowerCase().startsWith("a") || word.toLowerCase().startsWith("e") || word.toLowerCase().startsWith("i") ||word.toLowerCase().startsWith("o") || word.toLowerCase().startsWith("u") ));
	}

	public static String getDomainName(String email) {
		//18
		return email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
	}

	public static int[] letterPosition(String name) {

		int[] arrayResult = new int[name.length()];
		int i=0;
		//19
		for (char c: name.toCharArray()){
			arrayResult[i] = ((int)Character.toLowerCase(c)) - 96;
			i++;
		}

		return arrayResult;
	}

	public static boolean isPeer(int number) {
		//20
		return number % 2 == 0;
	}


}
