import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        System.out.print("Qual o valor da compra: ");
        double compra = tec.nextDouble();
        double desconto = 0;

        if(compra >=0) {
            if(compra >= 100) {
                desconto = compra * 0.10;
                compra -= desconto;

                System.out.printf("Valor com desconto de 10%% aplicado: %.2f%n",compra);
            }else{
                System.out.println("Valor total "+compra);
            }
        }else{
            System.out.println("Valor digitado inválido.");
        }

    }
}
