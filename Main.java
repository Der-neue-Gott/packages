import parent.*;
import childs.*;

public class Main {
	public static void main(String[] args) {
		
	
	Employee spec = new Specialist();
		System.out.print("One of speicalists came up and said: \t > ");
		spec.goToDayOff();
	
		System.out.println();
	
	Employee man = new Manager();
		System.out.print("The office door opened. One of the managers entered: \t > ");
		man.goToDayOff();
		
		System.out.println();
		
	Employee dev = new Developer();
		System.out.print("One of the developers called the director: \t > ");
		dev.goToDayOff();
		
		System.out.println();
		
	Employee dir = new CEO();
		System.out.print("The director was preparing to write a letter of day off, but remembered who he was: \t > ");
		dir.goToDayOff();
	
	}
}