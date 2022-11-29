package programa;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) { 
        double vHora, qtdHoras, salario;
        Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o valor da sua hora: ");
    vHora = ler.nextFloat();
    
    System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
    qtdHoras = ler.nextFloat();
    
    salario = qtdHoras * vHora;
    System.out.printf("O seu salário é: R$ %.2f %n", salario);
    }
}
