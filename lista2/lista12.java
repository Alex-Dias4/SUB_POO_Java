import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro numero: ");
    int n1 = sc.nextInt();
    System.out.print("Digite o segundo numero: ");
    int n2 = sc.nextInt();

    System.out.print("Escolha a operação desejado:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\nDigite o numero: ");
    int opcao = sc.nextInt();

    switch (opcao){
      case 1:
        System.out.printf("O resultado da adição: %d\n", n1 + n2);
        break;
      case 2:
        System.out.printf("O resultado da subtração: %d\n", n1 - n2);
        break;
      case 3:
        System.out.printf("O resultado da multiplicação: %d\n", n1 * n2);
        break;
      case 4:
        System.out.printf("O resultado da divisão: %.2f\n",(float) n1 / n2);
        break;
      default:
        System.out.println("Valor Invalido");
    }
  }
}