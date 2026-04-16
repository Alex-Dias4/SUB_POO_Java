import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite 1 para continuar e 0 para sair: ");
    int condicao = sc.nextInt();
    int opcao = 0;
    int n1, n2;

    while(condicao != 0){
      System.out.print("\033[H\033[2J");
      System.out.print("Digite o primeiro numero: ");
      n1 = sc.nextInt();
      System.out.print("Digite o segundo numero: ");
      n2 = sc.nextInt();
      
      System.out.print("Digite:\n1 - para somar\n2 - para subritrair\n3 - para multiplicar\n4 - para dividir\n");
      opcao = sc.nextInt();
      switch(opcao){
        case 1:
          System.out.printf("A soma de %d com %d é %d\n",n1,n2, n1 + n2);
          break;
        case 2:
          System.out.printf("A subtração de %d com %d é %d\n",n1,n2, n1 - n2);
          break;
        case 3:
          System.out.printf("A multiplicação de %d com %d é %d\n",n1,n2, n1 * n2);
          break;
        case 4:
          System.out.printf("A divisão de %d com %d é %.2f\n",n1,n2, (double) n1 / n2);
          break;
        default:
          System.out.print("Opção invalida\n");
      }

      System.out.print("Digite 1 para continuar e 0 para sair: ");
        condicao = sc.nextInt();
    }
  }
}