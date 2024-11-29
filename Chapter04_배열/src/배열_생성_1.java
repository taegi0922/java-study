/*
 * 	연산자 => 결과값 => 응용(제어문)
 * 	제어문 => 응용 (배열)
 * 	배열
 * 	 	1) 배열 생성 => 관련된 데이터(기능이 동일한 역할)
 * 		2) 배열 초기화 => for을 주로 사용
 * 		3) 배열 출력 => index를 이용 / for - each(데이터만 읽기)
 * 						/ Arrats.toString() 
 * 			제어 : 값을 변경 = > index를 이용한다
 * 					for -each : 화면 출력용으로 사용 
 * 					========== front  
 * */
public class 배열_생성_1 {
	public static void main(String[] args) {
			int[] arr = {10,20,30,40,50};
			
			for (int i : arr) {
				System.out.println(i+" ");
			}
	}

}
