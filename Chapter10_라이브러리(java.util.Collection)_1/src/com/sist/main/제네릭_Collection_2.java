package com.sist.main;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 제네릭 / 어노테이션 / 열거형 / 리플렉션 
 * 			------------------------------ JSP (웹)
 * */
@Data
@AllArgsConstructor // 매개변수있는 생성자
@NoArgsConstructor // 기본 생성자 
class Member{
	private int mno;
	private String name;
	private String sex;
	private String address;
	private String phone;
}
public class 제네릭_Collection_2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		// ArrayList안에 문자열만 저장 
		strList.add("홍길동");
		strList.add("박문수");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));	
		}
		
		ArrayList<Member> memList = new ArrayList<Member>();
		// 사용자가 정의한 클래스의 ArrayList
		memList.add(new Member(1, "홍길동", "남자", "서울", "010-11111-1111"));
		memList.add(new Member(2, "박문수", "남자", "경기도", "010-2222-1111"));
		memList.add(new Member(3, "강감찬", "남자", "부산", "010-33333-1111"));
		memList.add(new Member(4, "심청이", "여자", "제주도", "010-44444-1111"));
		System.out.println("현재인원"+memList.size());
		for (int i = 0; i < memList.size(); i++) {
			System.out.println(memList.get(i).getMno()+"이름"+memList.get(i).getName()+"성별"+memList.get(i).getSex());
			
		}
		System.out.println("서울사람만 출력");
		for (Member m : memList) {
			if(m.getAddress().equals("서울")) {
				System.out.println(m.getName());
			}
		}

	}

}
