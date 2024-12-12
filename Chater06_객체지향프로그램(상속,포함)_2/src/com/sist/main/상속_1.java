package com.sist.main;
/*
 * 	변경 (수정)
 * 	----------- 오버라이딩
 * 	=> 변수 오버라이딩
 * 	=> 메소드 오버라이딩 => 기능을 변경 해서 
 * */
class Super{
	String name; //필드
	int age;
	
	public Super() { // 생성자
		name ="홍길동";
		age = 25;
	}
} 
class Sub extends Super{ // 상속
	
	String name; //변수 오버라이딩
	int age;//변수 오버라이딩
	
	public Sub() { // 생성자 
		name= "심청이"; // 상속받은 필드 활용
		age =27;
	}
	
	public void display() { // 메소드 
		System.out.println("super name"+super.name+"super age"+super.age);
		System.out.println("this name"+this.name+"this age"+this.age);
	}
}
public class 상속_1 {

	public static void main(String[] args) {
	
		Sub sub = new Sub();
		sub.display();

	}

}
