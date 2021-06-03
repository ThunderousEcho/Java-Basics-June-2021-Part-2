
public class Assignment3 {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[] {
				new Rectangle(2, 3),
				new Circle(1),
				new Triangle(2, 2)
		};
		
		for (Shape shape : shapes) {
			shape.calculateArea();
			shape.display();
		}
	}
}


interface Shape {
	void calculateArea();
	void display();
}

class Rectangle implements Shape {

	public double width;
	public double height;
	
	private double area = 0;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		area = width * height;
	}

	@Override
	public void display() {
		System.out.println(area);
	}
}

class Circle implements Shape {

	public double radius;
	
	private double area = 0;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		area = 2 * Math.PI * radius;
	}

	@Override
	public void display() {
		System.out.println(area);
	}
}

class Triangle implements Shape {

	public double base;
	public double height;
	
	private double area = 0;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		area = 0.5 * base * height;
	}

	@Override
	public void display() {
		System.out.println(area);
	}
}
