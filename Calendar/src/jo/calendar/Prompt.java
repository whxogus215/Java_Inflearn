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
	
	public void printMenu() {
		
		System.out.println("+----------------------------+");
		System.out.println("| 1. 일정 등록 ");
		System.out.println("| 2. 일정 검색 ");
		System.out.println("| 3. 달력 보기 ");
		System.out.println("| h. 도움말 q. 종료 ");
		System.out.println("+----------------------------+");
//		System.out.println("명령 (1, 2, 3, h, q)");
		
	}
	
	public void runPrompt() {
		
		printMenu();
		
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		
		// 특정 횟수가 없으면 while, 있으면 for문 사용!
		
		
		while (true) {
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = scanner.next();
			if (cmd.equals("1")) cmdRegister();
			else if (cmd.equals("2")) cmdSearch();
			else if (cmd.equals("3")) cmdCal(scanner, cal);
			else if (cmd.equals("h")) printMenu();
			else if (cmd.equals("q")) break;
		}
			
		System.out.println("Thank you. Bye~");
		scanner.close();
	
	}

	private void cmdCal(Scanner s, Calendar c) {
		int month = -1;
		int year = 0;
		System.out.println("년도를 입력하세요.(exit : -1)");
		System.out.print("YEAR> ");
		year = s.nextInt();
		
		System.out.println("월을 입력하세요.");
		System.out.print("MONTH> ");
		month = s.nextInt();
		
		if (month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			return; // 잘못 입력했을 경우 메소드 종료
		}
		
		
		c.printCalendar(year, month);
	}
	

	private void cmdSearch() {
		// TODO Auto-generated method stub
		
	}

	private void cmdRegister() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
	
		

}
	
