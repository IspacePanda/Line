package LineExpressions21;

public class lineinieVirazhenia21 {

	public static void main(String[] args) {
		// ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� �
		// ����� ������). �������� �������
		// � ����� ����� ����� � ������� ���������� �������� �����.
		double x = 123.456;
		System.out.println (+x);
		double y = (x * 1000) % 1000 + (int) x / 1000.0;
		System.out.println("Zamenyam" +y);
	}

}
