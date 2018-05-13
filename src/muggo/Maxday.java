package muggo;

import java.util.Scanner;

public class Maxday {
	public static void main(String[] args) {
		int [] maxday = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을입력하세요: ");
		int month = sc.nextInt();
		System.out.printf("%d월은%d일까지있습니다." ,month,maxday[month-1]);
		sc.close();
		
	}

}
