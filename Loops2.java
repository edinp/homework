package Weekend3;

import java.util.Scanner;

public class Loops2 {
	
	// method that defines the number of digits
	// for entered number
	
	public static void digitsNum (int num) {
		
		String s = Integer.toString(num);
		
		int digits = s.length();
		
		System.out.println("Entered number has " + digits + " digits");
	}
	
	
	
	
	
	// method thad changes first and last digit in number
	
	public static void changeFirstAndLast (int num) {
		
		String s = Integer.toString(num);
		int length = s.length();
		
		if(length>1){
		char first = s.charAt(0);
		char last = s.charAt(length-1);
		char tmp = first;
		first = last;
		last = tmp;
		
		String s2 = first + s.substring(1,s.length()-1) + last;
		System.out.println("Changed number is: " + s2);
		} else
			System.out.println("Your number has only one digit, and it is: " + num);
		
		
	}
	
	
	
	
	// method that for the substract od two numbers,
	
	public static void nAndQ (int n, int q){
		
		if (q>n){
			int num = q-n;
			if (num%2 == 0){
				for (int i = n+1; i < q; i++) {
					if(i%2==0){
						System.out.println(i);
					}
				}
			} else {
				for (int i = n+1; i < q; i++) {
					if(i%2 !=0) {
						System.out.println(i);
					}
				}
			}
			
		} else if (q>n) {
			int num = n-q;
			if (num%2 == 0){
				for (int i = q+1; i < n; i++) {
					if(i%2==0){
						System.out.println(i);
					}
				}
			} else {
				for (int i = q+1; i < n; i++) {
					if(i%2 !=0) {
						System.out.println(i);
					}
				}
			}
			
		} else if (q==n) {
			System.out.println("Same numbers! No numbers between.");
		}
		
		
	}

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		System.out.println("Enter number: ");
		int num = in.nextInt();
		digitsNum(num);
		
		changeFirstAndLast(num);
		
		int n = 1;
		int q = 15;
		nAndQ(n,q);
		
		
		in.close();

	}

}
