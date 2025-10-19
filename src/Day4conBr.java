import java.util.Random;
import java.util.Scanner;

public class Day4conBr {
    public void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("welcome to to truth or dare planner game: ");

        System.out.print("how many member are there in the gathering ?");
        int members = in.nextInt();
        System.out.print("how many round to play ?");
        int rounds = in.nextInt();

        String  choice = " " ;
        int randomchoice = 0 ;
        int playerchoice = 0, playerschoice = 0 ;

        for (int i = 0; i < rounds; i++) {

            System.out.print("Round  "+ (i+1) + " Started\n" );

            for (int j = 0; j < members; j++) {
                randomchoice = rand.nextInt(2) ;
                if (randomchoice == 0 ) {
                    choice = "Dare";
                }else if (randomchoice == 1) {
                    choice = "Truth";
                }
                System.out.println("member "+ (j+1) + " turn to play "+ choice);
                System.out.println("Are you able to do it ? (press 1 for yes/ press 2 for no)");
                playerchoice = in.nextInt();
                if ( playerchoice == 2 ){
                    System.out.println("the player turn will pass.");
                    continue;
                }else if (playerchoice == 1){
                    System.out.println("thank you for playing");
                }else {
                    System.out.println("please pay attention to the game and make a choice");
                }
            }

            System.out.println("do all players want to continue the next round? (press 1 for yes/ press 2 for no)");
            playerschoice = in.nextInt();
            if ( playerschoice == 2 ){
                System.out.println("Game ended.");
                break;
            }else {
                System.out.println("new round will start 🙂 ");
            }
        }


    }
}
