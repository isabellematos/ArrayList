import java.util.Scanner;

class Teste{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");

        try{
            int num= ler.nextInt();
            System.out.println("\nVocê digitou "+num);
        }
        catch(Exception e){
            System.out.println("Opa, digitou errado");
        }
    }
}













