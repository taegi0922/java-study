/*
 * class ClassName{
 * 		------------------
 * 		변수 : 프로그램에 필요한 데이터를 저장해서 사용
 * 				=> 한개만 저장이 가능
 * 				=> 기본형 / 배열 / 클래스 => 변수
 * 		1.변수의 종류
 * 			=> 인스턴스 변수: 객체생성시마다 메모리에 따로 저장 => heap 영역
 * 
 * 			=> 공유 변수: 모든 객체가 동시에 사용이 가능, => MethodArea 영역
 * 						  한번 변경이 되면 모든 객체가 동시에 변경,
 * 							예) 학원명,학교명,부서명,로그등등 
 * 						  static , String 등등 
 * 
 * 			=> 지역변수 : 메소드 블럭안에서 선언되는 변수 => Stack 영역
 * 
 * 		생성자 => 
 * }
 * */
class Card{
	char number;
	String type;
	// new를 이용해서 저장공간을 생성한후에 사용 => 여러개 사용이 가능
	static int width;
	static int height;
	// 컴파일시에 자동 생성 => 저장 공간이 한개만 사용 => 공유 
}
public class 클래스_1 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		// 객체 => 정적인 상태 (데이터) => 명사형 => 변수
		// 객체 => 동적인 상태 (기능) => 동사형 => 메소드
		c1.number='A';
		c1.type="♡";
		c1.width=150;
		c1.height=180;
		
		System.out.println("c1안에 저장된 데이터 number: "+c1.number);
		System.out.println("c2안에 저장된 데이터 number: "+c2.number); // 인스턴스변수라 값이 공유 x
		System.out.println("c1안에 저장된 데이터 width: "+c1.width);
		System.out.println("c2안에 저장된 데이터 width: "+c2.width); // 정적변수라 값이 공유 o 
		/*c1 => number,type => 객체 
		 * 
		 * 객체 => 사용자 정의 클래스의 변수 => 여러개를 제어할수있다 
		 * ---- 여러개 변수를 저장할 수 있는 메모리 공간의 이름
		 * ---- 메모리 주소를 이용하는 프로그렘 => 참조 변수 
		 * */

	}
   
}
