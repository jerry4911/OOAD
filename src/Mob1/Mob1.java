package Mob1;

import java.util.ArrayList;
import java.util.List;

public class Mob1 {
	public static void main(String[] args) {
		int track = 4000;
		int counter = 0;
		List<MouseCar> mousecars = new ArrayList<MouseCar>();
		MouseCar champion = null;
		
		// testing
		mousecars.add(new MouseCar("救護車","文毛"));
		mousecars.add(new MouseCar("警車","若軒"));
		mousecars.add(new MouseCar("垃圾車","感恩感恩嘿"));
		
		while (champion==null) {
			if (counter%10==0) {
				List<MouseCar> recipients = getFirstAndLast((ArrayList<MouseCar>) mousecars);
				MouseCar first = recipients.get(0);
				MouseCar last = recipients.get(1);
				
				last.eat("紅蘿蔔");
				first.eat("生菜");
			}
			for (int i=0; i<mousecars.size(); i++) {
				mousecars.get(i).run();
			}
			
			for (int i=0; i<mousecars.size(); i++) {
				MouseCar m = mousecars.get(i);
				System.out.println(m.getName()+" 目前位置："+Integer.toString(m.getPos()));
				if (m.getPos()>=track) {
					champion = m;
				}
			}
			counter++;
			System.out.println("---------------------");
		}
		System.out.println("第一名是"+champion.getName());
	}
	
	public static List<MouseCar> getFirstAndLast(ArrayList<MouseCar> mousecars)    {
        List<MouseCar> recipients = new ArrayList<MouseCar>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        MouseCar first = null;
        MouseCar last = null;
        
        for (int i=0; i<mousecars.size(); i++) {
			MouseCar m = mousecars.get(i);
			if (m.getPos()>max) {
				max = m.getPos();
				first = m;
			}
			if (m.getPos()<=min) {
				min = m.getPos();
				last = m;
			}
		}
        recipients.add(first);
        recipients.add(last);
        return recipients;
    }
}
