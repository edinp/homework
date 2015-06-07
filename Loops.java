package Weekend3;

import java.util.Scanner;

public class Loops {

	public static void zarez (int broj) {
		
		String s = Integer.toString(broj);
		String zarezi = "";
				
		if(s.length()>2){
		for (int i = s.length()-1; i>=0; i-=3){
			zarezi = s.charAt(i) + ",";
		}
		}
		
		
//		String zarezi = "";
//		String str = "";
//		String str2 = "";
//		int broj2 = 0;
//		
//		while(broj/1000>0){
//			broj2 = broj%1000;
//			str2 = Integer.toString(broj2);
//			broj/=1000;
//			str = Integer.toString(broj);
//			zarezi = str.substring(0,str.length()-2) + "," + str2;
//		}
		
//		for (int i = s.length()-1; i>=0; i--) {
//			zarezi=s.charAt(i) + ", " + zarezi;
//		}
		
		System.out.println(zarezi);
		
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Unesite neki broj: ");
		int num = in.nextInt();
		zarez(num);

		in.close();
	}

}
