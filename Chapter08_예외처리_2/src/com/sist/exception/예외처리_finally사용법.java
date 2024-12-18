package com.sist.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class 예외처리_finally사용법 {

	public static void main(String[] args) {
		FileReader fr =null; // 메모리 주소를 가지고 있지 않는상태
		try {
			fr = new FileReader("C:\\javaDev\\movie.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e2) {
				
			}
		}
	}

}
