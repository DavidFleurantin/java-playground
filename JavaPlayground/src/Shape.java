
/* An instance (object) represents a shape at at point in the plane */

public class Shape {

	// Instance Fields
	private double x, y; // top-left point of bounding box

	// Constructor

	/**
	 * <dt><b>Constructor:</b>
	 * <dd>instance of Shape at point (x1, y1)
	 * 
	 * @param x1 the x-coordinate of the top-left point
	 * @param x2 the y-coordinate of the top-left point
	 */
	public Shape(double x1, double y1) {
		x = x1;
		y = y1;
	}

	// Methods

	/**
	 * Return x-coordinate of Shape at point (x1,y1)
	 * 
	 * @return x-coordinate of bounding box
	 */
	public double getX() {
		return x;
	}

	/**
	 * Return y-coordinate of Shape at point (x,y)
	 * 
	 * @return y-coordinate of bounding box
	 */
	public double getY() {
		return y;
	}

	/**
	 * Return area of Shape
	 * 
	 * @return are of Shape
	 */
	public double area() {
		return 0.0;
	}

	/**
	 * Returns representation of this
	 * 
	 * @return representation of this
	 */
	public @Override String toString() { // Don't need @Override. Used to Catch
										 // Errors
		return "(" + getX() + "," + getY() + ")";
	}
}
