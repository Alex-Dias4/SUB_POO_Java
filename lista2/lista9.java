import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu sexo homem (h) ou mulher (m): ");
    char sexo = sc.next().charAt(0);
    System.out.print("Digite sua porcentagem de gordura: ");
    float gordura = sc.nextFloat();
    

      if (sexo == 'h'){
        if(gordura < 20 ){
          System.out.printf("O percentual de %.2f, está abaixo para homens\n", gordura);
        } else if(gordura > 24){
          System.out.printf("O percentual de %.2f, está acima para homens\n", gordura);
        }else{
          System.out.printf("O percentual de %.2f, está ideal para homens\n", gordura);
        }
      }else if(sexo == 'm'){
        if(gordura < 16 ){
          System.out.printf("O percentual de %.2f, está abaixo para mulheres\n", gordura);
        } else if(gordura > 20){
          System.out.printf("O percentual de %.2f, está acima para mulheres\n", gordura);
        }else{
          System.out.printf("O percentual de %.2f, está ideal para mulheres\n", gordura);
        }
      }else{
        System.out.println("Sexo invalido");
      }
  }
}