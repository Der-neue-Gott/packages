package childs;
import parent.*;

public class Developer extends Employee {
	
	@Override
	public void goToDayOff() {
		System.out.println("I take a day off, because I have my Birthday party on evening.");
	}
	
}