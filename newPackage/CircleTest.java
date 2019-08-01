package newPackage;

public class CircleTest {

	public static void main(String[] args) {

		Circle circle = new Circle();
		Cylinder cylinder = new Cylinder(1.2,"Blue",5.0);
		
		circle.setRadius(1.5);
		circle.setColor("Red");
		
		System.out.println(circle.toString());
		System.out.println(cylinder.toString());
	}

}
