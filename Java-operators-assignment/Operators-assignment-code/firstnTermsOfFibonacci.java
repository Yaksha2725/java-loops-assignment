import java.util.Scanner;

public class firstnTermsOfFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms: ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int sum = 0;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i<n-2; i++){
            sum = a+b;
            a= b;
            b = sum;
            System.out.println(sum);
        }
    }
}