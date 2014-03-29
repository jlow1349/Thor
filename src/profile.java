
public class profile {
	// private user data
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//constructor for the user's profile
	public profile(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//getter methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	// override toSting method to print out custom user profile
	public String toString() {
		return "Name: " 		+ getName() 	+ 
				"\nAge: " 		+ getAge() 		+ 
				"\nHeight: " 	+ getHeight() 	+ " ft." +
				"\nWeight: " 	+ getWeight() 	+ " lbs.";
	}
}
