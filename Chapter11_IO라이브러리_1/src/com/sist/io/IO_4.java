package com.sist.io;
import java.io.*;
// 폴더 / 파일 / (폴더 / 파일 존재 여부 확인) => 삭제
public class IO_4 {
	public static void main(String[] args) {
		File file = new File("c:\\java_data\\sawon.txt");
//		if(!dir.exists()) {
//			dir.mkdir();   // 폴더 생성
//		}else {
//			System.out.println("이미 존재하는 폴더");
//		}
		
		if(!file.exists()) { 
			try {
				file.createNewFile(); // 파일 생성
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("이미 존재하는 폴더");
		}
		System.out.println("프로그램종료");
	}

}
