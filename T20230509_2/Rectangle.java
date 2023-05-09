package T20230509_2;

import T20230508.Shape;

public class Rectangle extends Shape implements Plane2D {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width; this.height = height;
	}
	
	public String toString() {
		return "Rectanple(width:"+width+", height:"+height+")";
	}
	
	public void draw() {
		for (int i=1; i<=height; i++) {
			for (int j=1; j<=width; j++)
				System.out.println('*');
				System.out.println();
		}
	}
	public int getArea() { return width*height; }

}
