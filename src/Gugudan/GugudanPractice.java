package Gugudan;
import java.util.Scanner;

public class GugudanPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int inputNum = scanner.nextInt();
//		
//		for(int i = 2; i<=inputNum ; i++) {
//			for(int j = 1; j<=inputNum ; j++) {
//				System.out.print(i*j);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i = 2; i<=first; i++) {
			for(int j = 1; j<=second; j++) {
				System.out.print(i*j);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
