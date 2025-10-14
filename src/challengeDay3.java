import java.util.Scanner;

public class challengeDay3

{
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
//    System.out.println("enter a number");
//    int num = read.nextInt();
//    boolean is = num*2>=100;
//    if(num>=0&&(is)){
//        System.out.println("large");
//    }
//    else{
//        System.out.println("small");
//    }
//        System.out.println("enter a number");
//        int num1 = read.nextInt();
//        System.out.println("enter a number");
//        int num2 = read.nextInt();
//        int sum = num1 + num2;
//        boolean isEven = sum%2==0;
//        boolean is4 = sum%4==0;
//        if(isEven && is4){System.out.println("Yes");}

        System.out.println("choose from menu:\n1.check if devidable by 5.\n2.check if even or odd.\n3.end program");
        int menu = read.nextInt();

        switch (menu){
            case 1:
System.out.println("enter a number");
int n2=read.nextInt();
if(n2%5==0)
System.out.println("the number is devideable by 5");
else System.out.println("the number is NOT");

                break;
                case 2:
            System.out.println("enter a nymber");
            int n1=read.nextInt();
            if(n1%2==0)
                System.out.println("the number is even");
            else System.out.println("the number is odd");
                break;
            case 3:
                break;
        }







    }}
