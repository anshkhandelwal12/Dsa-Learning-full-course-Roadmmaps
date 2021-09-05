import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true)
        {
            System.out.println("Enter the Operator :");
            char op = input.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '/' || op == '*') {
                System.out.println("Enter first Number");
                int num1 = input.nextInt();
                System.out.println("Enter Secoond Number");
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
            }
                else if (op == 'x' || op == 'X') {
                    break;
                }
                else {
                    System.out.println("Invalid Operation");
                }

            System.out.println(ans);


        }
    }
}
