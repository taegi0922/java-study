import java.util.Scanner;

public class 문자열_3 {
	public static void main(String[] args) {
		// 사용자가 입력한 값을 받아서 =>a A가 몇개인지 확인
//		Scanner scan = new Scanner(System.in);
//		String str =scan.nextLine();
//		int num=0;
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == 'A') {
//				num++;
//			}
//		}
//		System.out.println(num);
		
		// 사용자의 문자열 입력을 받아서 좌우 대칭 여부 확인
		Scanner scan = new Scanner(System.in);
		String str =scan.nextLine();
		// ==> 짝수인지 홀수인지가 중요 
		boolean bCheck = true;
		int j= str.length()-1;
		for (int i = 0; i < str.length()/2; i++) {
			char s = str.charAt(i);
			char e =str.charAt(j);
//			System.out.println(s+" "+e);
			if(s != e) {
				bCheck = false;
				break;
			}
			j--;
		}
		System.out.println("결과");
		if(bCheck == true) {
			System.out.println(str+"는 좌우대칭");
		}else {
			System.out.println(str+"는 좌우대칭 아님");
		}
	}

}
