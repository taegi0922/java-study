/*
 * 알바벳을 입력받아서 
 * 	=> 대문자 / 소문자 / 알파벳이 아닌 경우 
 * 
 * 	 대문자라면 => if(대문자 조건)
 * 	 소문자라면 => if(소문자 조건) 
 * 	 알파벳이 아니라면 =>if(대문자,소문자가 아니라면)
 * 
 * 	=> 문법 => 영어
 * */

import java.util.Scanner; // 입력을 받아서 처리해 주는 클래스
//라이브러리
public class 자바제어문_단일조건문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자입력: ");
		char ch = scan.next().charAt(0); // 문자 첫번째를 가져오는 경우 
		
		if(ch>='A' && ch<='Z' ) {
			System.out.println(ch+"은 대문자입니다");
		}
		if(ch>='a' && ch<='z' ) {
			System.out.println(ch+"은 소문자입니다");
		}
	}

}
