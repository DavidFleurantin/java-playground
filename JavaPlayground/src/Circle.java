
/* An instance (object) represents a circle */

public class Circle {

	// Instance Fields
	public Double radius; // radius of the circle. radius >= 0
	public static final double PI = 3.141592653589793; // PI (constant)

	
	/**
	 * <dt><b>Constructor:</b><dd>
	 * instance of Circle with radius r
	 * 
	 * <dt><b>Preconditions:</b><dd> 
	 * r >= 0
	 * 
	 * @param r the radius of the circle
	 */
	public Circle(double r) {
		radius = r;
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
	 * <dt><b>Preconditions:</b><dd> 
	 * r >= 0
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
	
	public static double di(Circle c) {
		return PI * c.radius * c.radius;
	}
}
