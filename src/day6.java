import java.util.*;

public class day6 {
public void main(String[] args){
    System.out.println("Arrays");
    String[] cars = {};  //null
    int[] numbers = {1,7,6,8,10}; //length of 4, 0-3
    String[] sisters = {"shahad","haya"};
   // for(int i=0;i<numbers.length;i++)  System.out.println(numbers[i]);
    for(int i=0;i<sisters.length;i++)  System.out.println(sisters[i]);
    for(int i=0;i<cars.length;i++)  System.out.println(cars[i]);
    System.out.println(Arrays.toString(sisters));

//
//    for(int i =0;i<numbers.length;i++){
//        if(numbers[i]%2==0)
//            System.out.println(numbers[i]+" is even.");
//        else  System.out.println(numbers[i]+" is odd.");
//
//    }
//   // int lastIndex=0;
    String[] names = {"Sara","Majd","Sameer","Ahmed","Suha"};
//    for(int i=0;i<names.length;i++){
////        lastIndex = names[i].length()-1;
////        System.out.println(names[i].charAt(lastIndex)+",");
//        if(names[i].charAt(0)=='S')
//            System.out.print(names[i]+" ");
//    }
//    System.out.print("\n");
//names[0]+=",Edit";
  //  System.out.print(names[0]+"\n");
for(int i:numbers){
    if(i%2==0)  System.out.println(i+" is even.");
else  System.out.println(i+" is odd.");

}
for(String n: names)
{
    if(n.charAt(0)!='S') continue;
    System.out.print(n+", ");
}

ArrayList info = new ArrayList();
ArrayList<String> str = new ArrayList();
str.add("one");
str.add("delete this");
str.remove("delete this");
//str.add(6,"seven");
//.set("") for updating.

    ArrayList<String> cars2 = new ArrayList();
    cars2.add("BMW");
    cars2.add("Ford");
    cars2.add("Mazda");
    cars2.remove("null");
if(    cars2.remove("null")
)    System.out.println("deleted"); else     System.out.println("not deleted");
cars2.set(0,"New bmw");

    System.out.println(cars2);
ArrayList<String> colors = new ArrayList();
colors.add("red");
colors.add("black");
colors.add("green");
colors.add("blue");
colors.set(1,"white");
colors.remove("green");
System.out.println(colors);






}
}
