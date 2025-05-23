public class Main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        double a = 10;
        double b = 5;

        System.out.println("Soma dos valores = "+calc.somar(a, b));
        System.out.println("Subtração dos valores = "+calc.subtrair(a, b));
        System.out.println("Multiplicação dos valores = "+calc.multiplicar(a, b));
        System.out.println("Divisão dos valores = "+calc.dividir(a, b));
    }
}
