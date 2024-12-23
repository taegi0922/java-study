package com.sist.movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieUserMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MovieSystem ms = new MovieSystem();
		while(true) {
			System.out.println("=============Menu============");
			System.out.println("1. 전체 영화 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 검색(영화명)");
			System.out.println("4. 검색(출연진)");
			System.out.println("5. 검색(장르)");
			System.out.println("6. 프로그램 종료");
			System.out.println("=============================");
			System.out.println(">>>>메뉴선택");
			int menu = scan.nextInt();
			if(menu == 6) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}else if(menu ==1) {
				ArrayList<Movie> list = ms.movieListData();
				for (Movie m : list) {
					System.out.println(m.getMno()+"."+m.getTitle());
				}
			}else if(menu ==2) {
				System.out.println("1~1938까지 번호 입력");
				int mno = scan.nextInt();
				Movie m = ms.movieDetailData(mno);
				System.out.println("===="+m.getTitle()+"상세보기");
				System.out.println("영화명: "+m.getTitle());
				System.out.println("출연: "+m.getActor());
				System.out.println("감독: "+m.getDirector());
				System.out.println("장르: "+m.getGener());
				System.out.println("개봉일: "+m.getRegdate());
				System.out.println("등급: "+m.getGrade());
			}else if(menu ==3) {
				System.out.print("제목 검색 ");
				String title = scan.next();
				ArrayList<Movie> movie = ms.movieFindTitle(title);
				System.out.println("검색결과: "+movie.size()+"건");
				for (Movie m : movie) {
					System.out.println("영화명: "+m.getTitle());
					System.out.println("출연: "+m.getActor());
					System.out.println("감독: "+m.getDirector());
					System.out.println("장르: "+m.getGener());
					System.out.println("개봉일: "+m.getRegdate());
					System.out.println("등급: "+m.getGrade());
				}
			}else if(menu == 4) {
				System.out.println("출연진 검색");
				String actor = scan.next();
				ArrayList<Movie> movie = ms.movieFindActor(actor);
				System.out.println("검색결과: "+movie.size()+"건");
				for (Movie m : movie) {
					System.out.println("영화명: "+m.getTitle());
					System.out.println("출연: "+m.getActor());
					System.out.println("감독: "+m.getDirector());
					System.out.println("장르: "+m.getGener());
					System.out.println("개봉일: "+m.getRegdate());
					System.out.println("등급: "+m.getGrade());
				}
			}else if(menu == 5) {
				System.out.println("장르 검색");
				String gener = scan.next();
				ArrayList<Movie> movie = ms.movieFindGener(gener);
				System.out.println("검색결과: "+movie.size()+"건");
				for (Movie m : movie) {
					System.out.println("영화명: "+m.getTitle());
					System.out.println("출연: "+m.getActor());
					System.out.println("감독: "+m.getDirector());
					System.out.println("장르: "+m.getGener());
					System.out.println("개봉일: "+m.getRegdate());
					System.out.println("등급: "+m.getGrade());
				}
			}
		}
		

	}

}
