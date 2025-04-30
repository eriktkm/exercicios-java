import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double preco, precoDesconto;
        String categoria;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTabela de descontos: \n1) Eletrônicos: 10% de desconto\n2) Roupas: 5% de desconto\n3) Alimentos: 2% de desconto\n");
        System.out.println("Digite a categoria: ");
        categoria = scanner.next();
        System.out.println("Digite a preço: ");
        preco = scanner.nextDouble();

        switch (categoria){
            case "1":
                System.out.println("O valor com desconto é: R$"+(preco - preco * 0.1));
                System.out.println("O desconto é de: R$"+(preco * 0.1));
                break;
            case "2":
                System.out.println("O valor com desconto é: R$"+(preco - preco * 0.05));
                System.out.println("O desconto é de: R$"+(preco * 0.05));
                break;

            case "3":
                System.out.println("O valor com desconto é: R$"+(preco - preco * 0.02));
                System.out.println("O desconto é de: R$"+(preco * 0.02));
                break;
        }
    }
}