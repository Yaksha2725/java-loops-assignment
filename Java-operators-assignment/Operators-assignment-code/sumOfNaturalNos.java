import java.util.Scanner;

public class sumOfNaturalNos{
 	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int i, sum=0;
		for(i =1; i<=n; i++){
			sum += i;
		}
		System.out.println("The sum of "+n+" natural numbers is: "+sum);
	}
} 