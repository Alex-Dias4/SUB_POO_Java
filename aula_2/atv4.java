import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int idade = sc.nextInt();

      if (idade > 18){
        System.out.println("É Maior de idade, pode ser preso");
      }else{
        System.out.println("É menor de idade");
      }
  }
}