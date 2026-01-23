package sass;
import java.util.Scanner;
import java.util.InputMismatchException;
public class exercise_31_v2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
        System.out.print("enter first number: ");
        double user_first_number = input.nextDouble();

        System.out.print("enter second number: ");
        double user_second_number = input.nextDouble();

        
            System.out.println(method_to_call(user_first_number, user_second_number));
        }catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero!");
        }catch (InputMismatchException e) {
            System.out.println("Error: enter a number please!");
        }
        input.close();
    }

    public static double method_to_call(double a, double b) {
        double example = a / b;
        return (double)example;

    }
}


