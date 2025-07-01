import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int reversed = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;         // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            num = num / 10;               // Remove last digit
        }

        // Check if original and reversed are the same
        if (originalNum == reversed) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not a pall@indrome");
        }
    }
}
