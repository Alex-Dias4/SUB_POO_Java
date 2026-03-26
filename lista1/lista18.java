import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int segundos = sc.nextInt();
    int minutos = (int) segundos / 60;
    int segundosResto = segundos % 60;

    System.out.printf("%d:%d\n", minutos, segundosResto);

  }
}