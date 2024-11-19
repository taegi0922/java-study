// 데이터 저장 ==> 데이터 가공 
// 					사용자 요청에 따라 변경 => 연산처리 

/*
 * int a =10;
 * ++a; 전치연산자
 * a++ 후치연산자 
 * ---------------
 * int a=10;
 * int b= a++;
 * 
 * 1. b=a;
 * 2. a++;
 * 
 * a=? 11
 * b=? 10 
 * -----------------
 * int a=10;
 * int b = a++ + ++a + ++a + a++;
 * 		   10	 12    13     13
 * */
public class 변수_5 {
	public static void main(String[] args) {
		char a ='A';
		System.out.println(++a);

	}

}
