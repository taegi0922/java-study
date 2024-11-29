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
					break;
				}
				
			}
		}
		for (int i : arr) {
			System.out.println(i+" ");
		}
	}
}
