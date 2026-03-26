import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o ano de nacimento: ");
    int anoNacimento = sc.nextInt();
    int idade = 2026 - anoNacimento;

      if (idade < 16){
        System.out.println("Não pode votar");
      }else if (idade < 18 || idade > 70){
        System.out.println("pode votar, não obrigatorio");
      }else{
        System.out.println("obrigatorio votar");
      }
  }
}