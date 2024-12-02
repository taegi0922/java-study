// char 배열 사용법 / double / String 
// => 응용 => 정렬 / 달력 .... / 중복없는 난수 
// => 지니뮤직 , 서울 여행 , 맛집 ...
public class 배열_2 {
	public static void main(String[] args) {
		// 선언
		char [] alpha = new char[26];
		// 초기화
		char c = 'A';
		for (int i = 0; i < alpha.length; i++) {
			 alpha[i]=c++;
			}
		// 처리 => (x)
		// 출력 
//		for (char cc : alpha) {
//			System.out.print(cc+" ");
//		}
		// k 가 있는 인덱스번호를 출력
		for (int i = 0; i < alpha.length; i++) {
				if(alpha[i] =='K') {
					System.out.println("k 인덱스번호"+i);
					break;
				}
			
		}
	}

}
