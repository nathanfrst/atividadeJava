import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){

        char soma,sub,mult,div;

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = tec.nextDouble();
        System.out.print("Digite outro: ");
        double n2 = tec.nextDouble();
        double result = 0;

        tec.nextLine();

            System.out.print("Qual operação você deseja fazer com os números (+,-,*,/)? ");
            char op = tec.nextLine().charAt(0);

        switch(op){
            case '+':
                result = n1 + n2;
                System.out.printf("Resultado da soma: %.2f",result);
                break;
            case '-':
                result = n1 -n2;
                System.out.printf("Resultado da subtração: %.2f",result);
                break;
            case '*':
                result = n1*n2;
                System.out.printf("Resultado da multiplicação: %.2f",result);
                break;
            case '/':
                if(n2 != 0){
                    result = n1/n2;
                    System.out.printf("Resultado da divisão: %.2f",result);
                    break;
                }else{
                    System.out.println("Não é possível divir um número por zero.");
                    break;
                }

            default:
                System.out.println("Caractere inválido. (+,-,*,/)");
                break;
        }
    }
}
