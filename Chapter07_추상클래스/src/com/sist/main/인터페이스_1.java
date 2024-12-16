package com.sist.main;
/*ㅣ
 * 	인터페이스
 *   ---------
 *   1) 추상클래스의 일종이다(클래스와 동일하게 취급)
 *   2)	추상클래스 : 단일 상속
 *   	인터페이스 : 다중 삭송
 *   3) 인터페이스는 
 *   	변수(x) => 상수
 *   	메소드(구햔된 X) => 구현 안된 메소드만 가지고있다
 *   4)서로다른 클래스를 모아서 한개의 이름을 ㅗ연결 
 *   5)결합성이 낮은 프로그램 구현
 *    ----------------------- 유지보수에 사용하기 좋다
 *    ****인터페이스를 수정하면 관련된 모든 클래스에 오류가 발생
 *    	  인터페이스는 고정해야된다
 *    	  -----------------
 *    		=> 구현된 메소드가 가능 default / static
 *    6)인터페이스는 변수나 메소드는 모두 public 
 * 
 * */
interface A{
	// int a; 상수여서 초기화를 시켜줘야된다
	int d=100; // public static final 이 생략되어 있다
	void aaa(); // public abstract 가 생략되어 있다 
	
}

public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
