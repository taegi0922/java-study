
public class 반복문_8 {

	public static void main(String[] args) {
		//  10개의 알바벳을 추출 => 대문자 몇개 , 소문자 몇개 
		int dcnt= 0, scnt =0;
		for (int i = 1; i <= 10; i++) {
			char c = 'A';
			int no = (int)(Math.random()*2);
			if(no == 0) {
				c = (char)((Math.random()*26)+65); // 65~90 대문자 A~Z
			}else {
				c = (char)((Math.random()*26)+97); //97~122 소문자 a~z
			}
			System.out.println(c+" ");
			
			if(c>='A' && c<='Z') {
				dcnt++;
			}else {
				scnt++;
			}
		}
		System.out.println("소문자 갯수"+scnt);
		System.out.println("대문자 갯수"+dcnt);
	}

}
