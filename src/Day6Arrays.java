import java.util.*;
public class Day6Arrays {

public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int size1;
    System.out.println("Welcome, enter the length of array you want to make (must contains at least two).");
    while(true){
 size1 = read.nextInt();
if(size1>=2) break;
System.out.println("please write again, (must contains at least two)");

    }
    int[] numbers1 = new int[size1];
    for(int i=0;i<numbers1.length;i++){
        System.out.println("please write the "+(i+1)+"th number");
    numbers1[i] = read.nextInt(); }
    System.out.print("number #"+numbers1[0]+" and #"+numbers1[numbers1.length-1]+" are ");
    if(numbers1[0]==numbers1[(numbers1.length-1)])   System.out.println("are equals.");
    else  System.out.println("are NOT equals.");

System.out.println("************");
System.out.println("Q1 ended.\n\nQ2 started");
int[] numbers2 = {1, 4, 17, 7, 25, 3, 100};
double average2 = 0,sum2 =0;
for(int i=0;i<numbers2.length;i++) sum2+=numbers2[i];
    average2 = sum2/numbers2.length;
ArrayList larger = new ArrayList();
    for(int i=0;i<numbers2.length;i++) {
    if(average2<numbers2[i]) larger.add(numbers2[i]);
    }
System.out.print("The numbers which larger than the average: ("+average2+") are: ");
    System.out.println(larger);
    System.out.println("************");
    System.out.println("Q2 ended.\n\nQ3 started");


int[] numbers3 = {20,30,40,50,60};
if(numbers3[0]>numbers3[4])
    System.out.println("#"+numbers3[0]+" are larger than #"+numbers3[4]+".");
else     System.out.println("#"+numbers3[4]+" are larger than #"+numbers3[0]+".");

    System.out.println("************");
    System.out.println("Q3 ended.\n\nQ4 started");

    ArrayList<String> swap = new ArrayList();
    swap.add("first");
    swap.add("second");
    swap.add("last");
    System.out.println("the list before: "+swap);

    String temp1 = swap.get(0), temp2= swap.get(2);
    swap.set(0,temp2);
    swap.set(2,temp1);

    System.out.println("the list after: "+swap);
    System.out.println("************");
    System.out.println("Q4 ended.\n\nQ5 started");
    ArrayList<Integer> oddFirst = new ArrayList();
    int[] randomInt = {1,2,2,4,5,3,6,7,9,1,14};
    //








}
}
