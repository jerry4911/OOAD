package Car;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private String type;
	private int speed;
	
	Car() {
		type = "???";
		speed = 0;
	}
	Car(String t) {
		type = t;
		speed = 0;
	}
	Car(String t, int s) {
		type = t;
		speed = s;
	}
	
	// behaviors
	public void accelerate(int ac) {
		speed += ac;
		System.out.println(Integer.toString(ac)+" faster");
	}
}
