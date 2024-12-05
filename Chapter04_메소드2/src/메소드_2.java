import java.util.Scanner;

public class 메소드_2 {
	static char WeelData(int year , int month ,int day ) {
		// 1. 1년도 1월~1일 ~~ 전년도까지의 총 날수
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400; 
					
		// 2. 전달까지의 총날수 
		int [] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < month-1; i++) {
			total+=lastday[i];
		}
		// 3. 입력된 일 
		total+=day;
		// -------------------총합 % 7 
		int week=total%7;
		char [] strWeek= {'월','화','수','목','금','토','일'};
		
		return strWeek[week];
		
	}
	public static void main(String[] args) {
		// 년,월,일을 입력받아서 요일을 구하는 메소드
		Scanner scan = new Scanner(System.in);
		System.out.println("년 월 일을 입력(2024 11 20):");
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		char c= WeelData(year, month, day);
		System.out.println(year+"년"+month+"월"+day+"일은"+c+"요일입니다");
	}

}
