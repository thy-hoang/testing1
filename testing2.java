import java.util.Scanner;

public class testing2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("What numbers do you want to add together? ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        scan.close();
    }
}
