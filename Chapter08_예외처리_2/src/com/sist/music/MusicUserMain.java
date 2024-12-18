package com.sist.music;

import java.io.IOException;
import java.util.Scanner;

public class MusicUserMain {

	public static void main(String[] args) throws IOException {
		MusicSystem ms = new MusicSystem();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("====================장르별 메뉴======================");
			System.out.println("1.TOP 50");
			System.out.println("2. 가요");
			System.out.println("3. POP");
			System.out.println("4. OST");
			System.out.println("5. 트롯");
			System.out.println("6. JAZZ");
			System.out.println("7. CLASSIC");
			System.out.println("8. 종료");
			System.out.println("=====================================================");
			System.out.println("메뉴선택>>");
			int menu = scan.nextInt();
			if(menu == 8) {
				System.out.println("프로그램 종료");
				break;
			}
			MusicVO[] music = ms.musicData(menu);
			
			//화면 출력
			int i=1;
			for (MusicVO vo : music) {
				System.out.println(i+"."+vo.getTitle());
				i++;
			}
		}

	}

}
