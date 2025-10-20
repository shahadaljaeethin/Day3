import  java.util.*;


public class Day6Temp {
    public static void main(String[] args) {
        //read info
        ArrayList<Double> days = arrayMaker();
        //show statics
        showStatics(average(days,sum(days)),sum(days),days.size());

    }//end of main

    public static ArrayList<Double> arrayMaker(){
        double temp;
        int day=1; //good UX
        ArrayList<Double> result = new ArrayList<>();
        Scanner r = new Scanner(System.in);
        while(true){
            System.out.println("Enter Day "+day+"'s temperature in °C.      (enter 100 to exit)");
            temp = r.nextDouble();
            if(temp==100) return result;
            if(temp<80&&temp>-80){
            result.add(temp);
            day++;
            }else {
                System.out.println("wrong input.");
            }

        }
    }
    public static double sum(ArrayList<Double> l){
        double sum=0;
for(double n: l)
{sum+=n;}
        return sum;
    }

    public static double average(ArrayList<Double> list,double sum){
     int size = list.size();
     double average =0;
     average = sum/size;

     return average;


    }

    public static void showStatics(double avr, double sum, int size){
        System.out.println("number of days: "+size);
        System.out.println("total temperature: "+sum);
        System.out.println("the average temperature: "+avr);


    }
    }
