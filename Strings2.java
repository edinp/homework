package Weekend3;

public class Strings2 {
	
	public static boolean sameLetters (String s1, String s2) {
		
		int a = s1.length();
		int b = s2.length();
		
		char[] aa = new char[a];
		char[] bb = new char[b];
		
		for (int i = 0; i<a; i++) {
			aa[i] = s1.charAt(i);
		}
		
		for (int i = 0; i<b; i++) {
			bb[i] = s2.charAt(i);
		}
		
		
		
		for (int i = 0; i<a; i++) {
			for (int j = 0; j<b; j++) {
				if(aa[i] == bb[j]){
					continue;
				} else
					return false;
			}
		} return true;
		
		
	}
	
	
	
	public static void main(String[] args) {

		System.out.println(sameLetters("Edin", "Dine"));
	}

}
