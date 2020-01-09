package creational.FactoryMethod._02;

public class App {
	public static void main(String[] args) {
		Shape circle = ShapeFactory.getShape("CIRCLE");
		circle.draw();
		circle = ShapeFactory.getShape("SQUARE");
		circle.draw();
		circle = ShapeFactory.getShape("RECTANGLE");
		circle.draw();
	}	
}
