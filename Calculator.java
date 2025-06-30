import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        System.out.println("Enter numbers for operations from 1 to 4");
        int Operations = sc.nextInt();
        if(Operations==1){
            ans = a+b;
        }
        if(Operations==2){
            if(a>b){
                ans = a-b;
            }
            if(b>a){
                ans = b-a;
            }
        }
        if(Operations==3){
            ans = a*b;
        }
        if(Operations==4){
            ans = a/b;
        }
        
        System.out.println(ans);
    }
}
