package childs;
import parent.*;

public class CEO extends Manager {
	
	@Override
	public void goToDayOff() {
		System.out.println("Why should I tell someone the reason of my rest?! It's MY company and I take a day off! ");
	}
	
}