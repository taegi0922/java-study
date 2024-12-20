package com.sist.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 	날짜 관련
 * 	--------
 * 	Date => 기능이 없다
 * 			현재 시스템의 날짜와 시간을 읽어 온다 
 * 			-----------
 * 			오라클과 호환
 * 			java.util.Date(******)
 * 			java.sql.date
 * 	Calendar => Date에 해당 기능을 추가
 * 				Date를 확장 => 제어가 간단하다
 * 				------------------------------
 * 					메소드 기능이 좋다 
 * 		년도
 * 		yyyy/ yy
 * 		월
 * 		MM / M 
 * 		일
 * 		dd / d
 * 	   시간
 * 		hh/h
 * 		분
 * 		mm/m 
 * 
 * 
 * */
public class 라이브러리_3 {

	public static void main(String[] args) {
		while(true) {
			Date date =new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println(sdf.format(date));
		}
		
	}

}
