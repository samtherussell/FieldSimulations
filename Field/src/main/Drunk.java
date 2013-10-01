package main;

import java.awt.Point;
import java.util.Random;

import test.Progress;

import general.FieldObject;

public class Drunk extends FieldObject {
	
	Random r;
	
	public Drunk(){
		r = new Random();
	}
	
	public Point go(int steps, Field where){
		Field field = where;
		
		int s = 0;
		int no = 0;
		int w = 0;
		int e = 0;
		
		Progress pb = new Progress();
		for(int n = 0; n < steps; n++){
			
			pb.incrementProgress();
			int rand = r.nextInt(4);
			
			switch(rand){
			case 0:
				//System.out.println("North,\t " + rand + "\t " + n);
				no++;
				break;
			case 1:
				//System.out.println("South,\t " + rand + "\t " + n);
				s++;
				break;
			case 2:
				//System.out.println("West,\t " + rand + "\t " + n);
				w++;
				break;
			case 3:
				//System.out.println("East,\t " + rand + "\t " + n);
				e++;
				break;
			}
			
			super.go(steps, where, rand);
			
			
		}
		System.out.println( "N:"+no + "\tS:"+s + "\tW:"+w + "\tE:"+e);
		return field.findObject(this);
	}
	
}
