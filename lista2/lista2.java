import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("digite o peso: ");
    float peso = sc.nextFloat();
    System.out.print("digite a altura: ");
    float altura = sc.nextFloat();
    float IMC = peso /(altura * altura);

      if (IMC <= 18.5){
        System.out.println("\nAbaixo do peso");
      }if(IMC <= 25){
        System.out.println("\nPeso normal");
      }if(IMC <= 30){
        System.out.println("\nAcima do peso");
      }if (IMC > 30){
        System.out.println("\nObeso");
      }
  }
}