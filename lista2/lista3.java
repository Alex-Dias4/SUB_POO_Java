import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("digite a para alcool e g para gasolina: ");
    char typeCombustivel = sc.next().charAt(0);
    System.out.print("digite os litros: ");
    float litros = sc.nextFloat();
    double valor;

    if (typeCombustivel == 'a'){
      valor = litros * 1.90;
    }
    if (typeCombustivel == 'g'){
      valor = litros * 2.70;
    }
    if (typeCombustivel == 'a' || typeCombustivel == 'g'){
        System.out.printf("O valor pago é %.2f\n", valor);
    }
  }
}