
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("you have new package.");
//int choice;
//        do{
//            choice=0;
//            System.out.println("choose from menu:\n1.what is expected time to pickup?\n2.where is my package now?\n3.exit");
//            choice = sc.nextInt();
//
//            if(choice == 1)System.out.println("\n\n[3/10/2025] ");
//            else if(choice == 2)System.out.println("in Riyadh.");
//            else  if(choice != 3)System.out.println("wrong input");
//            }while(choice!=3);
//        System.out.print("Hello, enter a number to see its factorial");
//        int num = sc.nextInt();
//        for(int i=num;i<=50;i--)
//         System.out.println(i);

        //second place
        /*
        int num=0,sum=0;
        do{
                 System.out.println("enter number for sum:  [0 for ending]");
                 num = sc.nextInt();
                 sum+=num;

    }while(num!=0);
        System.out.println("The sum is: "+sum);
*/

        System.out.println("enter a number to show its mulipy table:");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

          System.out.println("["+number+"*"+i+"="+(i*number)+"]");

        }
        }
        }









