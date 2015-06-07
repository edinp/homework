package Weekend3;

public class Strings {

	public static void crazyLetters (String s1, String s2){
		
		int length1 = s1.length();
		int length2 = s2.length();
		
		String crazy = "";
		
		if (length1>length2) {	
			for (int i = 0; i < length2; i++) {
				crazy += s1.substring(i, i+1) + s2.substring(i, i+1);
			} 	System.out.println(crazy + s1.substring(length2));
		} else if (length2>length1) {
			for (int i = 0; i < length1; i++) {
				crazy += s1.substring(i, i+1) + s2.substring(i, i+1);
			}	System.out.println(crazy + s2.substring(length1));
		}
	}
	
	
	public static void secondAlphabet (String s1, String s2) {
		
		int a = s1.compareToIgnoreCase(s2);
		
		if (a>0) {
			System.out.println(s1);
		} else
			System.out.println(s2);
		
	}
	
	public static void main(String[] args) {

		crazyLetters("Bosna", "Sarajevo");
		
		secondAlphabet("Edin", "Sarajevo");
		

	}

}
