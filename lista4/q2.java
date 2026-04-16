import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A[] = new int[10];
    int B[] = new int[10];
    int C[] = new int[10];

    for (int i = 0; i<10; i++){
      System.out.println("digite o valor a ser inserido no array A:");
      A[i] = sc.nextInt();
      System.out.println();
    }
    
    for (int i = 0; i<10; i++){
      System.out.println("digite o valor a ser inserido no array B:");
      B[i] = sc.nextInt();
      System.out.println();
    }

    for (int i = 0; i<10; i++){
      C[i] = A[i] - B[i];
    }
    for (int i = 0; i<10; i++){
      System.out.print(C[i]);
    }
    System.out.println();
 }
}