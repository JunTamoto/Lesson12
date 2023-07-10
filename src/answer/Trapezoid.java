package answer;

public class Trapezoid implements Shape {
	double topLength;
	double bottomLength;
	double vertical;

	Trapezoid(double t, double b, double h) {
		topLength = t;
		bottomLength = b;
		vertical = h;
	}

	@Override
	public double calcArea() {
		double result = (topLength + bottomLength) * vertical / 2;
		return result;
	}

}
