package exercises.files;

import entities.enums.Color;
import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;

public class AppAbstractInterfaceShape {

	public static void main(String[] args) {
		
		AbstractShape shape1 = new Circle(Color.BLACK, 2.0);
		AbstractShape shape2 = new Rectangle(Color.BLACK, 3.0, 4.0);
		
		System.out.println("Circle color: " + shape1.getColor());
		System.out.println("Circle area: " + shape1.area());
		System.out.println("Rectangle color: " + shape2.getColor());
		System.out.println("Rectangle area: " + shape2.area());
		
	}
}
