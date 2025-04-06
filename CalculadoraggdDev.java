package CalculadoraJava;
import java.util.Scanner;
public class CalculadoraggdDev {

    public static void main(String[] args) {
        Scanner at = new Scanner(System.in);
        
        System.out.println("Olá! Bem-vindo a ggdDevCalculadora!\n");
        System.out.println("Nos diga seu nome: ");
        String nomeUser = at.nextLine();
        
        System.out.println("Informe o primeiro número do seu cálculo: ");
        double num1 = at.nextDouble();
        at.nextLine();
        System.out.println("Informe o segundo número do seu cálculo: ");
        double num2 = at.nextDouble();
        at.nextLine();
        
        System.out.println("Agora informe o tipo de operador: (1) Adição | (2) Subtração | (3) Multiplicação | (4) Divisão");
        int respOperador = at.nextInt();
        at.nextLine();
        
        Calculos conta = new Calculos(num1, num2, respOperador);
        
        System.out.println(conta.Calcular());
    }
    
}
