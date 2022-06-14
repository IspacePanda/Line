package LineExpressions23;

public class lineinieVirazhenia23 {

	public static void main(String[] args) {
		// Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R>
		// r).
		int rvnesh = 15;
		int rvytr = 12;
		double s = Math.PI*(rvnesh * rvnesh - rvytr * rvytr);
		System.out.println("ploshcad " + s);

	}

}
