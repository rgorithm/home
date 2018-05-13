package muggo;

import java.util.Scanner;

public class Maxday {
	static public int [] maxday = {31,28,31,30,31,30,31,31,30,31,30,31};
	public int getMaxdayOfMonth(int month) {
		return maxday[month-1];
	}
	public void calendar() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------");
		System.out.println("1\t2\t3\t4\t5\t6\t7");
		System.out.println("8\t9\t10\t11\t12\t13\t14");
		System.out.println("15\t16\t17\t18\t19\t20\t21");
		System.out.println("23\t24\t25\t26\t27\t28");
	}
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Maxday md = new Maxday();
		
		System.out.println("달을입력하세요: ");
		int month = sc.nextInt();
		System.out.printf("%d월은%d일까지있습니다.\n\n",month,md.getMaxdayOfMonth(month));
		sc.close();
		md.calendar();
		
	}

}
