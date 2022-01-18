package jo.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토 ");
		System.out.println("------------------- ");
		System.out.println("1 2 3  4  5  6  7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		String PROMPT = "cal> ";
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		
		// 특정 횟수가 없으면 while, 있으면 for문 사용!
		int monthNum = 0;
		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			monthNum = scanner.nextInt();
			if (monthNum == -1) {
				break;
			}
			
			if (monthNum > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n", monthNum, cal.getMaxDaysOfMonth(monthNum));
		}
		System.out.println("반복 종료");

//		cal.printSampleCalendar();

		scanner.close();

	}

}
