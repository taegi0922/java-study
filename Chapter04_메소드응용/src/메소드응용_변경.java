// 메소드형 숫자 야구 게임

import java.util.Scanner;

public class 메소드응용_변경 {
	
	static int [] rand() {
		int num [] = new int [3];
		for (int i = 0; i < num.length; i++) {
				num[i] = (int)(Math.random()*9)+1;
				for (int j = 0; j < i; j++) {
					if(num[i] == num[j]) { // 난수 중복 체크
						i--;
						break;
					}
			}
		}
		return num;
	}
	
	static int[] UserInput() {
		Scanner scan = new Scanner(System.in);
		int [] user = new int[3]; //사용자 입력
		while(true) {
			System.out.println("세자리 정수를 입력");
			int input = scan.nextInt();
			
			if(input<100 || input>999) { // 오류철; => 유효성 검사
				System.out.println("세자리 정수만 입력해야됩니다");
				continue;
			}else {
				user[0] = input/100;
				user[1] = ((input/10)%10);
				user[2] = input%10;	
				break;
			}
		}
		return user;
	}
	
	static int compare(int [] com , int [] user){
		int s = 0,b=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(com[i] == user[j]) { // 같은 숫자가 있다면
					if(i == j) { // 같은숫자에 같은 자리 
						s++;
					}else {
						b++; //같은숫자에 다른 자리
					}
				}
			}
		}
		hint(s,b,user);
		return s;
	}
	// 힌트 제공
	static void hint(int s,int b,int [] user) {
		System.out.println("번호 "+user[0]+""+user[1]+""+user[2]+"");
		System.out.println("=============전광판============");
		System.out.print("S: ");
		for(int i=0;i<s;i++) {
			System.out.print("●");
		}
		System.out.println();
		System.out.print("B: ");
		for(int i=0;i<b;i++) {
			System.out.print("○");
		}
		System.out.println();
		System.out.println("==================");
//		System.out.println("결과: "+s+"S"+b+"B");
	}
	// 종료여부 
	static boolean isEnd(int s) {
		boolean bChk = false;
		if(s ==3) {
			bChk = true;
		}
		return bChk;
	}
	
	static void game() {
		Scanner scan = new Scanner(System.in);
		int randNum [] = rand();
		int [] user = new int[3];
		while(true) {
			user =UserInput();
			int s =compare(randNum, user);
			if(isEnd(s)) {
				System.out.println("새게임을 할까요?(y/n)");
				char c = scan.next().charAt(0);
				if(c == 'y'|| c=='Y') {
					System.out.println("------새게임---------");
					game();
				}else {
					System.out.println("game over!!");
					System.exit(0); // 즉시 프로그램 종료 
				}
			}
		}
	}
	public static void main(String[] args) {
		// 중복 없는 난수(3개의 정수)
		game();
		
	
		
	}

}
