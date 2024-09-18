package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers should be tested?");
		int n = in.nextInt();
		
		boolean[] array = new boolean[n+1];
		//boolean[] prime = new boolean[n];
		
		for (int matt = 0; matt <=n; matt++) {
			array[matt] = true;
		}
		
		
		System.out.println("Here is your initial list");
		
		
/*		for (int i = 0; i <= n; i++) {
			
			System.out.print(i + " ");
			}	
		int p=2;
		System.out.println();
		int i=0;
		while (i <= n) {
			for (int a=2; a <= n; a+=p)
				array[a] = false;
			p+=1;
			i++;
		}
		
	*/
		
	//	System.out.println("These are not primes (/2): ");
		for (int a = 4; a <= n; a+=2) {
				array[a] = false;
		//		System.out.print(a + " ");
			}
		System.out.println();
		
	//	System.out.println("These are not primes (/3): ");
		for (int a = 4; a <= n; a+=3) {
				array[a] = false;
		//		System.out.print(a + " ");
			}	
		System.out.println();
	//	System.out.println("These are not primes (/5): ");
		for (int a = 10; a <= n; a+=5) {
				array[a] = false;
		//		System.out.print(a + " ");
			}	
		System.out.println();
	//	System.out.println("These are not primes (/7): ");
		for (int a = 14; a <= n; a+=7) {
				array[a] = false;
			//	System.out.print(a + " ");
			}	
	System.out.println();
	System.out.println("here you primes fool: ");
	for (int prime = 0; prime <= n; prime++) {
		if (array[prime] == true) {
			System.out.print(prime + " ");
		}
	}
	
	
	
	
	}
		

		
		
		
		
		
		
	}	
	


