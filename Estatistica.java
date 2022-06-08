public class Estatistica {
	public static void main(String [] args) {
	
		double numeros[] = new double[args.length]; // vetor do tipo double com o mesmo tamanho do vetor args
		
		for (int i=0 ; i<args.length ; i++) {
			numeros[i] = Double.parseDouble(args[i]); //args eh string, eh convertido de string para double, e vai ser guardado no [i]
		}
		
		//numeros[0] = Double.parseDouble(args[0]);
		
		System.out.println("Média: " + media(numeros)); // chamada para os outros métodos dentro do println, uma das possibilidades de chamada
		System.out.println("Menor número: " + menor(numeros));
		System.out.println("Maior número: " + maior(numeros));
		
	}
	
	public static double media(double vet[]) {
		double total = 0; // variavel acumuladora, igual a zero pois vai aculumar
		for(int i=0 ; i<vet.length ; i++) { // for para percorrer o vetor, comeca em 0 pois o vetor começa e 0, no final tem 1 ser menor q o vetor, por isso usar .lenght(tamanho) e no teste acrescentar mais 1, que vai somar na variavel toral.
			total += vet[i];
		}
		return total / vet.length; // soma todos os elementos do vetor, dps retorna a media
	}
	
	public static double menor(double vetor[]) {
		double menorNumero = vetor[0]; //recebe o primeiro numero do vetor, comparar valores do vetor, primeiro valor com demais
		for (int i=1 ; i<vetor.length ; i++) {
			if (menorNumero > vetor[i]) { //comparando primeiro vetor com o valor seguinte dele, determinado no laco for
				menorNumero = vetor[i]; // se maior, trocar os valores, agora menor numero é igual o valor seguinte, q é menor do q ele, assim em diante
			}
		}
		return menorNumero;
	}
	
	public static double maior(double vetor[]) {
		double maiorNumero = vetor[0]; //recebe o primeiro numero do vetor, comparar valores do vetor, primeiro valor com demais
		for (int i=1 ; i<vetor.length ; i++) {
			if (maiorNumero < vetor[i]) { //comparando primeiro vetor com o valor seguinte dele, determinado no laco for
				maiorNumero = vetor[i]; // se menor, trocar os valores, agora maior numero é igual o valor seguinte, q é maior do q ele, assim em diante
			}
		}
		return maiorNumero;
	}
}
