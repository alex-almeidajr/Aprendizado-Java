package programa;
import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) { 
        float lado;
        Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o tamanho do lado do quadrado: ");
    lado = ler.nextFloat();
    
    float area = lado*lado;

    System.out.printf("O dobro da área do quadrado é: %.2f %n", (area*2));    
    }
}
