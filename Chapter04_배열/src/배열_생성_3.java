/*
 * // 중복없는 난수 => 3개 발생(1~9)
	-------------------------------
	사용자 입력 
	3자리 입력=> 맞추는 프로그램: 숫자 야구 게임 
	힌트 
	 369
	 123 => 0s -1b 
 * */

import java.util.Scanner;

public class 배열_생성_3 {
	public static void main(String[] args) {
		int arr [] = new int[3];
		
		for(int i=0;i<arr.length;i++) { // 난수 3개 설정
			 arr[i] =(int)(Math.random()*9)+1; 
			 for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--; 
					break; 
				}
			}
			 
		}
		
		Scanner scan = new Scanner(System.in);
		int[] user = new int[3];
		while(true) {
			System.out.println("3자리 숫자입력");
			int input =scan.nextInt();
			
			if( input < 100 || input > 999) { // 사용자가 막 입력할수있는거 방지 
				System.out.println("잘못된 입력입니다");
				continue;
			}
			user[0] = input /100; // 첫번쨰 자리
			user[1] = (input%100)/10; // 두번쨰 
			user[2] = input%10; // 세번쨰 
			
			if(user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) { // 숫자 3개 중복 방지
				System.out.println("중복안됨");
				continue;
			}
			if(user[0] == 0  || user[1] == 0  || user[2] == 0) { // 숫자 0 이하 방지
				System.out.println("0은 사용할수 없음");
				continue;
			}
			
			//힌트
			int s=0,b=0;
			for(int i=0;i<3;i++) { // arr
				for (int j = 0; j < 3; j++) { // user
						if(arr[i] == user[j]) {
							if(i ==j) { 
								s++;
							}else {
								b++;
							}
						}
					
				}
			}
			System.out.printf("Number: %d,Result: %dS-%dB\n",input,s,b);
			
			if(s == 3) {
				System.out.println("정답!!");
				break;
			}
		}
		
	
	}

}
