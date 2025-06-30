import java.util.Scanner;

public class Thermometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float ans=0;
        System.out.println("Enter Alphabet in which unit you want to convert");
        String b = sc.next();
        if(b.equals("F")){
            ans = (a*9/5) + 32;
        }
        if(b.equals("C")){
            ans = (a - 32)*5/9;
        }
        System.out.println(ans);
    }
}
