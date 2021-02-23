public class EmpwageBuilder {

        public static void main(String[] args) {
            // write your code here
            System.out.println("Welcome to Employee wage computation problem on master branch");
            int IS_FULLTIME = 1;
            double empcheck = Math.floor(Math.random() * 10) % 2;

            if (empcheck == IS_FULLTIME) {
                System.out.println("Employee is present");
            } else {
                System.out.println("Employee is absent");
            }
        }
    }

