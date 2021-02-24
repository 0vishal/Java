
public class Snakeandladder {

    public static void main (String args[]) {
        System.out.println("Lets play snake and ladder");
   

        //DEFINE SNAKE AND LADDERS POSITION
        int [] LADDER = {4,24,48,67,86};
        int [] LADDERADD = {13,20,15,12,8};
        int [] SNAKE = {22,28,33,47,55};
        int [] SNAKESUB = {8,10,14,6,9};
        int FINAL_POSITION = 100;
        //POSITION
        int POSITION = 0;
        
        while( POSITION < FINAL_POSITION ) {
            int DICE = (int)Math.floor(Math.random() * (6 - 1 + 1 ) + 1);
	    POSITION = POSITION + DICE;

            if ( POSITION > FINAL_POSITION ) {
                POSITION = POSITION - DICE;
            }
            if ( POSITION == FINAL_POSITION ) {
                System.out.println(" Game Completed ");
            }
	
        }

        //LADDER AND SNAKE IN THE GAME
        for (int i = 0; i < LADDER.length; i++) {
            if (POSITION == LADDER[i]) {
                POSITION = POSITION + LADDERADD[i];
            }
            if (POSITION == SNAKE[i]) {
                POSITION = POSITION - SNAKESUB[i];
            }
        }

        System.out.println(POSITION);
    }



























}

