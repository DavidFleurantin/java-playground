
/**
 * Precede every class with a comment
 * 
 * @author MSI
 *
 */
public class Main {

	public static void main(String[] args) {

		// Circle 
		
		Circle myCircle = new Circle(5.0,1,2);

		myCircle.setRadius(10);

		System.out.print(myCircle.area());

		// Using Static function

		System.out.println(Circle.di(myCircle));
		
		// Rectangle (Overloading)
		
		Rectangle rec1 = new Rectangle(2,2,3,2);
		
		Rectangle rec2 = new Rectangle(2,0,0);
		
		
	}

}
