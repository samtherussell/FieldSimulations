package general;

import java.awt.Image;
import java.awt.Point;

import main.Field;

public class FieldObject {
	
	public void go(int steps, Field where, int direction){
		Field field = where;
		
			
			try{
				field.move(this, direction);
			}catch(ArrayIndexOutOfBoundsException err){
				System.out.println("hit the fence");
			}
			
			//System.out.println(field.StringDisplay());
		
	}
	
	
	
}
