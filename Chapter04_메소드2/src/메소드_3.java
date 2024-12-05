/*
 * 	숫자 야구게임 => 절차적언어(main)
 * 				  => 메소드형식 변환
 * 				  => 객체지향 프로그램으로 변환 
 * 1. 3개 정수 추출 => 1~9 => 중복없는 정수 
 * 2. 사용자 입력
 * 3. 난수 입력 값 비교 
 * 4. 힌트
 * 5. 종료
 * 
 * */

import java.util.Scanner;

public class 메소드_3 {

	public static void main(String[] args) {
		int num [] = new int [3];
		for (int i = 0; i < num.length; i++) {
				num[i] = (int)(Math.random()*9)+1;
				for (int j = 0; j < i; j++) {
					if(num[i] == num[j]) { // 난수 중복 체크
						i--;
						break;
					}
			}
		}
		Scanner scan = new Scanner(System.in);
		int [] user = new int[3]; //사용자 입력
		while(true) {
			System.out.println("세자리 정수를 입력");
			int input = scan.nextInt();
			
			if(input<100 || input>999) { // 오류철; => 유효성 검사
				System.out.println("세자리 정수만 입력해야됩니다");
				continue;
			}else {
				user[0] = input/100;
				user[1] = ((input/10)%10);
				user[2] = input%10;
			}
			
			int s = 0,b=0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(num[i] == user[j]) { // 같은 숫자가 있다면
						if(i == j) { // 같은숫자에 같은 자리 
							s++;
						}else {
							b++; //같은숫자에 다른 자리
						}
					}
				}
			}
			System.out.println("번호 "+input);
			System.out.println("=============전광판============");
			System.out.print("S: ");
			for(int i=0;i<s;i++) {
				System.out.print("●");
			}
			System.out.println();
			System.out.print("B: ");
			for(int i=0;i<b;i++) {
				System.out.print("○");
			}
			System.out.println();
			System.out.println("==================");
//			System.out.println("결과: "+s+"S"+b+"B");
			
			if(s ==3) {
				System.out.println("game over");
				break;
			}
		}
 
	}

}
