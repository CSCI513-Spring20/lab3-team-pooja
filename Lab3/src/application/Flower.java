package application;

import java.awt.Point;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Flower implements Garden{
	
	Circle circle;
	public Flower(Point2D a,Color RED, boolean c) {
		circle = new Circle();
		circle.setCenterX(a.getX());
		circle.setCenterY(a.getY());
		circle.setRadius(50);

		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(1);
		
		
	}
	
	public Circle getCircle() {
		return circle;
	}
	public void move(double dx, double dy) {
		circle.setCenterX(circle.getCenterX()+dx);
		circle.setCenterY(circle.getCenterY()+dy);

	}
	
	public boolean contains(Point2D point) {
		return (circle.contains(point));
	}
	

}