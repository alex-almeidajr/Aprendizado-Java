package programa;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) { 

        Scanner ler = new Scanner(System.in);
        float metro, centimetro;
    System.out.println("Informe o tamanho em metros que deseja converter em centímetros: ");
    metro = ler.nextFloat();
    
    centimetro = metro*100;

    System.out.println("O tamanho em centímetros é: "+centimetro);
    }
}