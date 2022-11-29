package programa;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) { 
        float n1, n2, n3, n4, media;
        Scanner ler = new Scanner(System.in);
    
    System.out.println("Primeira nota: ");
    n1 = ler.nextFloat();

    System.out.println("Segunda nota: ");
    n2 = ler.nextFloat();
    
    System.out.println("Terceira nota: ");
    n3 = ler.nextFloat();

    System.out.println("Quarta nota: ");
    n4 = ler.nextFloat();
    
    media = (n1+n2+n3+n4)/4;
    System.out.println("A média do aluno é: "+media);
    }
}