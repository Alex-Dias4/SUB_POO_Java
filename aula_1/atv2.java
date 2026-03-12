import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  float num1 = scanner.nextFloat();
  float num2 = scanner.nextFloat();

  System.out.println("a soma é: " + (num1 + num2));
  System.out.println("a subtracao é: " + (num1 - num2));
  System.out.println("a divisão" + (num1 / num2));
  System.out.println("a multiplicação é: " + (num1 * num2));
  }
}