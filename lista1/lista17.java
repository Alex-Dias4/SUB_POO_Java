import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    float precoInicial = sc.nextFloat();
    float precoFinal = sc.nextFloat();
    float inflacao = ((precoFinal - precoInicial)/ precoInicial) * 100;

    System.out.printf("A inflação de %.2f para %.2f foi de %.2f\n", precoInicial, precoFinal, inflacao);

  }
}