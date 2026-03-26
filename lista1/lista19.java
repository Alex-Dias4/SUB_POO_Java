import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    float salario = sc.nextFloat();
    salario -=  salario * 0.08;


    System.out.printf("O salario iquido é %.2f\n", salario);

  }
}