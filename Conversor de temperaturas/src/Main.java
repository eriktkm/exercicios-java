import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Pega uma temperatura em Celsius(°C) e a converte para Kelvin(°K), Réaumur(°Ré), Rankine(°Ra) e Fahrenheit(°F)
        double tempC;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        tempC = scanner.nextDouble();
        System.out.println("A temperatura convertida é: \nKelvin: " + tempC + 273.15 +
                "\nRéaumur: " + tempC * 0.8 + "\nRankine: " + (tempC * 1.8) + 32 + 459.67 + "\nFahrenheit: " + (tempC * 1.8) + 32);
    }
}