package jo.calendar;

import java.util.Scanner;

public class Prompt {
	
	 /**
	  * 
	  * @param week 요일명
	  * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
	  */
	
	public int parseDay(String week) {
		if(week.equals("su")) return 0;
		else if (week.equals("mo")) return 1;
		else if (week.equals("tu")) return 2;
		else if (week.equals("we")) return 3;
		else if (week.equals("th")) return 4;
		else if (week.equals("fr")) return 5;
		else if (week.equals("sa")) return 6;
		else 
			return 0;
	}
	
	public void runPrompt() {
		
		
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		
		// 특정 횟수가 없으면 while, 있으면 for문 사용!
		int monthNum = -1;
		int year = 0;
		int weekday = 0;
		
		while (true) {
			System.out.println("년도를 입력하세요.(exit : -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year == -1)
				break;
			
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			monthNum = scanner.nextInt();
			System.out.println("첫번째 요일을 입력하세요(su, mo, tu, we, th, fr, sa).");
			String startDay = scanner.next();
			weekday = parseDay(startDay);
			
			if (monthNum > 12 || monthNum < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			cal.printCalendar(year, monthNum, weekday);
		}
		System.out.println("반복 종료");
		
//		cal.printSampleCalendar();
		
		scanner.close();
	
	}

	public static void main(String[] args) {
		
	}
	
		

}
	
