import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		//Check if the scanner has a token
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age= sc.nextInt();
		
		System.out.println("Type M if you are male, f if you are female : ");
		char gender=sc.next().charAt(0);
		
		System.out.println("Name: " +name);
		System.out.println("Gender " +gender);
		System.out.println("Age " +age);

	}

}
