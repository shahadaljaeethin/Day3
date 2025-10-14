import java.util.Scanner;

public class D3Conditional {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //1.Write a program that checks the role of the user
        System.out.print("Welcome user!\nplease enter your role:");
        String role = read.next();
        if(role.equals("admin")) System.out.print("Welcome admin!");
        else if(role.equals("superuser")) System.out.print("Welcome superuser!");
        else System.out.print("Welcome user!");

    }
}
