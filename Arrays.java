package Weekend3;

import java.util.Scanner;

public class Arrays {
	
	public static boolean sameArrays (int[] a, int[] b) {
		
		int length1 = a.length;
		int length2 = b.length;
		
		if (length1 == length2) {
			for (int i = 0; i < length1; i++) {
				if (a[i] == b[i]) {
					System.out.println("Arrays are identical");
					return true;
				} else
					System.out.println("Arrays are not identical");
					return false;
			}
		} else
			System.out.println("Arrays are not the same size");
			return false;
		
	}
	
	public static int[] sumElements (int a[], int b[]) {
		
		int length1 = a.length;
		int length2 = b.length;
		int length;
		
		if(length1>=length2){
			length = length1;
		} else
			length = length2;
		
		int[] sum = new int[length];
	
		
		for (int i = 0; i < length; i++) {
			int zbir = a[i] + b[i];
			sum[i] = zbir;
			} 
		
		return sum;

	}
	
	public static int[] sum (int[] a, int[] b) {
		
		int length1 = a.length;
		int length2 = b.length;
		int length = length1 + length2;
		
		int[] sum = new int[length];
		
		for (int i = 0; i < length1; i++) {
			sum[i] = a[i];
		}
		
		for (int i = 0; i < length2; i++) {
			sum[i+length1] = b[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		// first part
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Unesite duzinu prvog niza");
		int length1 = in.nextInt();
		System.out.println("Unesite duzinu drugog niza");
		int length2 = in.nextInt();
		
		int[] niz1 = new int[length1];
		int[] niz2 = new int[length2];
		
		System.out.println("Unesite elemente prvog niza, ukupno: " + length1);
		for (int i = 0; i < length1; i++) {
			niz1[i] = in.nextInt();
		}
		
		System.out.println("Unesite elemente drugog niza, ukupno: " + length2);
		for(int i = 0; i < length2; i++) {
			niz2[i] = in.nextInt();
		}
		
		System.out.println(java.util.Arrays.toString(niz1));
		System.out.println(java.util.Arrays.toString(niz2));
		
		
		
		// second part 
		
		System.out.println(sameArrays(niz1, niz2));
		
		
		// thirt part (works only when arrays are same size)
		
		System.out.println(java.util.Arrays.toString(sumElements(niz1, niz2)));
		
		
		// forth part
		
		System.out.println(java.util.Arrays.toString(sum(niz1, niz2)));
		
		in.close();

	}

}
