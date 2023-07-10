package answer;

public class Lesson12B {
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		Pillar pillar = new Pillar(circle, 11.0);
		Trapezoid tra = new Trapezoid(6.0, 9.0, 7.0);
		Pillar pil = new Pillar(tra, 11.0);
		pillar.calcVolume();

		System.out.println("半径" + circle.radius + "の円の面積は" + circle.calcArea() + "です。");
		System.out.println("高さが" + pillar.height + "の上記円の円柱の体積は" + pillar.calcVolume() + "です。");
		System.out.println("上底が" + tra.topLength + "、下底" + tra.bottomLength + "、高さ" + tra.vertical + "の台形の面積は"
				+ tra.calcArea() + "です。");
		System.out.println("高さが" + pil.height + "の上記台形の台形柱の体積は" + pil.calcVolume() + "です。");
	}
}
