package calculator.functions;

import calculator.Calculator;
import calculator.Doc;

public class Csc extends Function1Arg{
	public Csc(Calculator calc) {
		super("csc", calc);
		setDocumentationObject(new Doc(getName(), 1, 1, "(-inf, inf) except for the integral multiples of PI.", "num a: Returns the cosecant of a, angle mode dependent."));
	}
	
	/**
	 * Returns the cosecant of a, angle mode dependent.
	 */
	public String evaluate(double a) {
		if (!useRadians())
			a = a * Math.PI / 180.0;
		if (a % Math.PI == 0)
			return "error: domain.";
		return Double.toString(1.0 / Math.sin(a));
	}
}