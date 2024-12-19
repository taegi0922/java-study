package com.sist.lib;
/*
 * 	객체 복제
 * 		= 같은 메모리 주소 사용 (같이 사용) => 얕은 복사
 * 		A a = new A();
 * 		A b= a ==> 주소 참조 (Call by Reference)
 * 		= 다른 메모리 주소 사용(따라 사용 ) => 깊은 복사 
 * 		A a = new A();
 * 		A b= a.clone() => 새로운 메모리 생성 
 * 		
 * */
class Member implements Cloneable{
	private int mno;
	private String name;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Member(int mno, String name) {
		this.mno = mno;
		this.name = name;
	}
	
	//메모리를 통쨰로 복사해서 새로운 메모리에 저장 
	//스프링 => prototype 
	//디자인패턴 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
public class 라이브러리_oject_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
