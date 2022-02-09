package jo.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	
	public void runPrompt() {
		
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
			
			cal.printCalendar(2022, monthNum);
		}
		System.out.println("반복 종료");
		
//		cal.printSampleCalendar();
		
		scanner.close();
	
	}

	public static void main(String[] args) {
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
		 
		}
	
		

}
