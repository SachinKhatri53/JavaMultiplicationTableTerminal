import java.util.Scanner;

public class HelloWorld{
	static void GetMultiplicationTable(){
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter number:- ");
		int number = myObj.nextInt();
		System.out.println();
		System.out.println();
		int i = 1;
		while(i <= 10){
			System.out.println(number + " x " + i + " = " + (number * i));
			i++;
		}
	}
	
	public static void main(String [] args){
		Scanner myObj = new Scanner(System.in);
		String startProg;
		System.out.println();
		System.out.println();
		System.out.println("Welcome To, \n           MULTIPLICATION TABLE GENERATOR");
		for(int i = 0; i < 45; i++){
			System.out.print("-");	
		}
		System.out.println();
		System.out.println();
		do{
			System.out.print("Press 'y' to continue or any key to quit. ");
			startProg = myObj.nextLine();
				if(startProg.equals("y") || startProg.equals("Y")){
					GetMultiplicationTable();
					System.out.println();
				}
				else{
					System.out.println("Thank You...");
					for(int i = 0; i < 45; i++){
						System.out.print("-");	
					}
				}
		} while(startProg.equals("y"));
	}
}