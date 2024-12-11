/*
 * 	1.주의점
 * 		1)  static 메소드에서는 인스턴스변수 ,인스턴스메소드를  사용할수없다
 * 		=> 사용시에는 객체 생산후에 사용이 가능
 * 		2)static 메소드 , static변수는 this를 사용할 수 없다.
 * 		3)static 블록은 static변수만 초기화가 가능
 * 		4) 인스턴스 메소드에서는 인스텉스변수 ,static을 사용 할수 있다 
 * 		5) 초기화 
 * 
 * 		2. 접근 지정어 => 객체 사용 범위 지정 
 * 		=> 멤버변수 : 다른 클래스에서 사용가능
 * 		[접근지정어] 데이터형 변수명
 * 		[접근지정어] [제어어] 리턴형 메소드명(매개변수)
 * 		-----------
 * 	=> 지역변수에는 접근 지정어를 사용할수없다
 * 		------- 메소드안에서 사용 
 * 			=>final만 사용이 가능 => 싱수 /변수 
 * 클래스 , 멤버변수 , 메소드 => 접근 제어 
 * --------------------------------------------------------------------------------------------------------
 * 접근지정어      적용대상							접근 가능 대상						접근 불가 대상
 * --------------------------------------------------------------------------------------------------------
 * public: 클래스,필드(멤버변수),생성자,메소드 			모든대상							 X
 * --------------------------------------------------------------------------------------------------------
 * protected: 멤버변수,생성자,메소드 					같은폴더(패키지)				다른 폴더에서 사용이 불가능
 * 														또는 상속받은 클래스			
 * 														=> 다른 폴더에 있는 경우 
 * --------------------------------------------------------------------------------------------------------
 * default: 클래스,멤버변수,생성자,메소드				같은 폴더에서만 가능				
 * --------------------------------------------------------------------------------------------------------
 * private: 멤버변수,생성자,메소드						자신의 클래스 내부
 * --------------------------------------------------------------------------------------------------------
 * 		private < default < protected < public
 * ---------------------------------------------
 * | 오버라이딩 => 접근지정어 처리
 * 	 => 접근 지정어는 확장은 가능 => 축소는 안된다
 * ***많ㅇ이 사용
 * 	  멤버변수 => 은닉화  private
 * 	  생성자 , 클래스 ,메소드 => 모든 클래스 연결 : public
 * 	  ----------------------- 다른 클래스에서 사용
 * 							  ----------- 
 * 							  다른 폴더에 존재할 수 있다 
 * 
 * 	제어어
 * 	=> static | abstract | final 
 * 	  static => 공통적인 => 공통으로 사용되는 메소드 / 변수
 * 	  final => 마지막 => 변수(상수) , 메소드 (종단) , 클래스(종단)
 * 
 * 	  abstract: 추상적인 => 공통기능
 * 	  -------- 클래스 , 메소드에서만 사용이 가능 
 * 	  기능 설계
 * 	  --------
 * 	  데이터베이스 : 데이터를 저장하는 장소
 * 				= 메모리 : 변수,배열, 클래스  => 휘발성
 * 				= 파일 
 * 				= 오라클
 * 
 * 		클래스 : public / default => public : 모든 클래스사용 
 * 		메소드
 * 		멤버변수
 * 		지역변수 
 * 	
 * 
 * */
class Member{
	private String id; // Member클래스 안에서만
	protected String pwd; // 같은 폴더
	int age; // 같은 폴더
	public String name; // 모든 클래스 
}
public class 접근지정어_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
