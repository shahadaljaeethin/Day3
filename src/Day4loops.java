import java.util.Scanner;
public class Day4loops {
public static void main(String[] args){
/*Q1: Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
*/
    for(int i=1;i<=100;i++)
    {
        if(i%3==0){     //in case 3, we can check also on 5.
        System.out.print("\nFizz");
        if(i%5==0) System.out.println("Buzz");
        else System.out.print("\n");
            continue;
    } else
    if(i%5==0)
    {System.out.println("Buzz"); //in case 5 alone.
        continue;
    }//in case 5 alone.
    System.out.println(i); //normal number

    }
/*-------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------
 Q2

 Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT  */
String word="", reverse="";
Scanner input = new Scanner(System.in);
System.out.println("Enter a word/sentence to reverse it.");
word = input.nextLine();
for(int i=1;i<word.length();i++){

}




}} //end of main$class

