import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int valores[][] = new int[3][3];
    int soma = 0;

    for (int i = 0; i<3; i++){
      for( int j = 0; j<3; j++){
        System.out.printf("digite o valor a ser inserido na matriz[%d][%d]:", i, j);
        valores[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i<3; i++){
      for( int j = 0; j<3; j++){
        if (i<j){
          soma += valores[i][j];
        }
      }
    }

    System.out.println(soma);
    
 }
}