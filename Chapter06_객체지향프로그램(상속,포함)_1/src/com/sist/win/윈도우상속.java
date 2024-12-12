package com.sist.win;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

/*
 * 	상속 => 기존의 클래스를 재사용 => 추가 ,변경해서 사용
 * 			-------------
 * 			사용자 정의
 * 			라이브러리 => 변경해서 사용하는 상속이 많다
 * 			=> 코드의 재사용이 높다
 * 			   ------------- 개발 속도가 빠르다  => 최적화에 문제
 * 			=> 코드 관리가 용이하다
 * 			=> 코드가 간결해진다 => 코드를 볼 수없다(가독성)
 * 			=> 기존의 클래스 이미 검증된 상태: 신뢰성이 높다 
 * 
 * 		상속: is-a => 변경후 사용
 * 		포함:has-a => 있는 그대로 사용 
 * 
 * 		객체지향 =>권장(캡슐화,재사용(상속),변경,추가가 쉽게)
 * 											-----------------
 * 											오버로딩,오버라이딩
 * 
 * 		***상속의 문제점
 * 		  = 결합성이 높다(다른 클래스에 영향이 크다 )
 * 			예) 상속받는 클래스 => 상속을 내리는 클래스(변경)
 * 		  = 제약조건이 많다 
 * 		  = 메모리 커진다 => 속도 늦다 
 * 		  = 윈도우 사용하지 않는 이유 => 속도가 느리다 
 *		특징)
 *			1. 단일 상속만 가능
 *			2. 상속 기호: extends : 클래스를 확장해서 사용 
 *		class A{
 *			int a= 10
 *			void disply(){
 *			
 *		} class B extneds A{
 			
 *	 */
// 가장 큰 클래스 상속 => 포함 
public class 윈도우상속 extends JFrame  { // 윈도우를 쓸라면  extends JFrame 를 써야된다 
	// 윈도우 설정 => 실무 (구현)
	JButton b1 = new JButton("North");
	JButton b2 = new JButton("East");
	JButton b3 = new JButton("West");
	JButton b4 = new JButton("South");
	JButton b5 = new JButton("Center");
	public 윈도우상속() {
		setLayout(new GridLayout(5,1));
		
		// setLayout(new FlowLayout()); // 메뉴바 할떄 좋겠음
		add(b1);add(b2);add(b3);add(b4);add(b5);
		
		//레이아웃
//		add("North",b1);
//		add("South",b5);
//		add("Center",b4);
//		add("East",b2);
//		add("West",b3);
		
		// 크키 결정
		setSize(640,400);
		// 윈도우 보여달라
		setVisible(true);
	}
	public static void main(String[] args) {
		new 윈도우상속();

	}

}
