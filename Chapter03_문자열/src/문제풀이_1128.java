import java.util.Scanner;

public class 문제풀이_1128 {

	public static void main(String[] args) {
		// 1.대소문자가 있는 문자열을 입력 받아서 대문자는 소문자로 소문자는 대문자 변경
			Scanner scan = new Scanner(System.in);
			
			String msg = scan.next();
			String change="";
			for(int i=0; i<msg.length();i++) {
				char c = msg.charAt(i);
				if(c >='A' && c<='Z') {
					change+=Character.toLowerCase(c);
				}else if(c >='a' && c<='z') {
					change+=Character.toUpperCase(c);
				}
			}
			System.out.println("변경 후 "+change);
		//2.문자열을 입력받아서 역순으로 출력하는 프로그램 
//		Scanner scan = new Scanner(System.in);	
		String str = scan.next();
		int num = str.length()-1;
		
		for(int i=num; i>=0; i--){
			System.out.print(str.charAt(i));
		};
	}

}
