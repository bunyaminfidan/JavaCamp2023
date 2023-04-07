package stringsDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String message = "Today weather is very well. ";

		System.out.println("Select sentence total letter count is =" + message.length());

		// I want to choose 8th letter

		System.out.println("8th letter is = " + message.charAt(8));

		// combining Birlestirme

		System.out.println(message.concat("What should we do"));

		// startsWith endsWith --O harfle basliyor mu true or false boolean

		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("B"));

		// getChars cut any letter to char arrays

		char[] forGetChars = new char[7];

		message.getChars(0, 5, forGetChars, 0);

		for (char letter : forGetChars) {
			System.out.println(letter);
		}

		/// indexOf start first- lastIndexOf last first - Kacinci karakter oldugu

		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('a'));

		// replace degistirmek

		System.out.println(message.replace(' ', '-'));

		// subString ilgili yerden itibaren kesme

		System.out.println(message.substring(6));
		System.out.println(message.substring(6, 15));

		
		//split  kelimeleri bir dizi haline getirmek icin
		
		String[] newSentenceArray = new String[6];

		
		for (int i = 0; i < newSentenceArray.length; i++) {
			for(String word: message.split(" ")) {
				newSentenceArray[i] = word;
			}
		}
		
		System.out.println(newSentenceArray.length);
		
		
		
		
		//toowerCase and toUpperCase
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		
		//trim bastaki ve sonra ki boslukari siler 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
