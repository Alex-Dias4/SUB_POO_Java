import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a altura: ");
    float altura = sc.nextFloat();
    float maior = altura;
    float menor = altura;

    for (int i=0; i<15; i++){
      System.out.print("Digite a altura: ");
      altura = sc.nextFloat();

      if (maior > altura){
        maior = altura;
      }else if(menor < altura){
        menor = altura;
      }
    }

    System.out.printf("A altura maior é %.2f e a menor é %.2f\n",maior,menor);
  }
}