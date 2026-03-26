import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c;

      if (a == b){
        c = a+b;
      }else{
        c =a*b;
      }
    System.out.printf("O resulta do de c é %d\n", c);
  }
}