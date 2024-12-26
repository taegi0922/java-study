package com.sist.io;
import java.io.*;
import java.util.*;
import java.text.*;
public class Io_1 {
	public static void main(String[] args) {
		// => 파일 생성 => CheckException이 아니다 
		File file = new File("c:\\javaDev\\movie.txt");
		System.out.println("파일명: "+file.getName()); 
		System.out.println("경로명: "+file.getParent());
		System.out.println("경로명+파일명: "+file.getPath());
		System.out.println("파일크기: "+file.length()+"bytes");
		// => byte단위
		System.out.println("읽기전용: "+file.canRead());
		System.out.println("쓰기전용: "+file.canWrite());
		System.out.println("숨김파일: "+file.isHidden());
		System.out.println("파일여부: "+file.isFile());
		// 탐색기 => 다운로드 /업도르 
		System.out.println("최종 수정일: "+ new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date(file.lastModified())));
	}
}
