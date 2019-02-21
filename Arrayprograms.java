package com.regnent;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

class PrintArr {
	public static void ArrayElement(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(" " + A[i]);
		} // Arrays.sort(A[i]);
	}

	public static void ArrayEven(int[] B) {
		System.out.print("List of even number in the Array are : ");
		for (int i = 0; i < B.length; i++)
			if (B[i] % 2 == 0) {
				System.out.print("  " + B[i]);
			}
	}

	public static void ArrayOdd(int[] D) {
		System.out.print("List of Odd number in the Array are : ");
		for (int i = 0; i < D.length; i++)
			if (D[i] % 2 == 1) {
				System.out.print("  " + D[i]);

			}
	}

	public static void EvenIndex(int[] F) {
		System.out.print(" Even Array elements are : ");
		for (int i = 0; i < F.length; i += 2) {
			System.out.print(" " + F[i]);
		}
	}

	public static void OddIndex(int[] H) {
		System.out.print(" Odd Array elements are : ");
		for (int i = 1; i < H.length; i += 2) {
			System.out.print(" " + H[i]);
		}
	}

	public static void Left(int[] L) {
		int x = L.length / 2;
		System.out.print("Print the element from left to right : ");
		for (int i = 0; i < x; i++) {
			System.out.print(" " + L[i]);
		}
	}

	public static void Right(int[] R) {
		int x = R.length / 2;
		System.out.print("Print the element from right to left : ");
		for (int i = x; i >= 0; i--) {
			System.out.print(" " + R[i]);
		}
	}
	public static void AltArray(int[] R) {
		System.out.print(" Alt Array elements are : ");
		for (int i = 0; i < R.length; i += 2) {
			System.out.print(" " + R[i]);
		}
	}
	public static void Index(int [] W) {
		System.out.println("Index of the given element : ");
		for(int i=0; i<W.length ; i++) 
		{
			if(W[i]==5)
		{
			System.out.println(" " + i);
		}
	}
	}
	public static void Avg(int [] V) {
		int tot, Avg;
		tot = 0;
		for (int i =0 ; i<V.length-1 ;i++) {
			tot = tot+V[i];
		}
	System.out.println("Sum of the number are :" + tot);
	Avg = tot/V.length;
	System.out.println("Avg of Num :"+  Avg);
	}
}

public class Arrayprograms {
	public static void main(string[] args) {
		int[] array = { 10, 50, 96, 4, 5, 20 };
		PrintArr.ArrayElement(array);
		System.out.println(" ");
		PrintArr.ArrayEven(array);
		System.out.println(" ");
		PrintArr.ArrayOdd(array);
		System.out.println(" ");
		PrintArr.EvenIndex(array);
		System.out.println(" ");
		PrintArr.OddIndex(array);
		System.out.println(" ");
		PrintArr.Left(array);
		System.out.println(" ");
		PrintArr.Right(array);
		System.out.println(" ");
		PrintArr.AltArray(array);
		System.out.println(" ");
		PrintArr.Index(array);
		System.out.println(" ");
		PrintArr.Avg(array);
	}

}
