package LineExpressions22;

import java.util.Scanner;

public class lineinieVirazhenia22 {

	public static void main(String[] args) {
		// Дано натуральное число Т, которое представляет длительность прошедшего
		// времени в секундах. Вывести данное
		// значение длительности в часах, минутах и секундах в следующей форме:
		// ННч ММмин SSc.
		Scanner numberOfSeconds;
		int t;
		numberOfSeconds = new Scanner(System.in);
		System.out.print("Введите кол. сек. ");
		t = numberOfSeconds.nextInt();

		System.out.println("Вы ввели " + t);

		int hour;
		int min;
		int sec;

		int saveNumberOfSeconds = t;
		if ((t > 86400) || (t < 0)) {
			System.out.println("не верное значение.");
			return;
		}
		hour = t / 3600;
		t = (char) (t - hour * 3600);
		min = t / 60;
		t = (t - min * 60);
		sec = t;

		System.out.println(
				"B " + saveNumberOfSeconds + " секундах: " + hour + " Часы " + min + " Минут " + sec + " секунд ");

		saveNumberOfSeconds = t;

	}

}
