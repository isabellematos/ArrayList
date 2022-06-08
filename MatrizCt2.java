
public class MatrizCt2 {
	public static void main(String [] args) {
		double a[][] = {{2, 4}, {4, 0}};
		double b[][] = {{3, 2}, {8, 5}};
		double matriz[][] = new double[2][2];
		
		for (int lin=0 ; lin<a.length ; lin++) {
			for (int col=0 ; col<a[0].length ; col++) {
                    matriz[lin][col] = a[lin][col] + b[lin][col];
                    System.out.print(matriz[lin][col] + "\t");
            }
            System.out.println();
        }
    }
}

//Primeira passagem do laço for = 5
//linha = 0
//coluna = 0
// c[0][0] = a[0][0] + b[0][0]

//Segunda passagem do laço for = 6
//linha = 0
//coluna = 1 (atualizado primeiro pois é um laço interno)
// c[0][1] = a[0][1] + b[0][1]

//TERCEIRA passagem do laço for = 12
//linha = 1
//coluna = 0 (chegou no terceiro, ja esgotou a variavel coluna, que era de 0 e 1, por isso já foi dois, agora ela é reiniciada dnv pra poder processar a LINHA)
// c[1][0] = a[1][0] + b[1][0]

//Quarta passagem do laço for = 5
//linha = 1
//coluna = 1 (Ultima passagem)
// c[1][1] = a[1][1] + b[1][1]



