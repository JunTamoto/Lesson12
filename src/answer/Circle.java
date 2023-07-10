package answer;

public class Circle implements Shape {
	double radius;

	public Circle(double r) {
		radius = r;
	}

	@Override
	public double calcArea() {
		double result = (radius * radius) * Math.PI;
		return result;
	}

}
