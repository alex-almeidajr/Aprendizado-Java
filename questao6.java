package programa;
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) { 

        Scanner ler = new Scanner(System.in);
    
    System.out.println("Qual o raio do circulo a ser calculado a área: ");
    float raio = ler.nextFloat();
    
    double area = Math.PI*(raio*raio);
    System.out.printf("A área do círculo é: %.2f %n", area);
    }
}
