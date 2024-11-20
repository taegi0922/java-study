import java.util.Scanner;

public class 연산자_이항연산자_논리연산자 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수 입력");
		int kor = scan.nextInt();
		System.out.println("수학점수 입력");
		int math = scan.nextInt();
		System.out.println("영어점수 입력");
		int eng = scan.nextInt();
		
		if(kor<100 && math <100 && eng <100) {
				int total = kor+math+eng;
				System.out.println(total/3.0);
		}else {
			System.out.println("다시입력");
	}
		
	}

}
