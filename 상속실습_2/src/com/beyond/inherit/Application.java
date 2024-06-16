package com.beyond.inherit;

import com.beyond.inherit.practice.Circle;
import com.beyond.inherit.practice.Point;
import com.beyond.inherit.practice.Rectangle;

public class Application {

	public static void main(String[] args) {
		Point[] cir = new Circle[2];
		Point[] rec = new Rectangle[2];
		
		cir[0] = new Circle(1,2,3);
		cir[1] = new Circle(3,3,4);
		
		rec[0] = new Rectangle(-1,-2,5,2);
		rec[1] = new Rectangle(-2,5,2,8);

		
		System.out.println("===== circle ====");
		for (Point circle : cir) {
			circle.draw();
		}
		
		System.out.println("===== rectangle ====");
		for (Point rectangle : rec) {
			rectangle.draw();
		}
		
	}

}
