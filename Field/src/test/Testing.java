package test;

import java.awt.Point;

import general.*;
import main.*;

public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4000;
		Field f = new Field("Drunk's field",num,num);
		System.out.println("Starting Point");
		Drunk jon = new Drunk();
		
		
		
		f.addObject(jon, new Point(num/2,num/2));
		
		//System.out.println(f.StringDisplay());
		
		Point newLocation = jon.go(num, f);
		
		System.out.println(Point.distance(newLocation.x, newLocation.y, 4, 4));
		
		
		//System.out.println(f.StringDisplay());
		
		
		
		
		/*Field f = new Field("field",2,2);
		
		FieldObject a = new FieldObject();
		FieldObject b = new FieldObject();
		
		f.addObject(a, new Point(1,1));
		
		System.out.println(f.StringDisplay());
		
		try {
			f.move(a, f.MOVEEAST);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(f.StringDisplay());
		try {
			f.move(a, f.MOVESOUTH);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(f.StringDisplay());
		try {
			f.move(a, f.MOVEWEST);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(f.StringDisplay());
		try {
			f.move(a, f.MOVENORTH);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(f.StringDisplay()); */
		
		
		
		
	}

}
