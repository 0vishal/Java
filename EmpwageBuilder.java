import java.util.Scanner;

public class EmpwageBuilder {

    public static void main(String args[])
    {
        int EMPWAGEPERHOUR = 20;
        int EMPTIME = 0;
        System.out.println("Calculate wage 1.FullTime 2.PartTime");
        Scanner scan = new Scanner(System.in);
        int TIME = scan.nextInt();

        switch (TIME) {
            case 1:
                EMPTIME = 8;
            case 2:
                EMPTIME = 4;

        }

        int DAILYWAGE = (EMPTIME * EMPWAGEPERHOUR);
        System.out.println("Daily wage is " + DAILYWAGE);
    }
}
