import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int originalNumber = number;
        int n = 0, result = 0;

        int temp = number;
        while(temp!=0){
            temp /= 10;
            n++;
        }

        temp = number;
        while(temp!=0){
            int digit = temp%10;
            result += Math.pow(digit,n);
            temp /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
