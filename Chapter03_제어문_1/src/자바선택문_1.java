/*
 * 	선택문 : 다중조건문을 단순화 시킨 제어문
 * 			=> 한개만 수행이 가능
 * 			=> 게임 / 네트워크
 * 			=> ---------------- 값을 한개만 선택(선택문), 범위(다중조건문)
 * 								--------
 * 			=> 웹에서 사용 빈도가 거의 없다 
 * 				if / if~else / for / while / break 
 * 				==================================
 * 		1. 형식)
 * 			switch(정수,문자, 문자열)
 * 			
 * 			1) 정수 => 메뉴 
 * 			switch(no) => 0,1,2..
 * 			{
 * 				case 0 :
 * 				0일떄 처리 문장
 * 				break;
 * 				case 1 :
 * 				1일떄 처리 문장
 * 				break;
 * 				default : 
 * 				else 와 같다
 * 				break; 
 * 			}
 * */
public class 자바선택문_1 {

	public static void main(String[] args) {
		int score =(int)(Math.random()*101);
		int avg =score/10;
		switch (avg) {
		case 10 , 9:
			System.out.println(score+"점은 S등급입니다");
			break;
		case 8:
			System.out.println(score+"점은 A등급입니다");
			break;
		case 7:
			System.out.println(score+"점은 B등급입니다");
			break;
		case 5:
			System.out.println(score+"점은 C등급입니다");
			break;
		case 4:
			System.out.println(score+"점은 D등급입니다");
			break;
		default:
			System.out.println(score+"점은 F등급입니다");
		}

	}

}
