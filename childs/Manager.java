package childs;
import parent.*;

public class Manager extends Employee {
	
	@Override
	public void goToDayOff() {
		System.out.println("Hi, man! I won't come to work today, cover me on the work!");
	}
	
}