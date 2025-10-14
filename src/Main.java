import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        //scanner
        Scanner read = new Scanner(System.in);

        System.out.println("student info: ");
        float weight = 60.2888f;
        double weight2 = 60.2888888;
        String name = "Haya";
        boolean student = true;
        int salary = 1000;
        char gender = 'F';

       // System.out.println("name:"+name+"\nweight: ("+ weight+" "+weight2+")\nsalary: "+salary+"\ngender:"+gender);
        //summary:
        /* Java datatypes are
        -String
        -boolean
        -double
        -float
        -char
        -int
        end of the long comment
         */
//        System.out.println("Enter your name:");
//        name = read.nextLine();
//        System.out.println("Enter your salary:");
//        salary = read.nextInt();
//        System.out.println("Enter your weight:");
//        weight2 = read.nextDouble();
//        System.out.println("Enter your gender: F/M");
//        gender = read.next().charAt(0);
//        if(gender == 'F' || gender == 'f')
//        gender = 'F';
//        else
//            gender = 'M';

         System.out.println("name:"+name+"\nweight: ("+weight2+")\nsalary: "+salary+"\ngender:"+gender);

int one = 1, two =2, four = 4, five =5;
System.out.println("(1+5+4)/2="+((one+five+four)/2));

boolean comp1 = one <= four, comp2 = five > four || five == one;
 System.out.println(comp2);


//boolean nameTest = name.equals("Haya");
//System.out.println(nameTest);

String str = "learning Java";
System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());
System.out.println(str.trim());
System.out.println(str.replace("Java", "Python"));
System.out.println(str.replaceAll("a", "A"));
System.out.println(str.charAt(0));
System.out.println(str.contains("Java"));

//if()  -Day 3.

        System.out.println("Enter your salary:");
        salary = read.nextInt();



    }

}
