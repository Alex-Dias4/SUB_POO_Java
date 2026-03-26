import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int base = sc.nextInt();
    int quadrado = base * base;
    int cubo = base * base * base;
    

    System.out.printf("%d ao quadrado = %d \n%d ao cubo = %d\n", base, quadrado,base, cubo);

  }
}