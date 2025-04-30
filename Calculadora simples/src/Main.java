import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Pega dois valores e os calcula usando a operação escolhida pelo usuário.
        double valor1, valor2;
        String operacao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operações: \n Adição: + \n Subtração: - \n Multiplicação: * \n Divisão: /");
        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();
        System.out.println("Digite a operacao: ");
        operacao = scanner.next();

        switch (operacao){
            case "+":
                System.out.println("O resultado é: "+valor1 + valor2);
                break;
            case "-":
                System.out.println("O resultado é: "+valor1 + valor2);
                break;
            case "*":
                System.out.println("O resultado é: "+valor1 * valor2);
                break;
            case "/":
                System.out.println("O resultado é: "+valor1 / valor2);
                if (valor1 == 0) {
                    System.out.println("Não é possivel dividir por zero");
                } else if (valor2 == 0) {
                    System.out.println("Não é possivel dividir por zero");
                }



        }
    }
}