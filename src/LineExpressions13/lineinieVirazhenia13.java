package LineExpressions13;

public class lineinieVirazhenia13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 1.2;
		double x2 = 3.0;
		double x3 = 1.4;
		double y1 = 0.5;
		double y2 = 0.0;
		double y3 = 4.0;
		double pl;
		double s;
		double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
			 pl = (a + b + c) / 2.0;
			 s = Math.sqrt(pl * (pl - a) * (pl - b) * (pl - c));
			System.out.println("perimetr: " + pl);
			System.out.println("ploschd: " + s);
		
	}

}
