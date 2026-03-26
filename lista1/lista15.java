import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    float base = sc.nextFloat();
    float altura = sc.nextFloat();

    float perimetro = (base * 2) + (altura * 2);

    System.out.printf("O perimetro final com a base %.2f e a altura %.2f é %.2f\n", base, altura, perimetro);

  }
}