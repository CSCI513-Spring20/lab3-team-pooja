package application;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FlowerBed implements Garden{
Rectangle rect = new Rectangle();
List<Garden> shapes = new ArrayList<Garden>();
public FlowerBed(double x, double y, double width, double height) {
	rect.setX(x);
	rect.setY(y);
	rect.setHeight(height);
	rect.setWidth(width);
	rect.setFill(Color.AZURE);
	rect.setStroke(Color.BLACK);
	rect.setStrokeWidth(1);
}

public void move(double dx, double dy) {
	rect.setX(rect.getX()+dx);
	rect.setY(rect.getY()+dy);
	for(Garden shape : shapes) {
		shape.move(dx, dy);
	}
}

public Rectangle getRectangle(){
	return rect;
}

public boolean contains(Point2D point) {
	boolean inRectangle = (point.getX() >= rect.getX() && point.getX() <= rect.getX()+rect.getWidth()
	&& point.getY()>= rect.getY() && point.getY() <= rect.getY()+rect.getHeight());
return inRectangle;
	
}

public void addChild(Garden currentShape) {
	//SSystem.out.println("added");
	shapes.add(currentShape);
	
}




}