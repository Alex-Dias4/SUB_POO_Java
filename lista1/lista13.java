import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();
    System.out.printf("O sucessor de %d é %d\n", n1, n1+1);
  }
}
