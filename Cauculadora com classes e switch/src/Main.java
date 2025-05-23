import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        double a, b;
        String operacao, continuar = "S";


        do {
            System.out.println("---CALCULADORA---");
            System.out.println("Operações: ");
            System.out.println("\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
            System.out.println("Escolha uma operação: ");
            operacao = scanner.next();
            System.out.println("Digite o primeiro número: ");
            a = scanner.nextInt();
            System.out.println("Digite o segundo número: ");
            b = scanner.nextInt();

            switch (operacao) {
                case "1":
                    System.out.println("Soma dos valores: " + calc.somar(a, b));
                    break;
                case "2":
                    System.out.println("Subtração dos valores: " + calc.subtrair(a, b));
                    break;
                case "3":
                    System.out.println("Multiplicação dos valores: " + calc.multiplicar(a, b));
                    break;
                case "4":
                    System.out.println("Divisão dos valores: " + calc.dividir(a, b));
                    break;

            }
            System.out.println("Digite S para continuar N para sair");
            continuar = scanner.next();

        }while(continuar.equals("S"));

    }
}
