
/* An instance (object) represents a Rectangle */

public class Rectangle {

	// Instance Fields
	private double sideH, sideV; // Horiz, vert side lengths >= 0

	/**
	 * <dt><b>Constructor:</b>
	 * <dd>instance of Rectangle with horiz, vert side lengths sh, sv
	 * 
	 * <dt><b>Preconditions:</b>
	 * <dd>sh >= 0, sv >= 0
	 * 
	 * @param sh the horiz length
	 * @param sv the vert length
	 */
	public Rectangle(double sh, double sv) {
		sideH = sh;
		sideV = sv;
	}

	/**
	 * <dt><b>Constructor:</b>
	 * <dd>instance of Rectangle (square) with side length s
	 * 
	 * <dt><b>Preconditions:</b>
	 * <dd>s >= 0
	 * 
	 * @param s the square length
	 * 
	 */
	public Rectangle(double s) {  // Overloaded Constructor
		sideH = s;
		sideV = s;
	}
}
