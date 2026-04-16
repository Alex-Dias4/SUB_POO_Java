import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A[][] = new int[4][4];
    int B[][] = new int[4][4];
    int C[][] = new int[4][4];
    

    for (int i = 0; i<4; i++){
      for( int j = 0; j<4; j++){
        System.out.printf("digite o valor a ser inserido na A[%d][%d]:", i, j);
        A[i][j] = sc.nextInt();
      }
    }

    System.out.println()

    for (int i = 0; i<4; i++){
      for( int j = 0; j<4; j++){
        System.out.print("[" + A[i][j] + "]" +"  ");
      }
      System.out.println();
    }

    System.out.println()
    
    for (int i = 0; i<4; i++){
      for( int j = 0; j<4; j++){
        System.out.printf("digite o valor a ser inserido na B[%d][%d]:", i, j);
        B[i][j] = sc.nextInt();
      }
    }

    System.out.println()

    for (int i = 0; i<4; i++){
      for( int j = 0; j<4; j++){
        System.out.print("[" + B[i][j] + "]" +"  ");
      }
      System.out.println();
    }

    System.out.println()

    for (int i = 0; i<4; i++){
      for( int j = 0; j<4; j++){
        if (A[i][j] < B[i][j]){
          C[i][j] = B[i][j];
        }else{
          C[i][j] = A[i][j];
        }
      }
    }

    System.out.println()

    for (int i = 0; i<4; i++){
      for( int j = 0; j<4; j++){
        System.out.print("[" + C[i][j] + "]" +"  ");
      }
      System.out.println();
    }

    System.out.println()
 }
}