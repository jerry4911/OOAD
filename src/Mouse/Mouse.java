package Mouse;

import java.util.ArrayList;
import java.util.List;
import Mob1.MouseBehavior;

public class Mouse implements MouseBehavior{
	protected String type;
	protected List<String> foods = new ArrayList<String>();
	
	protected Mouse() {
		type = "???";
	}
	
	protected Mouse(String t) {
		type = t;
	}
	
	// behaviors
	public void call() {
		System.out.println("PUI PUI");
	}
	
	public void eat(String food) {
		foods.add(food);
		System.out.println(food+"is eaten......");
	}
	
	public String defecate() {
		if (!foods.isEmpty()) {
			foods.remove(0);
			return "pupu";
		}
		return "Nothing";
	}
	
}
