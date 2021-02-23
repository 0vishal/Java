import java.util.Scanner;

public class Linecompare {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to line comparison computation program on master branch");
        System.out.println("We will calculate length of line x1 y1 x2 y2 ");
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        double len = Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println(len);


    }
}

