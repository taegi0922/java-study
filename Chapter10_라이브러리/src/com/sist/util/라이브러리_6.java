package com.sist.util;

import java.util.Calendar;

public class 라이브러리_6 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		// 오늘 날짜 읽기 
		System.out.println("년도"+today.get(Calendar.YEAR));
		System.out.println("월"+(today.get(Calendar.MONTH)+1));
		// MONTH => 0 => 저장:-1,읽기+1;
		System.out.println("일"+today.get(Calendar.DATE));
		
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		System.out.println(strWeek[today.get(Calendar.DAY_OF_WEEK)]+"요일"); // 6
		
		System.out.println("시간"+today.get(Calendar.HOUR));
		System.out.println("분"+today.get(Calendar.MINUTE));
		System.out.println("초"+today.get(Calendar.SECOND));
		
		System.out.println("마지막날짜"+today.getActualMaximum(Calendar.DATE));

	}

}
