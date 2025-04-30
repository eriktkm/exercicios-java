import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String mes;
        int dias=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saiba quantidade de dias do mês");
        System.out.print("\n");
        System.out.println("Nome do mês:");
        mes = scanner.next();
        while (true){
            switch (mes) {
                case "Janeiro":
                    dias = 31;
                    break;

                case "Fevereiro":
                    dias = 28;
                    break;

                case "Março":
                    dias = 31;
                    break;

                case "Abril":
                    dias = 30;
                    break;

                case "Maio":
                    dias = 31;
                    break;

                case "Junho":
                    dias = 30;
                    break;

                case "Julho":
                    dias = 31;
                    break;

                case "Agosto":
                    dias = 31;
                    break;
                case "Setembro":
                    dias = 30;
                    break;

                case "Outubro":
                    dias = 31;
                    break;

                case "Novembro":
                    dias = 30;
                    break;

                case "Dezembro":
                    dias = 31;
                    break;


                default:
                    System.out.println("Resposta inválida! Tente novamente: ");
                    mes = scanner.next();
                    continue;
            }
            System.out.println("O mês de "+mes+" tem "+dias+" dias. ");
            break;
        }
        scanner.close();
    }
}