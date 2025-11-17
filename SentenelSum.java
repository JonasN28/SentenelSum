import java.util.Scanner;

public class SentenelSum {
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   int number = 0;
   int sum = 0;
      while(!(number == -1)){
         sum += number;
         System.out.print("type in a number and then press enter, once you enter -1, the program will give you a sum : ");
         number = scan.nextInt();
      }
   System.out.println("The sum is : " + sum);
   }
}