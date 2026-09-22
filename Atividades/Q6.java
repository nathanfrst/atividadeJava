import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = tec.nextInt();

        if(idade >=0) {
            if (idade <= 12) {
                System.out.println("Criança");
            } else if (idade > 12 && idade <= 17) {
                System.out.println("Adolescente");
            } else if (idade > 17 && idade <= 59) {
                System.out.println("Adulto");
            } else {
                System.out.println("Idoso");
            }
        }else{
            System.out.println("Idade inválida. ");
        }
    }
}
