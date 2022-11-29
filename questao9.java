package programa;
import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) { 
        double temperatura, celsius;
        Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe a temperatura em Fahrenheit: ");
    temperatura = ler.nextDouble();
    //celsius = ((temperatura-32) * (5/9));
    celsius = 5 * ((temperatura-32) / 9);
    System.out.printf("A temperatura em Celsius é:  %.1fº",celsius);
    }
}
