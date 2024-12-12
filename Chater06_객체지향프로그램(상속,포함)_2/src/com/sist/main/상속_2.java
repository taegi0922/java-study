package com.sist.main;
/*
 * 	메소드 오버라이딩 => 메소드의 기능 변경 => 유지보수
 * -------------------------------------------------------
 * 	오버라이딩 조건*****
 * 	1.상속 => 상속받은 메소드를 변경해서 사용 
 * 	2.메소드명이 동일하다
 * 	3.매개변수가 동일
 * 	4.리턴형이 동일
 * 	5.접근지정어가 확대 가능,축소 불가능 
 *  
 *  => 실무 (입사)
 *     -----------
 *     1) 변수
 *     2) 연산자
 *     3) 제어문
 *     4) 메소드
 *     5) 멤버변수
 *     6) 생성자? 
 *    **** 7)오버라이딩 
 *    **** 7)인터페이스 
 *    **** 7)예외처리 
 *    
 *    class A{
 *    		void display(){};
 *    }
 *    class B extends A{
 *    	1. void display(){};
 *    	1.public void display(){};
 *    	1.protected void display(){};
 *    	1.private void display(){}; -- 오류(축소)
 *    }
 *    
 *   
 * */

class Animal{
	int a=10;
	public void run() {
		System.out.println("걷는다");
	}
}
class Dog extends Animal{
	int a=20;
	public void run() {
		System.out.println("4발로 걷는다");
	}
}
class Human extends Animal{
	
	public void run() {
		System.out.println("2발로 걷는다");
	}
}
public class 상속_2 {

	public static void main(String[] args) {
		// 관련 클래스가 여러개 있는 경우 => 상위 클래스로 이용 
		Animal ani = new Dog();
		ani.run();
		ani = new Human();
		ani.run();
		System.out.println(ani.a);
		/*	 ==> 동적 바인딩 => new 주소변경***자바
		 * 	변수 찾기
		 * 	--------- 선언되는 클래스형  
		 * 예) System.out.println(ani.a);
		 * 출력결과: 10
		 * 	메소드 찾기 
		 *  ---------- 생성자 
		 *  예) Animal ani = new Dog();
				ani.run();
				출력 결과: 4발로 걷는다
		 * */
	}

}
