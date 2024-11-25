/*
 * 	 변수 / 연산자 / 제어문 => 기본 
 * 	메소드/ 객체지향 프로그램
 * 		라이브러리 => 조립
 * 
 * 	제어문 => 연산자가 응용 
 * 	------ 배열 
 * 		   ----  메소드 
 * 				 ------  클래스 
 * 
 * 	1. 제어문
 * 	   조건문: 사용자 요청에 맞게 처리 => 필요하면 수행 => 건너뛴다 
 * 			   =======================
 * 			예)	검색, 상세보기 , 로그인 , 아이디 중복체크 ...
 * 			= 단일 조건문: 독립문장으로 실행 
 * 			 형식) if(조건문){
 * 				조건문이 true 일떄 실행한다 .
 * 				조건문에 사용되는 연산자 
 * 				========================
 * 				부정 연산자(!), 비교연산자(==,!=,<,>,<=,>=) , 논리연산자(&&,||)
 * 			}
 * 			=> 조건이 true 면 문장 실행 false 면 건너 뛴다
 *  
 * 	   선택 조건문 : true /false 를 나눠서 따로 처리
 * 						=> 가장 많이 사용 되는 조건문 
 * 						=> 웹: 모든 내용이 브라우저로 전송 
 * 								===================== true / false
 * 								
 * 					형식) if(조건문){
 * 						조건이 true 일떄 처리
 * 					}else{
 * 						조건이 false 일떄 처리 
 * 					}
 * 
 * 		다중 조건문: 예) 메뉴처리 , 키보드 처리 , 별점 
 * 					**** 여러개의 조건문을 사용하지만 한개의 조건만 수행 
 * 					if(조건문){
 * 						조건이 true 일떄 수행 ==> 종료 
 * 						만약 false면 밑으로 이동
 * 					}else if(조건문){
 * 						조건이 true 일떄 수행 ==> 종료 
 * 						만약 false면 밑으로 이동
 * 					}else if(조건문){
 * 						조건이 true 일떄 수행 ==> 종료 
 * 						만약 false면 밑으로 이동
 * 					}else{
 * 						위에 조건들이 모두 false 면 
 * 						else 문이 무조건 수행하는 문장 
 * 					}
 *     반복문
 *     반복 제어문
 * */

import java.util.Scanner;

public class 자바제어문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 키보드 입력을 받아서 변수에 저장 
		// 자바에서 클래스를 저장할떄 => 반드시 new를 동적 메모리 할당(저장)
		// malloc(클래스의 크기) => 메모리를 만들어 준다
		// --------------------- => 승격 : new 
		// free() => delete : 자바 => 자동 메모리 회수: 가비지컬렉터 
		
		System.out.println("첫번째 정수 입력:");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int num2 = scan.nextInt();
		System.out.println("연산자 입력(+,-,*,/)");
		char op = scan.next().charAt(0);
		// 맨처음 문자를 읽는 경우에 사용 = charAt(0);
		
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("op="+op);
		
		//연산처리
		if(op == '+') {
			System.out.println("num1+num2"+num1+num2);
		}else if(op == '-') {
			System.out.println("num1-num2"+(num1-num2));
		}else if(op == '*') {
			System.out.println("num1*num2"+num1*num2);
		}else if(op == '/') {
			if(num2 ==0 || num1 == 0) {
				System.out.println("0으로 나눌 수없습니다");
			}else {
				System.out.println("num1/num2"+(num1/num2));
			}	
		}else {
			System.out.println("잘못입력");
		}
		
		

	}

}
