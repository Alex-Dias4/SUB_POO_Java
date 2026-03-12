import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  float celsius = scanner.nextFloat();
  float fahrenheit = (celsius * 9/5) +32;
  
    System.out.printf("a convesão de %.2f em celsius em fahrenheit é: %.2f \n", celsius, fahrenheit);
  
  }
}