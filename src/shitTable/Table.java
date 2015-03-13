package shitTable;

import java.util.Scanner;

public class Table {

	static Scanner scnr = new Scanner(System.in);
	public static boolean rep = false;
	int num1 = 0;
	static String flg = "No";

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("Table of your Choice!!!");
		do {
			Table.line();
			Table.numBum();
			// Be carefull asker down
			Table.askme();
		} while (rep);

	}

	private static void line() {
		for (int a = 0; a < 40; a++) {
			System.out.print("-");
		}
	}

	// num taker
	private static void numBum() {
		System.out.println();
		System.out.println("Enter the number: To get Table up to 20.");
		int num1 = scnr.nextInt();
		Table.calcu(num1);
	}

	// Calculator
	private static void calcu(int num1) {
		for (int a = 0; a < 21; a++) {
			System.out.println(num1 + "   x   " + a + "   =   " + num1 * a);
		}
	}

	// Asker
	private static void askme() {
		System.out
				.println("HOlD on Type 'yes' to recalculate table or 'no' to exit, You can change the mode: Like if you want to implement 'do type ' loop then type 'dowhile' and for 'while' loop press 'while'. Best of luck!");
		flg = scnr.next();// rep=true;
		do {
			switch (flg) {
			case "yes":
				rep = true;
				break;
			case "Yes":
				rep = true;
				break;
			case "YES":
				rep = true;
			case "no":
				rep = false;
				break;
			case "No":
				rep = false;
				break;
			case "dowhile":
				Table.dowhile();
				break;
			case "while":
				Table.wawa();
				break;
			case "for":
				System.out.println();
				System.out.println("Enter the number: To get Table up to 20.");
				int num1 = scnr.nextInt();
				Table.calcu(num1);
				break;
			default:
				rep = false;
			}
			System.out
					.println("You still can do these (repeat: yes) (exit: no) (do while Loop: dowhile) (while Loop: while) (for Loop: for)!");
			flg = scnr.next();// rep=true;
		} while (flg != "no" || flg != "No" || flg != "NO");
	}

	private static void dowhile() {
		int a = 0;
		int num1 = scnr.nextInt();
		do {
			System.out.println();
			System.out.println("Enter the number: To get Table up to 20.");
			// int num1 = scnr.nextInt();
			System.out.println(num1 + "   x   " + a + "   =   " + num1 * a);
			a++;
		} while (a < 21);
	}

	private static void wawa() {
		System.out.println();
		System.out.println("Enter the number: To get Table up to 20.");
		int num1 = scnr.nextInt();
		int a = 0;
		while (a < 21) {
			System.out.println(num1 + "   x   " + a + "   =   " + num1 * a);
			a++;
		}
	}

}
