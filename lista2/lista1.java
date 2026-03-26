import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int valor = sc.nextInt();

      if (valor%2 == 0){
        System.out.println("É da par");
      } if(valor%2 == 1){
        System.out.println("É impar");
      }
  }
}