package LineExpressions21;

public class lineinieVirazhenia21 {

	public static void main(String[] args) {
		// ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и
		// целой част€х). ѕомен€ть местами
		// и целую части числа и вывести полученное значение числа.
		double x = 123.456;
		System.out.println (+x);
		double y = (x * 1000) % 1000 + (int) x / 1000.0;
		System.out.println("Zamenyam" +y);
	}

}
