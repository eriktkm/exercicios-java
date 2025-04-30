import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Converte um valor em Real para um valor em Dolar, Euro e Libra.
        double valor, resultado;
        String moeda=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de moedas.\nConverte um valor em real para: \n 1) Dolar (USD): 5,69\n 2) Euro  (EUR): 6,46\n 3) Libra (GBP): 7,56");
        System.out.println("Digite um moeda: ");
        moeda = scanner.next();
        System.out.println("Digite um valor: ");
        valor = scanner.nextDouble();
        switch (moeda) {
            case "1": resultado = valor * 5.69;
            System.out.println("O valor de R$"+valor+" convertido para o Dolar equivale a: "+resultado);
            break;
            case "2": resultado = valor * 6.46;
            System.out.println("O valor de R$"+valor+" convertido para o Euro equivale a: "+resultado);
            break;
            case "3": resultado = valor * 7.56;
                System.out.println("O valor de R$"+valor+" convertido para a Libra equivale a: "+resultado);
                break;
        }
    }
}