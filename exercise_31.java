package sass;
public class exercise_31 {

    public static void main(String[] args) {
        try {
            System.out.println(method_to_call(2, 0));
        }catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero!");
        }
        
    }

    public static double method_to_call(int a, int b) {
        int example = a / b;
        return (double)example;
    }
}


