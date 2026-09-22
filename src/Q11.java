import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        String userC = "admin";
        String senhaC = "1234";

        System.out.print("Digite o usuário: ");
        String user = tec.nextLine();

        System.out.print("Digite a senha do usuário: ");
        String senha = tec.nextLine();

        if(user.equals(userC) && senha.equals(senhaC)){
            System.out.println("Login realizado com sucesso. ");
        }else{
            System.out.println("Senha ou usuário incorreto.");
        }

    }
}
