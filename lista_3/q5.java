import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int soma = 0;


    for( int i = 1; i <= 500; i++){
      if (i % 3 == 0){
        if (i %2 == 1){
          soma += i;
        }
      }
    }
    System.out.println(soma);

  }
}