package com.sist.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * 	멜론 / 지니뮤직
 * 	-------------- 따라 저장 
 * 		=> JOIN => 교집합
 * 		=> UNION => 합집합
 * 		=> MINUS => 차집합
 *  ----------------------
 *  
 *  컬렉션 : 배열의 단점을 보완 
 *  		고정 => 가변 
 *  	=> 모든 개발자가 동일한 메소드를 이용 => 표준화
 *  	=> 가독성 / 처리 기능이 편리하다 
 *  ----------
 *  List : ArrayList / Vector / LinkedList 
 *  	=> 순서가 가지고있다(인덱스)
 *  	=> 데이터의 중복을 허용 
 *  Set : HashSet / TreeSet
 *  	=> 순서가 없다 
 *  	=> 데이터 중복을 허용하지 않는다 
 *  	=> 중복제거 
 * 	Map : HashMap / HashTable 
 * 		=> 두개를 동시에 저장
 * 			(키,값)
 * 		=> 키는 중복할 수 없다 / 값을 중복이 가능 
 * 		=> 웹 => 클래스 관리자 
 * 		=> HttpServeltRequest
 * 		   HttpServeltResponse
 * 		   HttpSession
 * 		   Cookie
 * 		  --------------------- Map
 *  		=> 스프링 / MyBaties 
 *  
 *  	ArrayList
 *  		=> 복사
 *  		 addAll() 
 *  		=> 순차적으로 출력하는 방법 
 *  			iterator() 
 *  			listIterator
 *  			=> 출력이 어려운 경우
 *  		=> Set <=> 복사가 가능
 *  
 *  	==>	 ArrayList 
 *  		단순한 목록형 데이터를 관리하기 용이 
 *  	    ------------------- 데이터베이스(오라클)
 *  		| 추가 / 삭제 / 수정 
 *  		  ------------------
 *  			=> LinkedList
 * */
public class ArrayList_정리 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("박문수");
		list.add("심청이");
		list.add("강감찬");
		list.add("홍길동");
		list.add("심청이");
		list.add("홍길동");
		// 중복된 데이터 첨부가 가능 
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("=======복사==========");
		ArrayList<String> list2 =new ArrayList<String>();
		list2.addAll(list);
		for (String name : list2) {
			System.out.println(name);
		}
		System.out.println("===========set===========");
		Set set =new HashSet();
		list2.addAll(set);
		// 중복을 허용하지 않는다 => 순차적 관리하기 어렵다
		// Set(중복제거) => ArrayList로 이덩 
		for (String name : list2) {
			System.out.println(name);
		}
	}

}
