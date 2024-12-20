package com.sist.util;
import java.util.*;
public class 라이브러리_2 {

	public static void main(String[] args) {
		String color="red|yellow|green|pink|magenta|blue|cyan";
		StringTokenizer st = new StringTokenizer(color,"|");
		String[] colors = color.split("\\|");
		System.out.println("컬러갯수:"+st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
