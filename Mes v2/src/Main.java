import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Diz os meses com a quantidade de dias digitada.

        int dias = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa lista os meses que tem a quantidade dias digitado.");
        while (true) {
            System.out.println("Digite a quantidade de dias: ");
            dias = scanner.nextInt();
            if (dias == 28) {
                String[] meses28 = {"Fevereiro"};
                for (String mes : meses28) {
                    System.out.println("Meses com " + dias + " dias: \n" + mes);
                }
            } else if (dias == 30) {
                String[] meses30 = {"Abril", "Junho", "Setembro", "Novembro"};
                System.out.println("Meses com " + dias + " dias:");
                for (String mes : meses30) {
                    System.out.println(mes);
                    break;
                }
            } else if (dias == 31) {
                String[] meses31 = {"Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro"};
                System.out.println("Meses com " + dias + " dias:");
                for (String mes : meses31) System.out.println(mes);
                break;
            }
        }
            do {
                System.out.println("Digite uma quantidade de dias valida: ");
                dias = scanner.nextInt();
            }
            while (dias != 28 && dias != 30 && dias != 31);

    }
}
