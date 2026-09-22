import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = tec.nextInt();

        if (num > 0){
            System.out.println("Número positivo.");
        }else if(num < 0){
            System.out.println("Número negativo.");
        }else{
            System.out.println("O número é zero.");
        }
    }
}
