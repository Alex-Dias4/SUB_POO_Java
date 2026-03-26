import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a > b){
      if(a >c){
        System.out.printf("O %d é maior ou igual que %d e/ou %d\n", a, b, c);
      }else if(c>b){
        System.out.printf("O %d é maior ou igual que %d e/ou %d\n", c, a, b);
      }
    } else{
        if(b>c){
          System.out.printf("O %d é maior ou igual que %d e/ou %d\n", b, a, c);
        }else {
          System.out.printf("O %d é maior ou igual que %d e/ou %d\n", c, a, b);
        }
    }
  }
}