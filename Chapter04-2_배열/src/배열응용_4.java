/*
 * 	정렬
 * 		= 선택정렬 / 버블정렬 
 * 		= ASC /DESC =====> oracle : order by
 * 		 ---- ----- 
 * 			    | 내림 차순(*********) => 최신순 
 * 		  |올림차순
 * 
 * 	선택정렬 : 한개의 데이터를 선택한후에 기준점으로 변경 
 * */
import java.util.Arrays;
public class 배열응용_4 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		// 초기화 


for (int i = 0; i < arr.length; i++) {
			 arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
//		 Arrays.sort(arr);
//		 System.out.println("정렬 후");
//		 for (int i : arr) {
//			 System.out.println(i+"");
//			}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] =arr[j];
					arr[j]=temp;
				}
			}		
		}
		System.out.println("정렬 후");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
