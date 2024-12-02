import java.util.Iterator;

public class 배열_생성_2 {
	public static void main(String[] args) {
		// 1~10까지 난수 발생 => 배열[10] => 중복이 없이 저장 
		int arr [] = new int[10];
	
		for(int i=0;i<arr.length;i++) {
			 arr[i] =(int)(Math.random()*10)+1; 
			 
			 for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--; 
					break; //break를 건 이유는 같은거 만나면 
						   //뒤에꺼까지 안보고 바로 빠져나가게 걸어준다
				}
			}
			 
		}
		for (int i : arr) {
			System.out.println(i+" ");
		}
	}
}
