package main;

import general.FieldObject;
import java.awt.Point;
import java.awt.Rectangle;

public class Field {
	String name;
	Rectangle size;
	FieldObject[][] container;
	
	public int MOVENORTH = 0;
	public int MOVESOUTH = 1;
	public int MOVEWEST = 2;
	public int MOVEEAST = 3;

	
	
	public Field(String name, int height, int width){
		this.name = name;
		this.size = new Rectangle(0,0,width,height);
		this.container = new FieldObject[height][width];
	}
	
	public Field(int height, int width){
		this.name = "UN-NAMED";
		this.size = new Rectangle(0,0,width,height);
		this.container = new FieldObject[height][width];
	}
	
	public void addObject(FieldObject newObject, Point p){
		this.container[p.y-1][p.x-1] = newObject;
	}
	
	public void deleteObject(FieldObject object){
		
		Point p = findObject(object);
		this.container[p.y][p.x] = null;
		
	}
	
	public Point findObject(FieldObject object){
		
		for(int y = 0; y<this.container.length;y++){
			for(int x = 0; x<this.container[y].length;x++){
				if(this.container[y][x] == object){
					return new Point(x,y);
				}
			}
		}
		return null;
	}
	
	public void deleteObject(Point p){
		this.container[p.x-1][p.y-1] = null;
	} 
	
	public String StringDisplay(){
		String result = name + "\n";
		
		for(int y = 0; y<this.container.length;y++){
			for(int x = 0; x<this.container[y].length;x++){
				if(this.container[y][x] != null){
					result = result + " X";				
				}else{
					result = result + " O";				
				}
			}
			result = result + "\n";	
		}
		
		
		return result;
	}
	
	/**
	 * 
	 * @param object
	 * @param direction
	 * @throws ArrayIndexOutOfBoundsException
	 */
	
	public void move(FieldObject object, int direction) throws ArrayIndexOutOfBoundsException{
		
		Point p = findObject(object);
		
		switch(direction){
		case 0:
			this.container[p.y-1][p.x] = this.container[p.y][p.x];
			break;
		case 1:
			this.container[p.y+1][p.x] = this.container[p.y][p.x];
			break;
		case 2:
			this.container[p.y][p.x-1] = this.container[p.y][p.x];
			break;
		case 3:
			this.container[p.y][p.x+1] = this.container[p.y][p.x];
			break;
		}
		this.container[p.y][p.x] = null;
		
	}
	
}
