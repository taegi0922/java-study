import java.util.Arrays;
import java.util.Scanner;

public class 문제풀이_1129 {

	public static void main(String[] args) {
		
		
		//1.5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
//		int [] stu = new int[5];
//		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < stu.length; i++) {
//			System.out.println("점수입력");
//			stu[i]=scan.nextInt();
//		}
//		Arrays.sort(stu);
//		int num = 1;
//		for (int i = stu.length-1; i >0; i--) {
//			System.out.println(num+"등은 "+stu[i]+"점");
//			num++;
//		}
		
		
		//2.10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성
//		int []num = new int[10]; 
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(int)((Math.random()*100)+1);
//			System.out.println(num[i]);
//		}
//		int max=0 ,min = num[0];
//		for (int i = 0; i < num.length; i++) {
//			if(max < num[i]) {
//				max = num[i];
//			}else if(min >num[i]) {
//				min = num[i];
//			}	
//		}
//		System.out.println("최대값 "+max+"최소값 "+min);
		
		//3.100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
		
		
		//4.10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
//		int [] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//				arr[i] =(int)((Math.random()*100)+1);	
//				System.out.println(arr[i]);
//		}
//		System.out.println(arr[1]);
		
		//5.위 문제 배열 중에서 최대값의 인덱스를 출력하시오.
//		int max=0;
//		for (int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if(max == arr[i]) {
//				System.out.println("최대값의 인덱스"+i);;
//			}
//		}
		
		// 6. 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.
//		int [] arr = new int[10];
//		int total =0;
//		double avg = 0;
//		for (int i = 0; i < arr.length; i++) {
//				arr[i] =(int)((Math.random()*100)+1);	
//				System.out.println(arr[i]);
//		}
//		for (int i = 0; i < arr.length; i++) {
//			total+=arr[i];
//	}
//		avg=(double)(total/arr.length);
//		System.out.println("총합 "+total+"평균 "+avg);
		
		//7.10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
//		int [] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//		arr[i] =(int)((Math.random()*100)+1);	
//		}
//		for (int i = 0; i < arr.length; i++) {
//				if(i != 3) {
//					System.out.println(arr[i]);
//				}
//			
//		}
		
		//8.5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오
		
		
		//9. char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
//		char [] c = new char[26];
//		int n = 0;
//		for (int i = 65; i <= 90; i++) {
//			c[n] = (char)(i);
//			System.out.print(c[n]);
//			n++;
//		}
		//10.위문제를 역순으로 출력하시오
//		char [] c = new char[26];
//		int n = 0;
//		for (int i = 90; i >= 65; i--) {
//			c[n] = (char)(i);
//			System.out.print(c[n]);
//			n++;
//		}
		
		//11.정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하시오
//		Scanner scan = new Scanner(System.in);
//		int num [] = new int[10];
//		for (int i = 0; i < num.length; i++) {
//			System.out.print("10번 정수입력");
//			num[i]= scan.nextInt();
//		}
//		for (int i = 0; i < num.length; i++) {
//			if(num[i]%3 ==0) {
//				System.out.print("3의배수"+num[i]);
//			}
//		
//		}
		
		//12.10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오
//		Scanner scan = new Scanner(System.in);
//		int num [] = new int[10];
//		for (int i = 0; i < num.length; i++) {
//			System.out.print("10번 정수입력");
//			num[i]= scan.nextInt();
//		}
//		int smax =0,hmax=0;
//		for (int i = 0; i < num.length; i++) {
//		if(num[i]%2 ==0) {
//			if(smax < num[i]) {
//				smax = num[i];
//			}
//		}else {
//			if(hmax < num[i]) {
//				hmax = num[i];
//			}
//		}
//	}
//		System.out.println("짝수최대값"+smax+"홀수최대값"+hmax);
		
		//13. 3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 총점,평균,등수를 구하고 국어점수 총점,영어점수 총점,수학점수의 총점을 
		//구해서 출력하는 프로그램을 작성하시오
	
		
}
}