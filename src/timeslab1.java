import java.util.Scanner;
public class timeslab1 {
    public void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Welcome to Q12, lets convert the seconds to an HH:MM:SS!");
        System.out.println("enter seconds:");
        int secondsRead = read.nextInt();
        double hours, min, sec;  //86399 example temp note
        min= (secondsRead/60)%60;
        hours = secondsRead/60/60;
        sec = secondsRead%60;
        //sec = min%60;
        System.out.println(hours+" : "+min+" : "+sec);
    }
}
