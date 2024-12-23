package com.sist.main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
@AllArgsConstructor //생성자 
@NoArgsConstructor // 기본 생성자 
@Data
class Student{
	private int hakbun;
	private String name;
	private int kor,eng,math;
}
public class 컬렉션_3_ArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 배열 고정 => 가변형 
		// 추가시마다 자동으로 메모리가 늘어난다 
		list.add(new Student(1, "홍길동", 90, 80, 70));
		list.add(new Student(2, "강감산", 60, 50, 40));
		list.add(new Student(3, "이순신", 92, 82, 72));
		list.add(new Student(4, "심청이", 96, 86, 76));
		
		System.out.println("학생인원"+list.size());
		for (Object std : list) {
			Student s=(Student)std;
			System.out.println(s.getHakbun()+" "+s.getEng()+" "+s.getKor()+" "+s.getKor());
		}
	}

}
