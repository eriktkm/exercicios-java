//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }
    public double subtrair(double a, double b) {
        return a - b;
    }
    public double multiplicar(double a, double b) {
        return a * b;
    }
    public double dividir(double a, double b) {
        if (a == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else if (b ==0) {
            System.out.println("Não é possível dividir por zero");
        }
        return a / b;
    }

}