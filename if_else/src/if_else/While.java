package if_else;

import java.util.Scanner;

public class While {
	
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int numero = -1;
		
		
		while(numero != 10){
			System.out.println("Digite um numero: ");
			numero = in.nextInt();
			
			if(numero == 10) {
				System.out.println("Acertou!");
			}else {
				System.out.println("Errou!");
			}
		}
	}

}
