/*
 * 	무한루프 
 * 	컴퓨터 => 난수 : 1~100사이의 정수 추출
 *   		=> 맞추는 게임 => 힌트 UP / DOWN
 * */

import java.util.Scanner;

public class 반복문_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int com =(int)(Math.random()*100)+1;
		for( ; ; ) {
			System.out.println("정수 입력");
			int user = scan.nextInt();
			if(com > user) {
				System.out.println("UP");
			}else if(com < user) {
				System.out.println("Down");
			}else {
				System.out.println("정답!");
				System.exit(0);
				// 무한루프는 반드시 종료 조건을 첨부한다 
			}
		}

	}

}
