package answer;

public class Pillar {
	Shape a;

	double height;

	public Pillar(Shape s, double h) {
		a = s;
		height = h;
	}

	public double calcVolume() {
		return a.calcArea() * height;
	}

}
