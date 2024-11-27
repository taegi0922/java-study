/*
 * 	문자열 => 기능(메소드) => 반드시 결과값(리턴형/반환형)
 * 		=>int scan.nextInt();
 * 	
 * 		=>String : 문자열을 저장하는 데이터형 
 * 				   -------------------------- 제한이 없다 
 * 					일반 데이터형으로도 사용 / 클래스형으로 사용이 가능 
 * 		문자열 변수 선언
 * 		=> String name = "홍길동";
 * 		
 * 		=> 기능(메소드)
 * 			=> 문자열은 비교연산자를 사용하지 않는다 
 * 			문자열 기능
 * 			-----------
 * 			1)비교기능
 * 			***** equals() => == 
 * 			equalsIgnoreCase => 대소문자 구분없이 비교: 예) 검색
 * 			equals : 대소문 구분 
 * 			---------------------------------------------------
 * 
 * */
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// 사용자의 입력값을 받아서 => ID/PWD => 로그인 
		String myId = "admin";
		String myPwd = "1234";
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("------------");
			System.out.println("아이디 입력");
			String id = scan.next();
			System.out.println("------------");
			System.out.println("비밀번호 입력");
			String pw = scan.next();
			if(id.equals(myId)) {
				if(pw.equals(myPwd)) {
					System.out.println("로그인 성공!!");
					break;
				}else {
					System.out.println("비밀번호 틀림");
					System.out.println("다시입력");
				}
			}else {
				System.out.println("아이디 틀림");
				System.out.println("다시입력");
			}
		}

	}

}
