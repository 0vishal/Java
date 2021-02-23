import java.util.Scanner;

public class EmpwageBuilder {

    public static void main(String args[]) {
            //VARIABLES
            int EMPWAGEPERHOUR = 20;
            int EMPHOUR = 8;
            int MAX_HOURS = 100;
            int DAYS_OF_MONTH = 20;

            //CONSTANTS
            int emphour = 0, dailywage = 0, day = 1, hours = 0,monthlywage = 0;

            while(day < DAYS_OF_MONTH && hours != MAX_HOURS) {
                int empcheck = (int) Math.floor(Math.random() *10) % 3;

                switch (empcheck) {
                    case 1:
                        emphour = 8;
                        break;
                    case 2:
                        emphour = 4;
                        break;
                    default:
                        emphour = 0;
                }

                day = day+1;
                hours = hours+emphour;
                dailywage = (emphour * EMPWAGEPERHOUR);
                System.out.println("daily wage " + dailywage);
                monthlywage = monthlywage + dailywage;
            }

            System.out.println(monthlywage);
        }
}
