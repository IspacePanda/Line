package LineExpressions22;

import java.util.Scanner;

public class lineinieVirazhenia22 {

	public static void main(String[] args) {
		// ���� ����������� ����� �, ������� ������������ ������������ ����������
		// ������� � ��������. ������� ������
		// �������� ������������ � �����, ������� � �������� � ��������� �����:
		// ��� ����� SSc.
		Scanner numberOfSeconds;
		int t;
		numberOfSeconds = new Scanner(System.in);
		System.out.print("������� ���. ���. ");
		t = numberOfSeconds.nextInt();

		System.out.println("�� ����� " + t);

		int hour;
		int min;
		int sec;

		int saveNumberOfSeconds = t;
		if ((t > 86400) || (t < 0)) {
			System.out.println("�� ������ ��������.");
			return;
		}
		hour = t / 3600;
		t = (char) (t - hour * 3600);
		min = t / 60;
		t = (t - min * 60);
		sec = t;

		System.out.println(
				"B " + saveNumberOfSeconds + " ��������: " + hour + " ���� " + min + " ����� " + sec + " ������ ");

		saveNumberOfSeconds = t;

	}

}
