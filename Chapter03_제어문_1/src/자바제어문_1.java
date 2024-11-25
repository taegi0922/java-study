
public class 자바제어문_1 {

	public static void main(String[] args) {
		// 난수 발생 => Math.random() 
		int score =(int) (Math.random()*101);
		System.out.println("Score="+score);
		/*
		 * 변수 => 초기화
		 * 초기화 => 명시적인 초기화
		 * 			 int a =10 ;
		 * => 난수 : 컴퓨터가 임의의 수를 추출 
		 * => 입력 : scan.next()
		 * => 파일읽기 / 데이터베이스 ... 
		 * 
		 * 자바 => 기본 문법 / 프로그램의 순서 
		 * 	최종 = > 네트워크
		 * 			 데이터베이스 
		 * */
		
		if(score >= 90) {
			System.out.println(score+": a등급입니다");
		}else if(score >= 80) {
			System.out.println(score+": b등급입니다");
		}else if(score >= 70) {
			System.out.println(score+": c등급입니다");
		}else if(score >= 60) {
			System.out.println(score+": d등급입니다");
		}else {
			System.out.println(score+": f등급입니다");
		}

	}

}
