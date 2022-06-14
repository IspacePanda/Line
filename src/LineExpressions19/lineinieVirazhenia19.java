package LineExpressions19;

public class lineinieVirazhenia19 {

	public static void main(String[] args) {
		// Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
		// его высоту, радиусы вписанной
		// и описанной окружностей.
		int a = 4;
		double d = (Math.sqrt(3) * a) / 2;
		double r1 = a / (Math.sqrt(3) * 2);
		double r2 = a / (Math.sqrt(3));
		double s = 0.5 * a * d;
		System.out.println("visota " + d);
		System.out.println("r vpis " + r1);
		System.out.println("r opis " + r2);
		System.out.println("ploshchad " + s);

	}

}
