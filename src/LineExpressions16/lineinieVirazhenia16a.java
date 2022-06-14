package LineExpressions16;

public class lineinieVirazhenia16a {

	public static void main(String[] args) {
     int a = 1234;
     int b = a%10;
     int c = a%100/10;
     int d = a%1000/100;
     int e = a/1000;
     System.out.println(+b);
     System.out.println(+c);
     System.out.println(+d);
     System.out.println(+e);
     int z = b*c*d*e;
     System.out.println(+z);
	}

}
