import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("* Menu \n 1- Hambúrger R$15 \n 2- Pizza R$12\n 3- Sanduíche R$30\n 4- Refrigerante R$6 \n 5- Sair");
            int opc = tec.nextInt();
            int num = 0;
            int prec = 0;
            double valorTotal = 0;

            switch(opc){
                case 1:
                    System.out.print("Quantos hamburgeres deseja? ");
                    num = tec.nextInt();
                    prec = 15;

                    valorTotal = num * prec;

                    System.out.printf("Valor total da compra %.2f%n",valorTotal);
                    break;
                case 2:
                    System.out.print("Quantas fatias de pizza deseja? ");
                    num = tec.nextInt();
                    prec = 12;

                    valorTotal = num * prec;

                    System.out.printf("Valor total da compra %.2f%n",valorTotal);
                    break;
                case 3:
                    System.out.print("Quantos sanduíches deseja? ");
                    num = tec.nextInt();
                    prec = 30;

                    valorTotal = num * prec;

                    System.out.printf("Valor total da compra %.2f%n",valorTotal);
                    break;
                case 4:
                    System.out.print("Quantos refrigerantes deseja? ");
                    num = tec.nextInt();
                    prec = 6;

                    valorTotal = num * prec;

                    System.out.printf("Valor total da compra %.2f%n",valorTotal);
                    break;
                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Opção inválida. ");
                    break;
            }
        }
    }
}
