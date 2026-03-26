import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma letra: ");
    char letra = sc.next().charAt(0);

    switch (letra){
      case 'a':
        System.out.println("A letra é uma vogal");
        break;
      case 'e':
        System.out.println("A letra é uma vogal");;
        break;
      case 'i':
        System.out.println("A letra é uma vogal");
        break;
      case 'o':
        System.out.println("A letra é uma vogal");
        break;
      case 'u':
        System.out.println("A letra é uma vogal");
        break;
      default:
        System.out.println("A letra é uma consoante");
    }
  }
}