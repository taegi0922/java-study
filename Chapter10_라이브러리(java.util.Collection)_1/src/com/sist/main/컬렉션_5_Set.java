package com.sist.main;

import java.util.HashSet;

public class 컬렉션_5_Set {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); // 일반 클래스 
		set.add("red");
		set.add("blue");
		set.add("green");
		set.add("yellow");
		set.add("pink");
		set.add("red");
		set.add("blue");
		set.add("green");
		set.add("yellow");
		set.add("pink");
		set.add("red");
		set.add("blue");
		set.add("green");
		set.add("yellow");
		set.add("pink");
		// 실제 저장은 5개만 저장됨 
		System.out.println("저장갯수"+set.size());
		// 저장된 데이터 출력
		for (String obj : set) {
			System.out.println(obj);
		}
		System.out.println("========삭제===========");
		set.remove("yellow");
		System.out.println("저장갯수"+set.size());
		for (String obj : set) {
			System.out.println(obj);
		}
		System.out.println("========전체 삭제===========");
		set.clear();
		System.out.println("저장갯수"+set.size());
		if(set.isEmpty()) {
			System.out.println("데이터 x");
		}else {
			System.out.println("데이터 있음");
		}
	}

}
