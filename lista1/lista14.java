import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    float salario = sc.nextFloat();
    float percentual = sc.nextFloat();
  
    float SalarioFinal = salario + ((percentual / 100) * salario);

    System.out.printf("O salario final coma base %.2f com o percentual de %.2f é %.2f\n", salario, percentual, SalarioFinal);

  }
}