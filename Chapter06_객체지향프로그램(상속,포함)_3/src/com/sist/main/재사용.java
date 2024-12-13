package com.sist.main;

import java.util.ArrayList;

/*
 *	논리적 관계
 *	1.상속 : is-a
 *	  동물 ani = new 개() => 개는 동물이다
 *	2.포함: has-a : 클래스안에서 클래스를 포함
 *-------------------------------------------- 클래스 크기
 *	객체가 전체가 4byte를 가지고 있다
 *	 => 형변환
 *		------
 *		자동 형변환(묵시적 형변환)
 *		상위클래스 객체 = new 하위클래스생성자()
 *		강제 형변환
 *		int a=(int)10.5
 * */
class Sawon{
	String name;
	String dept;
	String loc;
	
	public void display() {
		System.out.println("이름"+name);
		System.out.println("부서"+dept);
		System.out.println("근무지"+loc);
	}
}
public class 재사용 {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		Sawon s1 =new Sawon();
		s1.name="홍길동";
		s1.dept="개발부";
		s1.loc="서울";
		list.add(s1);
		Sawon s = (Sawon)list.get(0);
		s.display();

	}

}
