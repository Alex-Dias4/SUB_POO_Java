import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float n1 = sc.nextFloat();
    float n2 = sc.nextFloat();
    float media = (n1+n2)/2;

      if (media >= 6){
        System.out.println("Aprovado");
      }else{
        System.out.println("Reprovado");
      }
  }
}