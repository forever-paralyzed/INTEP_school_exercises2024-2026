package sass;
import java.util.Scanner;
public class exercise_32_bank {
    static Scanner input = new Scanner(System.in);
    static double balance = 0.0;

    public static void main(String[] args) {
        char userAns = ' ';
        while(userAns!='q'){
            System.out.println("choose option:\nd - deposit\nw - withdaw\nb - balance\nq - quit");

        userAns = input.next().charAt(0);

        switch (userAns) {
            case 'd':
                deposit();
                break;

            case 'w':
                withdraw();
                break;

            case 'b':
                showBalance();
                break;

            case 'q':
                System.out.println("bye!");
                break;

            default:
                System.out.println("error: invalid choice");
        }
        }
        
    }

    public static void showBalance() {
        System.out.println("\nBalance: " + balance + "\n");
    }

    public static void deposit() {
        System.out.print("Enter value to deposit: ");
        double amount = input.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("\nsuccess!\n");
        } else {
            System.out.println("\nerror\n");
        }
    }

    public static void withdraw() {
        System.out.print("Enter value to withdraw: ");
        double amount = input.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nsuccess!\n");
        } else {
            System.out.println("\nnot enough money\n");
        }
    }
}
