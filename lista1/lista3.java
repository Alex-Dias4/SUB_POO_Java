import java.util.Scanner;

public class main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    float n1 = sc.nextFloat();
    float n2 = sc.nextFloat();

    System.out.printf("A divisão de %.2f por %.2f é igual a: %.2f\n", n1, n2, n1/n2);
  }
}