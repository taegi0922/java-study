/*
 * 	국어,영어,수학 => 입력 .. 총점 / 평균 / 학점
 * */

import java.util.Scanner;

public class 자바제어문_단일조건문3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수 입력:");
		int kor = scan.nextInt();
		System.out.println("영어점수 입력:");
		int eng = scan.nextInt();
		System.out.println("수학점수 입력:");
		int math = scan.nextInt();
		int total = kor+eng+math;
		double avg =total/3.0;
		System.out.println("총점: "+total);
		System.out.printf("평균:%.2f\n ",avg);
		
		// 학점 
		char score ='A';
		int temp = total/3;
		if(temp >=90 && temp<=100) {
			score='A';
		}
		if(temp >=80 && temp<90) {
			score='B';
		}
		if(temp >=70 && temp<80) {
			score='C';
		}
		if(temp >=60 && temp<70) {
			score='D';
		}
		if (temp<60) {
			score='F';
		}
		System.out.println("학점"+score);
	}

}
