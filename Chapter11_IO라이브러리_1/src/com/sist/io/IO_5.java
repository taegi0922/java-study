package com.sist.io;
// 삭제 => delete
/*
 * 	1.파일 읽기 
 * 		new File("경로명\\파일명");
 * 2.폴더 읽기 
 * 		new File("경로명\\폴더명");
 * 3.주요메소드
 * 		getName() : 파일명
 * 		getPath(): 경로명~파일명
 * 		length(): 파일 크기 
 * 
 * 		listFiles(): 폴더의 파일 목록
 * 		mkdir(): 폴더 생성
 * 		createNewFile(): 파일 생성
 * 		delete(): 삭제
 * 		exists(): 존재여부 확인 
 * 
 * */
import java.io.File;

public class IO_5 {

	public static void main(String[] args) {
		File dir = new File("c:\\java_data");
		// rm 파일명 => rm -rf 폴더명
		// dir.delete();
		File [] files = dir.listFiles();
		for (File f : files) {
			f.delete(); // 폴더안에 파일이 존재하면 삭제가 안되기 떄문에
						// 파일부터 삭제해줘야된다
		}
		dir.delete();
		System.out.println("삭제 완료");
	}

}
