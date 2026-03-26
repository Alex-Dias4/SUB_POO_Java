import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int temp;

    System.out.printf("O valores antes da troca A = %d  e B = %d\n", a, b);
    temp = a;
    a = b;
    b = temp;
    System.out.printf("O valores depois da troca A = %d  e B = %d\n", a, b);
    
  }
}