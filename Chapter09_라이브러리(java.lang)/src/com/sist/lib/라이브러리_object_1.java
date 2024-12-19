package com.sist.lib;
class Sawon{
	private int sabun;
	private String name;
	
	public Sawon() {
		sabun=1;
		name="홍길동";
		System.out.println("객체생성= 초기화완료");
	}
	public void display() {
		System.out.println("사번"+sabun);
		System.out.println("이름"+name);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("사원 객체 소멸");
	}
	
}
public class 라이브러리_object_1 {

	public static void main(String[] args) {
		Sawon sa = new Sawon(); // 객체 생성 
		sa.display();// 객체 활용
		sa=null; // 주소값 
		// 직접 해제 
		System.gc(); // 가비지 컬렉션 호출 => null, 사용하지 않는 데이터 회수 

	}

}
