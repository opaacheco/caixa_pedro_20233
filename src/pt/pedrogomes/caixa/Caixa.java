package pt.pedrogomes.caixa;

public class Caixa {

		private int width ; 
		private int height;
		private String caracter;
		//public Caixa() {
		//}
		public Caixa(int width, int height) {
			this(width, height, "*");
		}
		public Caixa(int width, int height, String caracter) {
			this.width = width;
			this.height = height;
			this.caracter = caracter;
		}
		public void printBox() {
			if (width<4) {
				width = 4;
				//Unchecked exception;
				//throw new RuntimeException("basnnsad");
				
				// Checked exception
				//throw new Exception ("width cannot be less than 4")
				
			}if (height<4) {
				height = 4;
				//Unchecked exception;
				//throw new RuntimeException("basnnsad");
				
				// Checked exception
				//throw new Exception ("width cannot be less than 4")
			}
			printTOpOrBottom();
			printLeftandRigth();
			printTOpOrBottom();
		}
		public void printTOpOrBottom() {
			for(int i = 0 ; i < width ; i++) {
			System.out.print(caracter);
			}
			System.out.println();
		}
		
		public void printLeftandRigth() {
			for (int i = 0; i < height - 2; i++) {
				System.out.print(caracter);
				for (int j = 0; j < width - 2; j++) {
					System.out.print(" ");
				}
				System.out.println(caracter);
			}
		}
		
}
