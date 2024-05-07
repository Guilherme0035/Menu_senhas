import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> senhas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


            while (true) {
                System.out.println("-----Digite uma das opções abaixo-----");
                System.out.println(" [1] - Gerar senha\n " +
                        "[2] - Mostrar fila de senhas\n " +
                        "[3] - Chamar próxima senha\n " +
                        "[4] - Sair");

                int opUser = 0;
                try {
                    opUser = scanner.nextInt();
                }
                catch (Exception e) {
                    System.out.println("Por favor, Informe apenas as opções sugeridas!");
                    scanner.nextLine();
                    continue;
                }
                if (opUser == 1) {
                    int senhaGerada = (int) (Math.random() * 100);
                    senhas.add(senhaGerada);
                    System.out.println("Senha gerada: " + senhaGerada);
                }
                else if (opUser == 2) {
                    if (!senhas.isEmpty()) {
                        System.out.println("***Senhas aguardando para serem chamadas***");
                        System.out.println(senhas);
                    }
                    else {
                        System.out.println("Não há senhas para mostrar.");
                    }
                }
                else if (opUser == 3) {
                    if (!senhas.isEmpty()) {
                        System.out.println("Senha a ser chamada: " + senhas.get(0));
                        senhas.remove(0);
                        System.out.println("Fila de senhas atualizada: " + senhas);
                    }
                    else {
                        System.out.println("Não há senhas para chamar.");
                    }
                }
                else if (opUser == 4) {
                    System.out.println("Programa encerrando...");
                    break;
                } else {
                    System.out.println("Por favor, Informe apenas as opções sugeridas!");
                }
            }
        scanner.close();
    }
}
