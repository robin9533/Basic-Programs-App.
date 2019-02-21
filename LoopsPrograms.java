package com.regnent;

class Loopprog {
	public static void PrintNum() {
		for (int i = 0; i <= 10; i++)
			System.out.print(i + " ");
		// return i;
	}

	public static void PrintNum2() {
		for (int j = 10; j >= 0; j--)
			System.out.print(j + " ");
	}

	public static void Even() {
		int a = 10;
		System.out.println("List of even number btw 1 to " + a);
		for (int i = 1; i <= a; i++)
			if (i % 2 == 0) {
				System.out.print(" " + i);
			}
		// else {
		// System.out.println("Its not a even");}
	}

	public static void Odd() {
		int a = 10;
		System.out.println("List of Odd number btw 1 to " + a);
		for (int i = 1; i <= a; i++)
			if (i % 2 == 1) {
				System.out.print(" " + i);
			}
	}

	/*public static void Prime(int n) {
		for (int i = 3; i <= n; i++) {
			int prm = 1;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					prm = 0;

			}
			if (prm == 0) {
				System.out.println("Print  value of : " + i);
			}
		}
	}
*/
	public static void Alternative() {
		int a = 10;
		System.out.println("List of Alternative number btw 1 to " + a);
		for (int i = 1; i <= a;) {
			System.out.print(" " + i);
			i = +2;
		}

	}

	public static void Number7() {
		int a = 20;
		System.out.println("List of number divisible by 7. btw 1 to " + a);
		for (int i = 1; i <= a; i++)
			if (i % 7 == 0) {
				System.out.print(" " + i);
			}
	}
}

class LoopsPrograms {
	public static void main(string[] args) {

		Loopprog.PrintNum();
		System.out.println("\n");
		Loopprog.PrintNum2();
		System.out.println("\n");
		Loopprog.Even();
		System.out.println("\n");
		Loopprog.Odd();
		System.out.println("\n");
		int n = 30;
		//Loopprog.Prime(n);
		System.out.println("\n");
		Loopprog.Alternative();
		System.out.println("\n");
		Loopprog.Number7();
	}
}