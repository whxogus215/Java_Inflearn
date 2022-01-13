package jo.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
//		int first = scanner.nextInt();
//		int second = scanner.nextInt();
//		System.out.println("두 수의 합은 " + (first + second) + "입니다.");
		
		int a,b;
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
//		System.out.println(a + ", " + b);
//		System.out.println("두 수의 합은 " + (a + b) + "입니다.");
		System.out.printf("두 수의 합은 %d입니다.", a+b);
		
		scanner.close();  // 파일을 Open 했다면 마지막엔 꼭 Close 해주기! (그래야 원인이 사라짐)
		
	}

}
