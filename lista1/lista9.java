import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    final float preco = (float) 0.22;
    System.out.print("digite quantos pães dedeja comprar: ");
    int quant = sc.nextInt();

      System.out.printf("O valor total foi %.2f\n", quant * preco);
  }
}