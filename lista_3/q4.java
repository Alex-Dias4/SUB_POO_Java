import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor a ser fatorado:");
    int n1 = sc.nextInt();
    int resultado = n1;

    System.out.printf("%d! = ", n1);

    for(int i = n1; i> 1; i--){
      System.out.printf("%d X ", i);
      resultado *= (i -1);
    }

    System.out.printf("X 1 = %d\n", resultado);
  }


}