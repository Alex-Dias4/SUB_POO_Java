import java.util.Scanner;


public class Main {
  public static void main(String[] args){
    System.out.println("Hello world!");

    int idade = 1;

    // int idade2 = {int}20.5;

    // Integer idade3 = new Integer(20);
    Scanner scanner = new Scanner(System.in);

    int numero= scanner.nextInt();
    System.out.println(Math.pow(numero, 3));


    // System.out.println(numero);
    System.out.println(numero + Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
  }
}