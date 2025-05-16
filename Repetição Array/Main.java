//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Criação de um array

        int [] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Valores do Array: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posição "+i+": "+ numeros[i]);
        }
    }
}