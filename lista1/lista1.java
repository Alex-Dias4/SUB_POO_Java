import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  int inteiro = scanner.nextInt();
  float pontoFlutuante = scanner.nextFloat();
  char texto = scanner.next().charAt(0);


    System.out.println("O inteiro é: " + inteiro);
    System.out.println("O float é: " + pontoFlutuante);
    System.out.println("A string é: " + texto);

  }
}