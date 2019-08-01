package movePoint;

public class movePointTest {

	public static void main(String[] args) {

		Point point = new Point();
		MovablePoint pointMove = new MovablePoint();
		
		point.setXY(1, 0);
		pointMove.setXY(1, 0);
		pointMove.setSpeed(1, 2);

		System.out.println("point arr[0] = " + point.getXY()[0] );
		System.out.println("point arr[1] = " + point.getXY()[1] );

		System.out.println("pointMove arr[0] = " + pointMove.getSpeed()[0] );
		System.out.println("pointMove arr[1] = " + pointMove.getSpeed()[1] );
		
		System.out.println("the result = " + pointMove.move() );
	}

}
