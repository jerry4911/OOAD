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
	    put("ĵ��", 14);
	    put("���@��", 11);
	    put("�U����", 8);
	}};
	static Map<String, Integer> ac_map = new HashMap<>(){{
	    put("ĵ��", 5);
	    put("���@��", 2);
	    put("�U����", 4);
	}};
	
	MouseCar() {
		super();
		name = "�L�W���Ѫǹ�";
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
		System.out.println(name+"�Y�F"+food);
		
		if (food=="�͵�") {
			speed = speed_map.get(type);
		}
		else if (food=="���ڽ�") {
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
