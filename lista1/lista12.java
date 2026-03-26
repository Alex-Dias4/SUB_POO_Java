import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    float n1 = sc.nextInt();
    float n2 = sc.nextInt();
    float media = (n1+n2)/2;

    System.out.printf("a media aritimentrica das notas %.0f, %.0f é igual a %.2f\n", n1,n2, media);

  }
}