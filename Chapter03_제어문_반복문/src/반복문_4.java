import java.util.Scanner;

public class 반복문_4 {

	public static void main(String[] args) {
		// 1~100사이의 정수 추출
		int com = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		
		while(true) { // 조건안에 true를 쓰면 무한루프기떄문에 => 종료시점을 무조건 지정!!
			System.out.println("정수 입력:");
			int user = scan.nextInt();
			if(user<1 || user >100) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			
			if(com > user) {
				System.out.println("더 큰수 를 입력하세요");
			}else if(com < user) {
				System.out.println("더 작은 수 를 입력하세요");
			}else {
				System.out.println("정답입니다!!!");
				break;
			}
		}

	}

}
