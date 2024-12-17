package com.sist.exception;

import java.util.Scanner;

public class 예외처리_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]arr = new int[2];// 배열범위,0
		try {
			System.out.print("첫번쨰 정수 입력");
			String s1= scan.next();
			System.out.print("두번쨰 정수 입력");
			String s2= scan.next();
			
			arr[0] = Integer.parseInt(s1);
			arr[1] = Integer.parseInt(s2);
			
			int result = arr[0]/arr[1];
			System.out.println("result="+result);
			}catch(Exception e) {
				System.out.println(e.getMessage()); // 에러가 뭔지 메세지로  알려줌 
				e.printStackTrace(); // 에러시 => 에러 위치 확인가능 
			}
		
//		} catch (ArrayIndexOutOfBoundsException ex) { // 배열범위 초과시 
//			System.out.println("배열 범위 초과");
//		} catch(ArithmeticException e) {  // 0을 입력받을시 
//			System.out.println("0으로 나눌수없음");
//		}
		System.out.println("정상 수행");

	}

}
