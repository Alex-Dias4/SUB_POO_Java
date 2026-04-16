import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int valores[] = new int[10];

    for (int i = 0; i<10; i++){
      System.out.println("digite o valor a ser inserido no array:");
      valores[i] = sc.nextInt();
    }

    System.out.println();
    
    for (int i = 0; i<10; i++){
      int test = valores[i];
      for( int j = 9; j>i; j--){
        if (test == valores[j] && i != j){
          System.out.print(test+" ");
        }
      }
    }
    System.out.println();
 }
}