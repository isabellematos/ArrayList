
public class MatrizCt {
	public static void main(String [] args) {
		double a[][] = {{2, 4}, {4, 0}};
		double b[][] = {{3, 2}, {8, 5}};
		double matriz[][] = new double[2][2];
		somaMatriz(a, b, matriz);

		for (int lin=0 ; lin<matriz.length ; lin++) {
			for (int col=0 ; col<matriz[0].length ; col++) {
				System.out.print(matriz[lin][col] + "\t");
		}
		System.out.println();
		}
	}
	//Método que faz a soma
	public static void somaMatriz(double m1[][], double m2[][], double soma[][]) {
		for (int lin=0 ; lin<m1.length ; lin++) {
			for (int col=0 ; col<m1[0].length ; col++) {
				soma[lin][col] = m1[lin][col] + m2[lin][col];
			}
		}
	}
}
