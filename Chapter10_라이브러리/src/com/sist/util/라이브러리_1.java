package com.sist.util;

import java.util.StringTokenizer;

public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String data= "현빈 , 박정민 ,  조우진 ,  전여빈 ,  박훈 ,  유재명 ,  릴리 프랭키 , 이동욱";
//		StringTokenizer st = new StringTokenizer(data,","); // , 기준으로 짜르기 
//		System.out.println("출연 총인원:"+st.countTokens());
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken().trim());
//		}
		
		String make="그릭요거트 4 큰 술, 땅콩버터 1 큰 술을 고르게 섞어 줍니다.^https://recipe1.ezmember.co.kr/cache/recipe/2024/12/05/c608f60aeb98bbd3116a764c0dde400e1_m.jpg";
		StringTokenizer st = new StringTokenizer(make,"^");
		System.out.println("레시피 제작법:"+st.nextToken());
		System.out.println("레시피 이미지:"+st.nextToken());
		/*
		 * 1.클라이언트 => 서버로 데이터 전송
		 * 	100|admin|홍길동|남자 
		 * 	switch(protocol){
		 * 		case 100:
		 * 			로그인 한다
		 * 		}
		 * */
	}

}
