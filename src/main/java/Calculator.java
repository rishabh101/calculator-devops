



import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {

   
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Choose to perform desired operation");
            System.out.print("Press 1 to find factorial\nPress 2 to find Square root\nPress 3 to find power\nPress 4 to find natural logarithm\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // do factorial
                    System.out.print("Enter a number : ");
                    number1 = sc.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + calculator.factoral(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // find square root
                    System.out.print("Enter a number : ");
                    number1 = sc.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + calculator.sqroot(number1));
                    System.out.println("\n");


                    break;
                case 3:
                    // find power
                    System.out.print("Enter the first number : ");
                    number1 = sc.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = sc.nextDouble();
                    System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1, number2));
                    System.out.println("\n");
                    break;
                case 4:
                    // find natural log
                    System.out.print("Enter a number : ");
                    number1 = sc.nextDouble();
                    System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting from Calculator");
                    return;
            }
        } while (true);
    }


    public double factoral(double number1) {
       
        double res = fact(number1);
        
        return res;
    }



    public double sqroot(double number1) {
       
        double res1 = Math.sqrt(number1);
       
        return res1;
    }


    public double power(double number1, double number2) {
       
        double res2 = Math.pow(number1,number2);
       
        return res2;
    }

    public double naturalLog(double number1) {
        
        double res4 = 0;
        try {

            if (number1 <0 ) {
                res4 = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                res4= Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
       
        return res4;
    }
    public double fact(double num) {
        double f= 1;
        for(int i = 1; i <= num; ++i)
        { f *= i;   }
        return  f;
    }
}
