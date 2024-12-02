import java.util.Scanner;

public class 배열응용_1 {

	public static void main(String[] args) {
		/*	3명의학생
		 * 	=> 국오 / 영어 / 수학점수를 입력을 받아서
		 * => 총점 /평균 /학점 /등수를 출력하라
		 * */
		Scanner scan = new Scanner(System.in);
		int [] kor = new int[3];
		int [] eng = new int[3];
		int [] math = new int[3];
		
		int [] total = new int[3];
		double [] avg =new double[3];
		char [] score = new char[3];
		int [] rank = new int[3];
		
		for (int i = 0; i <3; i++) {
			System.out.println(1+i+"번쨰학생 국어 입력");
			kor[i]= scan.nextInt();
			System.out.println(1+i+"번쨰학생 영어 입력");
			eng[i]= scan.nextInt();
			System.out.println(1+i+"번쨰학생 수학 입력");
			math[i]= scan.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			
			avg[i] = total[i]/3.0;
		}
		
		// 출력 
		for (int i = 0; i < kor.length; i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",kor[i],eng[i],math[i],total[i],avg[i]);
		}
		// -5d% ==> 왼쪽 정렬 => 공백을 출력 =>3자리
		// JDK 1.5이상에서만 사용이 가능 => 
	}

}
