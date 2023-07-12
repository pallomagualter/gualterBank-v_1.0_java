import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String name = "Palloma Gualter";
        String accountType = "Corrente";
        double balance = 8700000.0;
        int option = 0;
        Scanner reading = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("Tipo da conta:" + accountType);
        System.out.println("Saldo atual: " + balance);
        System.out.println("********************************");

        String menu = """
                \nOperações 
                
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                
                Digite a opção desejada:

                """;

        while (option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1)    {
                System.out.println("O saldo atualizado é " + balance);
            }

            else if (option == 2)    {
                System.out.println("Qual o valor que deseja transferir?");
                double value = reading.nextDouble();

                if (value > balance) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    balance -= value;
                    System.out.println("O saldo atualizado é " + balance);
                }
            } else if (option == 3) {
                System.out.println("Valor recebido: " );
                double value = reading.nextDouble();
                balance+= value;
                System.out.println("O saldo atualizado é " + balance);
            } else if (option != 4) {
                System.out.println("Opição inválida!");
            }
        }
    }
}
