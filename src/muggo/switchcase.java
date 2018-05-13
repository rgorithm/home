package muggo;

import java.util.Scanner;

public class switchcase {
	public int getmaxDayOfMonth(int se) {
		switch (se) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 5:
			return 31;
		case 7:
			return 31;
		case 8:
			return 31;
		case 10:
			return 31;
		case 12:
			return 31;
		default:
			return 30;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		switchcase sw = new switchcase();
		System.out.println("달을입력하세요:");
		int month = sc.nextInt();
		System.out.printf("해당달은%d일까지있습니다.",sw.getmaxDayOfMonth(month));

	}
}
