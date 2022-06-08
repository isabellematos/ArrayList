import java.util.ArrayList;
import java.util.Scanner;
public class ArrayPrimo {
	public static void main(String [] args) {
            ArrayList<Integer> lista = new ArrayList<Integer>();
		   Scanner ler = new Scanner(System.in);

		int numero = 2;
		while (true) {
		      System.out.print("Digite um numero inteiro >= 2: ");
		      numero = ler.nextInt();
		      if (numero >= 2) {
		        break;
		      }
		    }
		
			for(int i=2 ; i<numero/2+1 ; i++ ){
                if (numero % i == 0); {
                lista.add(i);
            }
    }

    if (lista.size() > 0) {
         System.out.println(numero + " nao eh primo. pois eh divisivel por: ");
        for (int i=0 ; i<lista.size() ; i++) {
            System.out.print(lista.get(i) + "\t");
        } 
    }
    else {
        System.out.println(numero + "eh primo");
        }
    }
}