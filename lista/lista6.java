import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXY   Z";
    char letra = sc.next().charAt(0);

    for(int i = 0; i< alfabeto.length(); i++){
      if(letra == alfabeto.charAt(i)){
        System.out.println("A proxima letra do alfabeto é: " + alfabeto.charAt(i+1));
      }
    }

      
  }
}