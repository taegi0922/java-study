/*
 * 	객체 구성
 * 	= 속성(변수) / 동작(메소드)
 * = 여러개의 독립적인 단위 => 부품 => 조립
 *									   ---- 프로그래밍
 *	객체를 만들떄 사용하는 키워드 (설계)
 *	------------------------------------- 클래스 
 *	메모리에 저장 후 사용 
 *	-------------------- 인스턴스 
 *
 *	class ClassName{
 *		-----------------------
 *		멤버 변수
 *			= 인스턴스 변수 : 객체 생성시마다 메모리가 다른 공간에 저장 
 *		    = 정적변수 : 메모리 공간 1개만 생성 => 공유 
 *			= 구분 : static 
 *					------- 공통으로 사용 메소드, 싱글턴 : 한개의 객체 생성
 *													=> 데이터베이스 연동
 *													=> 스프링은 모든 클래스가 싱글턴
 *			=> 적용(객체지향 => 권장) : 데이터를 보호 : 캡슐화 
 *			   데이터를 은닉화 => 메소드를 이용해서 접근하는 방식 
 *			
 *		----------------------
 *		생성자 : 변수에 대한 초기화 담당, 시작과 동시에 처리 기능 
 *				=> 생략이 가능 
 *				   -----------> 컴파일러에 의해 자동으로 추가 
 *								매개변수가 없는 생성자(디폴트 생성자)
 *				=> 특징
 *					1)클래스명과 동일한다
 *					2) 리턴형이 존재하지 않는다
 *					3) 여러개의 생성자를 만들 수 있다
 *					  --------------- 같은 이름으로 생성 => 오버로딩지원
 *					  오버로딩: 중복 메소드 생성
 *					 => 한개의 클래스안에서 만든다
 *					 => 메소드명이 동일
 *					 =>매개변수가 다르다 (갯수, 데이터형)
 *					 =>리턴형은 관계가 없다 
 *			***초기화시에는 주로 생성자를 이용한다
 *								 ----- 인스턴스 변수, static 변수를 사용할수있ㄷㅏ
 *		----------------------
 *		메소드: 기능 설계
 *				--------- 설정된 변수를 어떻게 사용
 *				--------- 동작
 *				--------- 자바의 단점 => CallBack을 만들 수 없다 
 *										 -------- 스프링에서는 AOP
 *
 *	   ====구성요소 
 *			리턴형 : 사용자 요청을 처리한 결과값
 *						=> 한개만 사용이 가능
 *						=> 기본형 / 배열 / 클래스 
 *				 
 *		---------------------
 *	}
 *
 *		this /this() =>
 * 		this => 클래스 자신의 메모리 주소를 설정
 * 		---- 멤버변수와 지역변수가 같은 경우 구분
 * 		---- JVM => 객체 생성될떄 자동으로 주소값을 저장 
 * 		---- 모든 멤버관련 => 메소드 , 변수 앞에 반드시 this
 * 			 최근에는 this.생략 => 컴파일러에 의해 자동 설정
 * 
 * 		this() => 자신 클래스의 생서자를 호출시에 주로 사용
 * 		----- 사용빈도는 거의 없다
 * 		= 사용위치 => 생성자안에서 다른 생성자를 호출할떄 사용
 * 					  생성자의 첫출에 위치
 * 						=> 문법상에 오류 발생 
 * 
 * 			컴파일러가 자동 처리
 * 			=> import java.lang.*;
 * 			=> 모든 클래스는 objcet 상속 
 * 			class A extends object
 * 			=> 메소드안에서 void => return 추가 
 * 			=> 생성자를 사용하지 않으면 기본생성자 추가 
 *
 *	=> 1) 메소드 2)접근지정어 3) 상속 4) 포함 
 *	   5)클래스의 종류(추상클래스 , 인터페이스)
 *	=> 예외처리 => 라이브러리(Colletion,Io,SQL,NetWork)
 *
 *
 *	 
 * */
public class 객체지향_1 {

	public static void main(String[] args) {
		

	}

}
