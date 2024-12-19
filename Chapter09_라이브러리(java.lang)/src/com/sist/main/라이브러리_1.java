package com.sist.main;
/*
 * 	자바에서 지원하는 라이브러리	
 * 					  ---------- 프로그램에 필요한 클래스를 모아서 
 * 	=>라이브러리중심 => 조립
 * 	=> Scanner / System / String ..등등
 * 
 * => 라이브러리
 * 	1) 자바에서 지원 
 * 		java.lang
 * 			object
 * 			System
 * 			String	
 * 			StringBuffer
 * 			Math
 * 			Wrapper: 데이터형을 클래스화
 * 		   -------
 * 				***=>Integer
 * 				***=>Double
 * 				***=>Boolean
 * 		java.util
 * 			=>Scanner
 * 			=>Collection
 * 			  --------- 배열대체
 * 			  List / Set / Map 
 * 			  List : ****ArrayList,Vector,LinkedList,Stack
 * 			  Set : TreeSet / ***HashSet : 중복없는 데이터 
 * 			  Map : ***HashMap / HashTable
 * 		java.io
 * 			=>FileReader /FileWriter 
 * 			=>InputStream / OutputStream
 * 			=> BufferReader /  BufferWriter
 * 			=> 입출력 : 파일 / 메모리 / 네트워크 
 * 			=> ~Stream , Reader/Writer
 * 			   네트워크 , 파일업로드 /다운로드 
 * 		java.sql
 * 			=> Connection
 * 			=> Statement
 * 			=> ResultSet
 *--------------------------
 * 		java.net
 * 			=> URL / ServerSocket /Socket
 * 		java.text
 * 			=> SimpleDateFormat / MessageFormat 
 * 		java.lang.reflect
 * 				=> 리플렉션 => 메소드 / 클래스 / 변수 / 생성자 
 * 	****Annotation, 열거형 
 * 		----------
 * 	J2SE
 * 	웹 라이브러리 : JSP / 
 * 			---------------------------
 * 			javax.swing(x) => 한번사용시 폐기
 * 			---------------------------
 * 			=> javax.http
 * 			=> javax.servlet.http
 * 			=> org.springframework
 * 	2) 외부업체 지원: Jsoup / lombok / Spring
 * 		=> mvnreposcitory.com
 * 		=> simple-json / bson....
 * 	3) 사용자 정의 : 잘만들어진 클래스 / 자주 클래스
 * 		=>.jar 
 * 		=> 1차 =>jsp(mvc =>spring형식)
 * ===============================================
 * 		java.lang패키지
 * 		1)import를 생략할 수 있다 => 자동 추가
 * 			=> 가장 많이 사용 라이브러리 
 * 		2) 대표 클래스
 * 			= object : 모든 클래스의 상우 ㅣ클래스 
 * 					 ------------ on
 * */
class Student{
	private String name;
	private String phone;
	private String address;
	
	public Student(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public void print() {
		System.out.println("이름"+name);
		System.out.println("번호"+phone);
		System.out.println("주소"+address);
	}
	
}

public class 라이브러리_1 {
	public static void main(String[] args) {
			Student s1 = new Student("홍길동","010-1111-1111", "서울");
			Student s2 = new Student("홍두꺠","010-2222-2222", "경기도");
			s1.print();
			System.out.println(s1); // 메모리 주소 => 묵시적 
			s2.print();
			System.out.println(s2.toString()); // 명시적  
			// toString() 자주 사용이 된다 / 객체의 값이 정상적으로 처리 확인 
			// 객체를 문자열화 시킨다
			// clone() : 객체를 복제할 경우 
		    // 겍체 복사
			// 얕은 복사 => 같은 주소를 이용
			// --------- Call By Reference 
			// 깊은 복사 => clone => 새로운 메모리에 저장 
			// -------- 게임 (아바타) => prototype 
			// = finalize(): 소멸자 => 메모리 해체시에 자동 호출된다
			//   --------- System.gc() : 바로 회수
			//  ---------- 프로그램 종료시에 회수
			// = equals() => 객체 비교 => 재정의(오버라이딩)
			// hashCode() => 비교 
	}

}
