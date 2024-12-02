
public class 배열_5 {

	public static void main(String[] args) {
		// 6개의 난수 발생 => 중복이 없는 데이터 출력 (1~45)
		//선언
		int [] lotto = new int[6];
		// 초기값
		for (int i = 0; i < lotto.length; i++) {
				lotto[i] =(int)(Math.random()*45)+1;
				for (int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) { // 중복이 없는 데이터 생성
						i--; 
						break;
					}
					
				}
		}
		// 처리 => 출력 
		for (int i : lotto) {
			System.out.println(i+" ");
		}
	}

}
