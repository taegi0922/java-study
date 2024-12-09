
//3명의 학생 국어/영어/수학 => 총점,평균,학점
// new 3번 => 메모리 공간이 다르다

import java.util.Scanner;

class Student{
	String name;
	int kor,eng,math;
	int total;
	double avg;
	char score;
}

public class 클래스_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[3];
		// 초기화 
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student(); // 학생이 가지고 있는 데이터 
			System.out.println((i+1)+"번쨰의 국어 입력:");
			std[i].kor = scan.nextInt();
			
			System.out.println((i+1)+"번쨰의 영어 입력:");
			std[i].eng = scan.nextInt();
			
			System.out.println((i+1)+"번쨰의 수학 입력:");
			std[i].math = scan.nextInt();
			
			std[i].total= std[i].kor+std[i].eng+std[i].math;
			
			std[i].avg= std[i].total/3.0;
			
			switch (std[i].total/30) {
			case 10,9: 
				std[i].score='A';
				break;
			case 8: 
				std[i].score='B';
				break;
			case 7: 
				std[i].score='C';
				break;
			case 6: 
				std[i].score='D';
				break;	
			default:
				std[i].score='F';
			}
		}
		for (int i = 0; i < std.length; i++) {
			System.out.printf("-5d%-5d%-5d%-7d%-7.2f\n",std[i].kor,std[i].eng,std[i].math,std[i].total,std[i].avg);
		}
		
		
	}

}
