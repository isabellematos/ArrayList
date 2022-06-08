import java.util.Scanner;
public class Matriz {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int m[][] = new int [2][2];
		
		for (int linha=0 ; linha<m.length ; linha++) { //laço de deslocamento das linhas  para percorer matriz eh necessario dois lacos for
			for (int coluna=0 ; coluna<m[0].length ; coluna++) { // laco de deslocamento das colunas
				System.out.println("Digite um numero: ");
				m[linha][coluna] = ler.nextInt();
			}
		}
		
		for (int linha=0 ; linha<m.length ; linha++) { 
			for (int coluna=0 ; coluna<m[0].length ; coluna++) { 
				System.out.println(m[linha][coluna]*2);
			}
		}
		
	}
	
}
