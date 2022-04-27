package Mob1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Mouse.Mouse;

public class MouseCar extends Mouse implements CarBehavior{
	private int speed;
	private int position;
	private String name;
	static Map<String, Integer> speed_map = new HashMap<>(){{
	    put("警車", 14);
	    put("救護車", 11);
	    put("垃圾車", 8);
	}};
	static Map<String, Integer> ac_map = new HashMap<>(){{
	    put("警車", 5);
	    put("救護車", 2);
	    put("垃圾車", 4);
	}};
	
	MouseCar() {
		super();
		name = "無名的天竺鼠";
		speed = 0;
	}
	MouseCar(String type, String n) {
		super(type);
		name = n;
		speed = speed_map.get(type);
	}
	
	@Override
	public void accelerate(int ac) {
		speed += ac;
		System.out.println(Integer.toString(ac)+" faster");
	}
	
	@Override
	public void eat(String food) {
		foods.add(food);
		System.out.println(name+"吃了"+food);
		
		if (food=="生菜") {
			speed = speed_map.get(type);
		}
		else if (food=="紅蘿蔔") {
			speed += ac_map.get(type);
		}
		
		if (foods.size()>5) {
			defecate();
		}
	}

	@Override
	public String defecate() {
		if (!foods.isEmpty()) {
			String food_out = foods.get(0);
			foods.remove(0);
			return food_out;
		}
		return "Nothing";
	}
	
	public void run() {
		position += speed;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPos() {
		return position;
	}
}
