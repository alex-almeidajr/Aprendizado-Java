package programa;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) { 
        double temperatura, fahrenheit;
        Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe a temperatura em Celsius: ");
    temperatura = ler.nextDouble();
    //celsius = ((temperatura-32) * (5/9));
    fahrenheit = (temperatura * 1.8) + 32;
    System.out.printf("A temperatura em Celsius é: %.1fº",fahrenheit);
    }
}
