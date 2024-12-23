package com.sist.main;
// 제네릭 => Collelaction 전체 사용이 가능 
// List / Set / Map
/*
 * 	List<String> => ArrayList,LinkedList,Vector 
 *  Set<String>  => HashSet / TreeSet
 *  Map<String>  => HashMap / HashTable 
 *  			    -------   ---------
 *  				비동기		 동기
 *  				  | 		   |
 *  				속도 		 안전성 => 데들락 
 * */
import java.util.*;
public class 컬렉션_6_Set_2 {

	public static void main(String[] args) {
		TreeSet<Integer> set =new TreeSet<Integer>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			set.add(r.nextInt(101));
		}
		
		//출력
		for (int score : set) {
			System.out.print(score+" ");
		}
		
		System.out.println();
		System.out.println("======60점 이하======");
		System.out.println(set.headSet(60));
		System.out.println("======60점 이상======");
		System.out.println(set.tailSet(60));

	}

}
