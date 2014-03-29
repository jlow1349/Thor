import java.util.ArrayList;
import java.util.Scanner;

public class thor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		// these are retorts to make sure that the user enters 
		// some useful information...
		int random = (int)(Math.random()*5 + 1);
		ArrayList retorts = new ArrayList();
		retorts.add("Doubtful.");
		retorts.add("C'mon, stop messing around.");
		retorts.add("No one believes you.");
		retorts.add("I am disappointed in you.");
		retorts.add("No one enjoys a liar.");
		
		// getting the users information for a new profile
		System.out.println("Please enter your name: ");
		String name = in.nextLine();
		
		System.out.println("Please enter your age: ");
		int age = in.nextInt();
		
		System.out.println("Please enter your height: ");
		
		// do loop to check for realistic height
		double height;
		do {
		      height = in.nextDouble();
		      if (height < 8 && height > 2) {
		    	  break;
		      } else {
		        System.out.println(retorts.get(random));
		        System.out.println("Please try again: ");
		      }
		    } while(height >= 8 || height <= 2);
		
		System.out.println("Please enter your weight: ");
		double weight = in.nextDouble();
		
		profile user = new profile(name, age, height, weight);
		System.out.println(user.toString());
		in.close();
	}

}
