package Mob1;

import java.util.ArrayList;
import java.util.List;

public interface MouseBehavior {
//	List<String> foods = new ArrayList<String>();

	// behaviors
	abstract void call();
	abstract void eat(String food);
	abstract String defecate();
}
