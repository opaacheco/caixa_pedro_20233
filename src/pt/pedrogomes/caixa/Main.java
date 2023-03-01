package pt.pedrogomes.caixa;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		printTOpOrBottom(4);
		printLeftandRigth(4, 2);
		printTOpOrBottom(4);

	}
	public static void printTOpOrBottom(int size) {
		for(int i = 0 ; i <size ; i++) {
		System.out.print("*");
		}
		System.out.println();
	}
	
	public static void printLeftandRigth(int width, int height) {
		for (int i = 0; i < height; i++) {
			System.out.print("*");
			for (int j = 0; j < width - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
