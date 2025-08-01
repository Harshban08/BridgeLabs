import java.util.Scanner;

public class LargestTwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];

        while (number != 0 && index < maxDigit) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);
    }
}
