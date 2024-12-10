/*
 * 	구성요소
 * 		=> 멤버변수
 * 			| 공통으로 사용하는 변수여부(static) 
 *			| 정보 전체 => 오라클(static) 공유된 데이터 
 *
 * 		=> 생성자 / 초기화 블럭
 * 		 ------ 생략이 가능 / 오라클 연동 (드라이버 등록)
 * 				윈도우의 레이아웃 
 * 				웹 => 자동 로그인 
 * 		static 블럭 : Mybatis 연동
 * 
 * 		=> 활용 => 메소드 
 * 			 | 다른 클래스 연동(메세지)
 * 			 | 기능 처리 => 재사용
 * 		1.메소드 형식
 * 			[접근제한자]
 * 			=> 다른 클래스와 연결 => 공개 (public)
 * 			public : 모든 클래스 사용이 가능
 * 		  / protected : 같은 패키지 or 상속받은 클래스
 * 		  / private: 자신의 클래스영역에서만 사용이 가능(은닉화)
 *        / default: 같은 패키지 
 * 			 [제어어]
 * 			static : 공통으로 적용되는 메소드
 * 			final : 상수 메소드 => 확장,변경 X 
 *        abstract : 추상 메소드 => 선언만 가능 
 * 	
 * 		
 * 
 * */

import java.text.SimpleDateFormat;
import java.util.Date;

public class 클래스_1 {
	int a=10;
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm");
		String today =sdf.format(date);
		System.out.println(today);
	}
}
