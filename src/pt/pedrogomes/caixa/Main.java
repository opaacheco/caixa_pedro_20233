package pt.pedrogomes.caixa;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		printBox(4, 4);
		printBox(8, 8);
	}
	public static void printBox(int width, int height) {
		printTOpOrBottom(width);
		printLeftandRigth(width, height - 2);
		printTOpOrBottom(width);
	}
	public static void printTOpOrBottom(int width) {
		for(int i = 0 ; i < width ; i++) {
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
