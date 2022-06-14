package LineExpressions25;

public class lineinieVirazhenia25 {

	public static void main(String[] args) {
		// Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными
		// коэффициентами a, b и с (предполагается,
		// а≠0 и что дискриминант уравнения неотрицателен).
		int a = 1;
		int b = 10;
		int c = 2;
		double D;
		D = b * b - 4 * a * c;
		if (D > 0) {
		 double x1, x2;
		x1 = (-b - Math.sqrt(D)) / (2 * a);
	    x2 = (-b + Math.sqrt(D)) / (2 * a);
	    System.out.println("Korni yravnenia x1" + x1 + ", x2 = " + x2);
	}
	else if (D == 0) {
	    double x;
	    x = -b / (2 * a);
	    System.out.println("tolko 1 koren = " + x);
	}
	else {
	    System.out.println("ne imeet korney!");
	}

}}
