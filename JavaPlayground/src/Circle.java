
/* An instance (object) represents a circle */

public class Circle extends Shape {

	// Instance Fields
	public Double radius; // radius of the circle. radius >= 0
	public static final double PI = 3.141592653589793; // PI (constant)

	/**
	 * <dt><b>Constructor:</b>
	 * <dd>instance of Circle with radius r at (x, y)
	 * 
	 * <dt><b>Preconditions:</b>
	 * <dd>r >= 0
	 * 
	 * @param r the radius of the circle
	 * @param x the x-coordinate of the top-left point
	 * @param y the y-coordinate of the top-left point
	 */
	public Circle(double radius, double x, double y) {
		super(x,y);
		this.radius = radius;
	}

	// Methods

	/**
	 * Returns radius of specified Circle
	 * 
	 * @return radius of Circle
	 */
	public Double getRadius() {
		return radius;
	}

	/**
	 * Sets radius to new value
	 * <dt><b>Preconditions:</b>
	 * <dd>r >= 0
	 * 
	 * @param r the newly specified radius
	 */
	public void setRadius(double r) {
		assert r >= 0;

		radius = r;
	}

	/**
	 * Returns the area of Circle
	 * 
	 * @return area of Circle
	 */
	public double area() {
		return (Math.pow(radius, 2) * Math.PI);
	}

	/**
	 * Returns the area of Circle
	 * 
	 * @return area of Circle
	 */
	public static double di(Circle c) {  // Static Method Call
		return PI * c.radius * c.radius;
	}
	
	/**
	 * Returns representation of this
	 * 
	 * @return representation of this
	 */
	public @Override String toString() { // Don't need @Override. Used to Catch Errors
		return "Circle with radius " + radius + " at" + super.toString(); // Call to String of Shape
	}
}
