import java.util.Iterator;
import java.util.Scanner;

public class 문제풀이_1125 {

	public static void main(String[] args) {
		// 1)	100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면
		//D, 60점 이하면 F를 출력하라 (switch~case 사용)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수입력");
//		int num = scan.nextInt();
//		num = num/10;
//		switch (num) {
//		case 9,10: 
//			System.out.println("A등급입니다");
//			break;
//		case 8: 
//			System.out.println("B등급입니다");
//			break;
//		case 7: 
//			System.out.println("C등급입니다");
//			break;
//		case 6: 
//			System.out.println("D등급입니다");
//			break;
//		default:
//			System.out.println("F등급입니다");
//		}
		
		//2)	 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 (switch~case 사용) 
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수입력");
//		int num1 = scan.nextInt();
//		System.out.println("정수입력");
//		int num2 = scan.nextInt();
//		System.out.println("연산자(+,-,*,/)를 입력");
//		char c = scan.next().charAt(0);
//		switch (c) {
//		case '+': 
//			System.out.println("더하기"+(num1+num2));
//			break;
//		case '-': 
//			System.out.println("빼기"+(num1-num2));
//			break;
//		case '*': 
//			System.out.println("곱하기"+(num1*num2));
//			break;
//		case '/':
//			if(num1 ==0 || num2 ==0) {
//				System.out.println("0으로 나눌수없음");
//			}else {
//				System.out.println("나누기"+(num1/num2));
//			}
//			break;
//		default:
//			System.out.println("잘못입력");
//		}
		
//		3)	 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
//		int total =0;
//		for (int i = 1; i <=100; i++) {
//			if(i%2 ==0) {
//				total+=i;
//			}
//		}
//		System.out.println("총합"+total);
		
//		4)	 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 
//		for(int i=5;i<=50;i++) {
//			if(i%5 == 0) {
//				System.out.print(i+" ");
//			}
//		}
		
		//5)B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
//		for(char i=66;i<=78;i++){
//			if(i%2 ==0) {
//				 System.out.print(i+" ");
//			}
//		}
		
		//6)한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수입력");
//		int num =scan.nextInt();
//		int total=0;
//		for(int i =1;i<=num;i++) {
//			total+=i;
//		}
//		System.out.println("입력받은 총합"+total);
		
		//7)1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
//		for(int i=1;i<=30;i++) {
//			if(i%2 ==0) {
//				System.out.print(i+" ");
//				if(i%3 ==0) {
//					System.out.println();
//				}
//			}
//		}
		
		//8)	 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
//		int total =0;
//		for(int i=1;i<=10;i++) {
//			if(i%2 ==0) {
//				total-=i;
//			}else {
//				total+=i;
//			}
//		}
//		System.out.println(total);
		
		//9)	 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 
//		for (int i = 1; i <= 10; i++) {
//			if(i%3 !=0) {
//				System.out.println(i);
//			}
//		}
		
	}
}
