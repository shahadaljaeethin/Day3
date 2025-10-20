import  java.util.*;
public class Day7 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
//        print("Hello, please enter your name");
//String name = read.next();
//checkName(name);

ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(2);
        numbers.add(17);
        //even(numbers);

        int num1,num2;
//        print("please enter two numbers.\nthe first number:");
//        num1 = read.nextInt();
//        print("the second number:");
//        num2 = read.nextInt();
//        print("The sum is "+sum(num1,num2));
//        print("the average is "+avr(sum(num1,num2)));
        String[] names = {"Sara","Majd","Sami"};
      System.out.println(namesNew(names));

    }
public static ArrayList<String> namesNew(String[] list){
        ArrayList<String> names = new ArrayList<>();
        for(String n: list){
            if(n.charAt(0)=='S')
                names.add(n);
        }

        return  names;
}

public static void even(ArrayList<Integer> list){
        for(int n: list){
            if(n%2==0)
                System.out.println(n);

}}
public static void print(String message){
        System.out.println(message);

       if(1==1)
           return;
    System.out.println("****TEST THIS LINE****");


}
public static void checkName(String name){
        if(name.length()<5)
        System.out.println(name+" is a short name.");
        else
         System.out.println(name+" is a long name.");

}
public static int sum(int n1, int n2){
        return n1+n2;
}
static double avr(int sum){
        return sum/2;
}
}
