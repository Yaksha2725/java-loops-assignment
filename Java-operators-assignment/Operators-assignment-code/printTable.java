import java.util.Scanner;

public class printTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table no:");
        int n = sc.nextInt();

        for(int i=n; i <= 10*n; i+=n){
            System.out.println(i);
        }
    }
}
