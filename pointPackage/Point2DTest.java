package pointPackage;

public class Point2DTest {

	public static void main(String[] args) {

		Point2D d2 = new Point2D();
		Point3D d3 = new Point3D();

		d2.setXY(1,2);
		
		System.out.println("x = " + d2.getX() + " y = " + d2.getY());
		System.out.println("arr[0] = " + d2.getXY()[0]);
		System.out.println("arr[1] = " + d2.getXY()[1]);
		System.out.println(d2.toString());
		
		d3.setXYZ(2, 3, 4);
		System.out.println("x = " + d3.getX() + " y = " + d3.getY() + " z = " + d3.getZ());
		System.out.println("arr[0] = " + d3.getXYZ()[0]);
		System.out.println("arr[1] = " + d3.getXYZ()[1]);
		System.out.println("arr[2] = " + d3.getXYZ()[2]);
	}

}
