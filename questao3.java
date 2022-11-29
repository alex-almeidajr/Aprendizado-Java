package programa;
import java.util.Scanner;

public class questao3{
	public static void main(String[] args){
		int num, num2, resultado;
		Scanner ler = new Scanner(System.in);	
	
System.out.println("Digite um numero: ");
num = ler.nextInt();

System.out.println("Digite outro numero: ");
num2 = ler.nextInt();

resultado = num + num2;
System.out.println("Resultado da soma dos números: "+resultado);

}
}