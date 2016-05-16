
/* An instance (object) represents a Rectangle */

public class Rectangle extends Shape {

	// Instance Fields
	private double sideH, sideV; // Horiz, vert side lengths >= 0

	// Constructors

	/**
	 * <dt><b>Constructor:</b>
	 * <dd>instance of Rectangle with horiz, vert side lengths sh, sv at (x, y)
	 * 
	 * <dt><b>Preconditions:</b>
	 * <dd>sh >= 0, sv >= 0
	 * 
	 * @param sh the horiz length
	 * @param sv the vert length
	 * @param x the x-coordinate of the top-left point
	 * @param y the y-coordinate of the top-left point
	 */
	public Rectangle(double sh, double sv, double x, double y) {
		super(x, y);
		sideH = sh;
		sideV = sv;
	}

	/**
	 * <dt><b>Constructor:</b>
	 * <dd>instance of Rectangle (square) with side length s at (x, y)
	 * 
	 * <dt><b>Preconditions:</b>
	 * <dd>s >= 0
	 * 
	 * @param s the square length
	 * 
	 */
	public Rectangle(double s, double x, double y) { // Overloaded Constructor
		this(s, s, x, y); // Call on another structure to avoid duplication
	}

	/**
	 * Returns representation of this
	 * 
	 * @return representation of this
	 */
	public @Override String toString() { // Don't need @Override. Used to Catch
										 // Errors
		return "Rectangle with horizontal side " + sideH + " and vertical side " + sideV + " at"
				+ super.toString(); // Call to String of Shape
	}
}