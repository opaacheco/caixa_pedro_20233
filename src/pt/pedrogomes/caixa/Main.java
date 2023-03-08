package pt.pedrogomes.caixa;

import java.util.Iterator;

import pt.pedrogomes.caixa.errors.NotEnougthHeightException;
import pt.pedrogomes.caixa.errors.NotEnougthWidthException;

public class Main {

	public static void main(String[] args) throw Exception {
		Caixa caixa = new Caixa(4,4);
		caixa.printBox();
		
		Caixa caixa2 = new Caixa(4,4,"B");
		
		try {
			System.out.println();
		} catch (NotEnougthWidthException e) {
			System.out.println("Ocorreu um erro ao desenhar a caixa!");
		} catch(NotEnougthHeightException e) {
			
		}
	}
}