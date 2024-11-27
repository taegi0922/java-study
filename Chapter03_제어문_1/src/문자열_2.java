// contains : 포함된 문자열 => web데이터 읽기 => 크롤링 
// startsWith : 시작되는 문자 예) 입력: 그대  결과 : 그대만 있다면 , 그대가 있는곳 ....
// endsWith : 끝나는 문자 예) 입력: 까 결과: 다시 만날 수있을까,잠깐 시간 될까...
// Thread.sleep(2000);  : 시간 간격주고 결과 보여주기 
// Jsoup => 크롤링 할때 쓰는 라이브러리 
// => 데이터가 필요 => 데이터를 읽어온다 => 자바 기능 ...
// => 다음 => 데이터를 모아서 처리 => 배열 

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 문자열_2 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd = scan.next();
		
		int k=1;
		for (int i = 1; i <=4; i++) {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20241127&hh=11&rtm=Y&pg="+i).get();
			// 곡 명 읽기 
			Elements title =doc.select("table.list-wrap a.title");
			for (int j = 0; j < title.size(); j++) {
//				if(title.get(j).text().startsWith(fd)) {
				if(title.get(j).text().endsWith(fd)) {
				//if(title.get(j).text().contains(fd)) {
					System.out.println((k)+"."+title.get(j).text());
//					Thread.sleep(2000);
					k++;
				}
				
			}
		}
	}

}
