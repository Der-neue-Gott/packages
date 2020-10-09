package childs;
import parent.*;

public class Specialist extends Employee {
	
	@Override
	public void goToDayOff() {
		System.out.println("Sir, I would like to take day off.");
	}
	
}