package Empty;

import java.util.Scanner;

public class ClassStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		
	
		System.out.println("Please enter 10 grades.");
		
		double grade = scanner.nextDouble();
		double max = grade;
		double min = grade;
		total += grade;
		
		for(int i=0; i<9; i++) {
			
			System.out.println("Enter a grade.");
			grade = scanner.nextDouble();
			
			if(grade > max) {
				max = grade;
			}
			
			if(grade < min) {
				min = grade;
			}
			
			total += grade;
			
		}
		
		System.out.println("The highest grade was a " + max + "%.");
		System.out.println("The lowest grade was a " + min + "%.");
		System.out.println("The average grade was a " + total / 10 + "%.");

	}

}
