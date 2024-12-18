package com.sist.music;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 * 	1.파일 => IO
 * 	2.URL => URL주소
 * 	3.SQL => 네트워크
 * 	------------------------ CheckException
 * 							 --------------
 * 							  컴파일시에 예외처리 
 * 
 * */

public class MusicSystem {
	private String[] url = {"",
							"https://www.genie.co.kr/chart/top200",
							"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0100",
							"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0200",
							"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0300",
							"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0107",
							"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0500",
							"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0600"
							};
	
	public MusicVO[] musicData(int type) throws IOException {
		MusicVO[] music = new MusicVO[50];
		Document doc = Jsoup.connect(url[type]).get();
		// CheckException => 반드시 예외처리를 해야 할수 있ㄷ ㅏ
		try {
			// 사이트의 HTML을 읽어온다 
			
			// 필요한 값 => HTML(태그)<> => 자바 : Element 
			Elements title =doc.select("table.list-wrap td.info a.title");
			Elements singer =doc.select("table.list-wrap td.info a.artist");
			Elements album =doc.select("table.list-wrap td.info a.albumtitle");
			for (int i = 0; i < 50; i++) {
				music[i] = new MusicVO();
				music[i].setTitle(title.get(i).text());
				music[i].setSingle(singer.get(i).text());
				music[i].setAlbum(album.get(i).text());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return music;
	}
}
