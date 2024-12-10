/*
 * 클래스
 * 	***= =멤버변수만 가지고 있는경우 => 데이터형 클래스
 * 		사용자 정의 데이터형: ~VO,~DTO
 *  **** =메소드마 가지고 있는 경우 => 액션 클래스(가능)
 *  	  연결용: 오라클 연결 / 브라우저 연결
 *  			  ----------    -------------
 *  				~DAO			~Model 
 *  브라우저 ============오라클 (x)
 *  
 *   오버로딩의 조건
 *   --------------
 *   # 메소드명이 동일
 *	 # 리턴형은 관계없다
 *	 # 매개변수 => 갯수나 데이터형이 다른 경우
 *	 # 접근제한자는 관계옶다.
 *	#  한개 클래스안에서 존재 
 *
 *   =생성자의 용도 
 *   	= 변수 초기화(명시적인 초기화가 안되는 경우)
 *   					=> 구현후에 데이터 처리
 *   	= 시작과 동시
 * */
class Student{
	int hakbun=1;
	String name="홍길동";
	String sex="남자";
	
	// 기본생성자 생성 
	Student(){};
	//2.생성자
	Student(int hakbun,String name,String sex){
		this.hakbun = hakbun;
		this.name = name;
		this.sex =sex;
	}
}
public class 클래스_2 {

	public static void main(String[] args) {
		Student hong = new Student();
		System.out.println(hong.hakbun);
		System.out.println(hong.name);
		System.out.println(hong.sex);
		System.out.println();
		Student shim = new Student(2,"심청이","여자");
		System.out.println(shim.hakbun);
		System.out.println(shim.name);
		System.out.println(shim.sex);
		System.out.println();
		Student park = new Student(3,"박지성","남자");
		System.out.println(park.hakbun);
		System.out.println(park.name);
		System.out.println(park.sex);

	}

}
