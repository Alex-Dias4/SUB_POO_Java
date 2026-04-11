import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int valor = sc.nextInt();
    int v1= 0;
    int v2= 0;
    int v3= 0;
    int v4= 0;

      while(valor >= 0){
        if(valor <= 25){
          v1++;
        }else if(valor <= 50){
          v2++;
        }else if(valor <= 75){
          v3++;
        }else if(valor <= 100){
          v4++;
        }
        valor = sc.nextInt();
      }
    System.out.printf("A quantidade de:\n[0-25]: %d\n[26-50]: %d\n[51-75]: %d\n[76-100]: %d\n", v1, v2, v3, v4);
    
  }
}