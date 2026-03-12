import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  float altura = scanner.nextFloat();
  float largura = scanner.nextFloat();
  float perimetro = 2*(altura + largura);

    System.out.printf("o perimetro da altura %.2f e lagura %.2f é %.3f \n", altura, largura, perimetro);

  }
}