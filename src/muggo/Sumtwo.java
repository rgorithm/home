package muggo;

import java.util.Scanner;

public class Sumtwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("정수 2개를 입력해라:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("두수의합은:" +(a+b));
		System.out.printf("%d와%d의합은%d입니다", a,b,a+b);
		sc.close();
	}

}
