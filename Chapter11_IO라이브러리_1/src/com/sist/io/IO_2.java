package com.sist.io;

import java.io.File;

public class IO_2 {

	public static void main(String[] args) {
		// 폴더 생성 
		File dir = new File("c:\\javaDev");
		// => 어떤 파일 / 어떤 파일 있는 지 확인
		// => listFiles
		File[] list = dir.listFiles();
		for (File f : list) {
			if(f.isFile()) {
				System.out.println(f.getName()+" "+f.length()+"bytes");
			}else if(f.isDirectory()) {
				System.out.println(f.getName()+"<DIR>"+f.length()+"bytes");
			}
		}

	}

}
