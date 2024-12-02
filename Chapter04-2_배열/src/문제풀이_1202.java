import java.util.Scanner;

public class 문제풀이_1202 {
	public static void main(String[] args) {
		/*
		 * 1. 다음 중 배열 선언이 잘못된 것은? 4
		 * 
			1) int[] n = {1, 2, 3, 4, 5};
			2) int n[] = {0};
			3) int[] n = new int[3];
			4) int n[3] = new int[3];

			2.
			1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
			char [] c = new char[10]; 
​			 * */
//			2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
//​			int [] n = {0,1,2,3,4,5};
//			3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
//			char [] s = {'일', '월', '화', '수', '목', '금', '토'};​
//			4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
//			boolean [] bool = new boolean [4];
//			bool[0] = true;
//			bool[1] = false;
//			bool[2] = false;
//			bool[3] = true;

		//3. 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오
//		char[] alpha = {'a', 'b', 'c', 'd'};
//			for (int i = 0; i < alpha.length; i++) {
//				System.out.println(alpha[i]);
//			}
		//4. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
//		Scanner scan = new Scanner(System.in);
//		int[] num = new int[10];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = scan.nextInt();
//			if(num[i]%3 ==0) {
//				System.out.println(num[i]);
//			}
//		}
		//5. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 
//		int[] num = new int[10];
//		int total=0;
//		for (int i = 0; i < num.length; i++) {
//			 num[i]= (int)(Math.random()*10)+1 ;	
//			 total+=num[i];
//		}
//		System.out.println("평균"+(double)(total/num.length));
		
		//6.  최대값,최소값을 출력하는 프로그램을 작성하시오
//		int[] num = { 94, 85, 95, 88, 90 };
//		int max =0,min=num[0];
//		for (int i = 0; i < num.length; i++) {
//				if(max<num[i]) {
//					max =num[i];
//				}else if(min>num[i]) {
//					min =num[i];
//				}
//			}
//		System.out.println("최대값"+max+"최소값"+min);
		
		//8. arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자.
//			int arr[ ]= {10,20,30,50,3,60,-3};		
//			System.out.println(arr[1]);8
		//9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
//			int arr[ ]= {10,20,30,50,3,60,-3};	
//			for (int i = 0; i < arr.length; i++) {
//				if(arr[i] == 60) {
//					System.out.println(i);
//					break;
//				}
//			}
		//10
	}

}
