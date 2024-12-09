/*
 * 1.클래스 구성요소
 * class ClassName{
 * 	-----------------------
 * 	변수
 * 		1.변수의 종류
 * 			= 인스턴스 변수 (객체변수)
 * 				new이용해서 메모리 따라 저장이 가능하게 만든다
 * 				인스턴스: 메모리에 데디어가 저장된 상태 
 * 				객체 = 인스턴스
 * 			= 공통변수(정적변수)
 * 				모든 객체가 공통으로 사용하는 변수 
 * 				=> 메모리 공간이 한개
 * ------------------------
 * 	생성자
 * -----------------------
 * 	메소드 
 * }
 * 
 * 	=> new : 클래스의 메모리 크기를 확인후에 메모리를 할당 
 * 
 * 	 생성자: 변수의 초기값을 대입 => 메모리에 초기값을 넘겨준다.
 * 	
 * 	class A{
 * 		int aa= 0;	
 * 		double dd;
 * 	}
 * 	A a = new A(); => 메모리 생성 
 * -----------------------------------------------------------------------------------------
 * 	종류				메모리 저장시점		메모리해체시점    저장위치	 사용범위   사용방법
 * 	----------------------------------------------------------------------------------------
 * 	인스턴스 변수	    new이용해서 저장     프로그램 종료     Heap    
 * -----------------------------------------------------------------------------------------
 * 	정적변수(공유 변수)  컴파일시에 자동
 * 						   메모리 할당	   	포로그램 종료    MethodAreaa  
 *						  한개만 생성 							
 * -----------------------------------------------------------------------------------------
 * 	지역변수			메소드 호출시마다    메소드 종료      stack			{}   
 * 						
 * -----------------------------------------------------------------------------------------
 * */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
class Recipe{
	int rno; // 구분자
	String poster;
	String title;
	String chef;
}
class RecipeSite{
	static Recipe[] recipes = new Recipe[40];
	// 사용자 정의 데이터은 일반 데이터형과 사용하는 방법 유사 
	// 시작과 동사에  recipes의 초기화 
	static { // 초기화 블록
		try {
			int i=0;
			Document doc = Jsoup.connect("https://www.10000recipe.com/recipe/list.html").get();
			Elements title =doc.select("ul.common_sp_list_ul div.common_sp_caption_tit");
			Elements chef =doc.select("ul.common_sp_list_ul div.common_sp_caption_rv_name");
			for (int j = 0; j < title.size(); j++) {
				recipes[j] = new Recipe();
				recipes[j].title = title.get(j).text();
				recipes[j].chef = chef.get(j).text();
//				System.out.println(title.get(j).text());
//				System.out.println(chef.get(j).text());
			}
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}
}

public class 클래스_2 {

	public static void  main(String[] args) {
		// 1, recipe 저장
		// 2. 데이터를 저장할 메모리 공간(메모리 할당)
		RecipeSite rs = new RecipeSite();
		System.out.println("=============레시피 목록 ==============");
		for (Recipe r : rs.recipes) {
			System.out.println(r.title);
		}
	}

}
