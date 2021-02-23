import java.util.Scanner;

public class Linecompare {

        public static void main(String[] args) {
            // write your code here
            System.out.println("Welcome to line comparison computation program on master branch");
            System.out.println("We will calculate length of line1 x1 y1 x2 y2 ");
            Scanner scan = new Scanner(System.in);
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            double lengthline1 = Math.floor(Math.sqrt((x2-x1)^2+(y2-y1)^2));
            int length1 = (int)lengthline1;
            System.out.println(lengthline1);

            System.out.println("We will calculate length of line2 p1 q1 p2 q2 ");
            int p1 = scan.nextInt();
            int q1 = scan.nextInt();
            int p2 = scan.nextInt();
            int q2 = scan.nextInt();
            double lenghtline2 = Math.floor(Math.sqrt((p2-p1)^2+(q2-q1)^2));
            int length2 = (int)lenghtline2;
            System.out.println(length2);

            System.out.print("The length of two line are equal True or False : ");
            Integer obj1 = new Integer(length1);
            Integer obj2 = new Integer(length2);
            System.out.println();
            int VALUE = obj1.compareTo(obj2);

            if(VALUE == -1)
            {
                System.out.println("Length of line1 is less than line2");
            }
            else if (VALUE == 1)
            {
                System.out.println("Length of line1 is greater than line2");
            }
            else
            {
                System.out.println("Length of line1 is equal to line2");
            }

        }
    }


