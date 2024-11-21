/*
 * 	윤년 (********) 달력 / 일정표
 * ------
 * 	윤년 조건 
 * 	1. 4년마다
 * 	2. 100년마다 제외
 * 	3. 400년마다 
 * 	-----------------로마시대 ABC ==> DEF
 * 
 * 	year%4 == 0 && year%100 != 0 || year%400 == 0 
 * */

//년을 입력을 받아서 윤년 여부 확인

import java.util.Scanner;

public class 자바제어문_단일조건문2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도입력: ");
		int year = scan.nextInt();
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0 ) {
			System.out.println(year+"는 윤년입니다");
		}
		if(!(year%4 == 0 && year%100 != 0 || year%400 == 0) ) {
			System.out.println(year+"는 윤년아님");
		}

	}

}
