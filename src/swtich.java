import java.util.Scanner;
public class swtich {
    public static void main(String[] args) {
    //Day 3 - swthch - osi asks a lot abt it
Scanner read = new Scanner(System.in);
        System.out.println("what is the transion way you will take to Tuwaiq? 1.car 2.train .3.walk");
        int way = read.nextInt();
        switch (way){
            case 1:
                System.out.println("come early");
                break;
            case 2:
                System.out.println("book a ticket");
            break;

            case 3:
                System.out.println("think twice");
                break;

                default:
                    System.out.println("invalid choice");

        }
    }
    }
