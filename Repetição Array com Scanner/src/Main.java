import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho do Array?");
        int tamanho = scanner.nextInt();
        int [] numeros = new int[tamanho];
        for (int  i = 1; i < tamanho; i++){
            System.out.println("Digite o valor da posição "+i+":");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Valores do Array: ");
        for (int i = 1; 1 < tamanho; i++){
            System.out.println("Valor: "+i+": "+numeros[i]);
        }
    }
}