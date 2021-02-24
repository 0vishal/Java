
public class Snakeandladder {

        public static void main (String args[]) {
            //GET DICE VALUE AND ADD TO POSITION
            System.out.println("Lets play snake and ladder");

            int OPTION = (int)Math.floor(Math.random() * (3 - 1 + 1 ) + 1);

            int FINAL_POSITION = 100;
            //CONSTANT
            int POSITION = 0;

            while(POSITION != FINAL_POSITION) {
                int DICE = (int)Math.floor(Math.random() * (6 - 1 + 1 ) + 1);
                if (OPTION == 1) {
                    POSITION = DICE;
                }
                else if (OPTION == 2) {
                    POSITION = POSITION + DICE;
                }
                else {
                    POSITION = POSITION - DICE;
                }


                if (POSITION > FINAL_POSITION) {
                    POSITION = POSITION - DICE;
                }


            }


            System.out.println(POSITION);
        }
    }
    }





























