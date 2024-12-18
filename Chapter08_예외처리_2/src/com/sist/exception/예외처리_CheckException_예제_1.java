package com.sist.exception;

import java.util.Arrays;

public class 예외처리_CheckException_예제_1 {

	public static void main(String[] args) {
		
		try {
			int[] lotto = new int[6];
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
				for (int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			
			// 정렬
			Arrays.sort(lotto);
			
			for (int i : lotto) {
				Thread.sleep(1000); // sleep을 쓸라면 무조건 예외처리를 해야된다
				System.out.print(i+" ");
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		} finally {
			System.out.println("포로그램 종료");
		}

	}

}
