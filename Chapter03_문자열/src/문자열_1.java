/*
 * 	String 클래스 => char[]을 제어 
 * 		=> 문자 여러개 저장하는 공간
 * 		   -----------
 * 			 문자열: " "  , char: ' '
 * 		=> 문자열을 저장하는 일반데이터 / 기능(메소드)을 가지고 클래스형 
 * 		=> 웹/ 윈도우 => 자바로 만들 수 있는 모든 프로그램의 핵심 
 * 			=> 오라클 : varchar2 / clob , MySql : varchar,text
 * 			=> C/C++ : 문자열이 없다 => char[] , char* 
 * 		=> 문자열 저장하는 방법 
 * 			String name = 
 * 		  ------- ------ 
 * 		 데이터형  변수명  
 * 		=> 클래스형으로 저장하는 방법
 * 		   String name = new String("홍길동");
 * 		=> String 에서 지원하는 기능 (메소드)
 * 		  #메소드
 * 		  리턴형(처리 결과값) 메소드명(매개변수..){
 * 				요청처리
 * 				결과값 전송 (결과값 1개)
 * 			}
 * 		  매개변수: 없는경우 / 한개인 경우 / 여러개
 * 											  
 * 		  메소드: 라이브러리 => 이미 만들어져 있는 상태
 * 		          *** 사용자 정의 => 직접 만들어서 처리
 * 					  ----------- 조립
 * 		 *****객체지향 프로그램 : 변수 / 메소드
 * 		---------------------------------------
 * 		String에서 사용하는 메소드 
 * 		 length() : 문자의 갯수,길이(한글/알바벳) => 동일
 * 					  *알파벳 => 저장시 1byte : ASC/ UniCode
 * 					  *한글 => 저장시 2byte : UniCode
 * 				               =>"UTF-8" 
 * 		--------------------------------------------
 * 			**** 오버로딩 vs 오버라이딩
 * 					|			|
 * 				   new        modify
 * 		----------------------------------------------
 *		 String msg ="hello java";
		int len = msg.indexOf("java");
		System.out.println(len); // 맨앞에있는 index번호를 알려준다
		// 대소문자 구분
		 * 
 * 		lastIndexof : 뒤에서부터 요청된 문자의 인덱스 번호 추출
 * 					=> URL / 파일경로 / GHKRWKDWK
 * 			예) String msg ="hello java"
 * 							 0123456789 
 * 				int len = msg.indexof('a'); => 7 
 * 				int len = msg.lastIndexof('a'); => 9
 *    --------------------------------------------------------
 *    	검색관련 
 *    	contains() : 포함 문자 => %검색어%
 *    	=> 일반 검색기
 *     
 *    	String msg ="hello java";
		if(msg.contains("va")) {
			System.out.println("포함");
		}else {
			System.out.println("no포함");
		}
 *    -------------------------------------------------
 *    		boolean contains(String s)
 *    						---------
 *    						포함된 문자		
 *    						| 포함된 경우 : true 안된경우: false
 *    
 *  	=> 사용되는 제어문: if
 *  	=> 정규식 
 *  ------------------------------------------
 *  	서제스트 : 자동완성기
 *   ------------------------------------------
 *   	startsWith : 시작하는 문자열이 같은 경우 => 자음(오라클 => procedure)
 *   
 *   	String msg ="           hello java";
		if(msg.trim().startsWith("hello")) { // trim()공백제거 
			System.out.println("포함");
		}else {
			System.out.println("no 포함");
		}
	--------------------------------------------------------------
 *     변환
 *     replace() => 문자/문자열 변환
 *   
 *      String replace(char old, char new)
 *      String replace(String old , String new)
 *    
 *   	String msg="hello java"
 *   	String s= msg.replace('a','b')
 *  	s = "hello jbvb";
 *    -----------------------------------
 * 		replaceAll() => 전체변경 
 * 
 * 		String replaceAll(String regex , String s)
 * 						  -----------
 * 						  패턴을 적용해서 변경
 * 						 ------------
 * 							정규식
 * 	  =>[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 * 		ip => 모든
 * 		198.63.11.1 
 *  -------------------------------------------------------
 *  	trim() : 좌우의 공백만 제거
 *  	
 *  	=> 입력여부 => 데이터를 자르는 경우에 공백을 제거 
 *  	
 *  	String trim()
 *  
 *  	String msg ="hello java  ";
 *  	String s = msg.trim() 
 *  	=> s = "hello java"
 *  	----------------------------------------------------
 *  	toUpperCase() : 대문자 변환 
 *  	toLowerCase() : 소문자 변환
 *  -----------------------------------------
 *  	valueof() => 모든 데이터형을 문자열로 변환 
 *  	
 *  	중복메서드 정의 -> 메소드명이 동일 
 *  	String valueof(int i)
 *  	String valueof(char i)
 *  	String valueof(boolean i)
 *  	String valueof(double i)
 *  	=> static 으로 제작 
 *        ------- 변수선언 없이 클래스명으로 접근이 가능
 *        String.valueof()
 *        
 *      int a= 10;
		int b= 20;
		System.out.println(a+b); //10+20 = 30
		System.out.println(String.valueOf(a)+String.valueOf(b)); //"10"+"20" = "1020"
	-------------------------------------------------------------------------------------
		subString() : 문자열 자르기
		split() : 단어별 구분 
		format() : 변환 
		equals() : ==(저장된 문자열 비교)
 * */

import java.util.Scanner;

public class 문자열_1 {

	public static void main(String[] args) {

	}

}
