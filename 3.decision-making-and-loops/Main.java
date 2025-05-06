import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        while (number != 0) {
            System.out.println(number);
            number = number / 2;
            if (number % 2 == 0) {
                continue;
            } else if (number >= 5) {
                break;
            }
            System.out.println(number);
        };
    }
}