import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Scanner valorReceber = new Scanner(System.in);
        Scanner valorTransferir = new Scanner(System.in);
        double saldo = 2500;
        int opcao = 0;
        String nome= "Nicolas Kenzo";
        String tipoConta = "Corrente";
        System.out.println("*****************************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************************");

        while (opcao!=4){
            String operacoes = """
            
            Operações
            
            1- Consultar saldos 
            2- Receber valor
            3- Transferir valor 
            4- Sair
            
            Digite a opção desejada:
       """;
            System.out.println(operacoes);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O saldo atual é R$" + saldo);
                    break;
                case 2:
                    System.out.println("informe o valor a receber: ");
                    double receber = valorReceber.nextInt();
                    saldo += receber;
                    System.out.println("Saldo atualizado R$" + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double trasnferir = valorTransferir.nextInt();
                    if (trasnferir<saldo) {
                        saldo = saldo - trasnferir;
                        System.out.println("Saldo atualizado R$" + saldo);
                    }else {
                        System.out.println("Não há saldo suficiente para realizar a transfêrencia.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}