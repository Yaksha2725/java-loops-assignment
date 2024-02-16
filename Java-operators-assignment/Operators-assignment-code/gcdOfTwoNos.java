import java.util.Scanner;

public class gcdOfTwoNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int  num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("GCD of "+ num1 + "and "+num2+" is"+gcd );
    }
    public static int findGCD(int a, int b){
        while(b != 0){
            int temp =b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}