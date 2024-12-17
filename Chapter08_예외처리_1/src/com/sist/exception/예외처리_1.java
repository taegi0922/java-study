package com.sist.exception;
/*
 * 	변수 => 데이터형
 * 	연산자 / 제어문
 * 	배열 => 1차원
 * 	클래스 / 객체생성 /메소드
 * 	상속 => 오버라이딩
 * 	인터페이스
 * 	예외처리
 * 	라이브러리 => 조립
 * 
 * 예외처리 목적: 사전에 에러를 방지하는 목적
 * 				=> 비정상 종료를 방지하고 정상상태 유지
 * 				=> 예외처리 => 에러발생시 에러를 건너뛴다.
 * 에러발생
 * 	사용자 => 잘못된 입력 => 유효성 검사 => if(javaScript)
 * 	개발자 => 실수 => 배열인덱스 ,정변환 ,형변환
 * 3)예외처리 방법
 * = 예외복구 : ***try~catch 
 * 				   --- ----- 예외가 발생시 처리 복구
 * 				정상수행
 * 				=> 직접처리 => 개발자가 직접처리
 * 					try{
 * 						정상으로 수행하는 문장
 * 					}catch(예상되는 예외 클래스){
 * 						예외가 발생시 처리
 * 					}	
 * 				
 * 
 * 				
 * 			=예외회피: throws
 * 				=> 시스템이 맡기는 경우
 * 				=> 라이브러리에 많이 존재
 * 				=> 사용시에 예외처리후 실행 
 * 
 * */
public class 예외처리_1 {

	public static void main(String[] args) {
		System.out.println("문장1");
		System.out.println("문장2");
		System.out.println("문장3");
		try {
			System.out.println("문장4");
			System.out.println(10/0);
			System.out.println("문장6");
		} catch (Exception e) {
			System.out.println("문장7");
		}
		System.out.println("문장8");
		System.out.println("문장9");
	}

}
