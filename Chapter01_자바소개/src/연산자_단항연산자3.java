/*
 * 	형변환연산자 
 * 	============ long => int,char => int,byte => int , int => double , double => int
 * 	숫자/문자(정수인식) => boolean 은 제외 
 * 
 *                데이터형의 크기
 * 			<======           =======>
 * 		DownCasting				UpCasting
 * 	:데이터형을 작게			:데이터형을 크게 
 * 		=> 강제						=> 자동 
 * 	byte < short,char < int < long < float < double 
 * 
 *  	int 이하 데이터형(byte,char,short)은
 *  		byte + byte 
 * 			100 + 50 => 150 => int
 * 			char + char = int
 * 			char + short +char = int
 * 			double + float = double 
 * 
 *   	강제 형변환 연산자 
 *   	int c = (int)(10.5+20.5);
 *   
 *   	=> 연산자 =>() 최우선순위 연산자 
 * */
public class 연산자_단항연산자3 {

	public static void main(String[] args) {
		int a =10;
		double d = a;
		System.out.println(d); // double 
		
		byte b1 =100;
		byte b2 =25;
		int b3 = b1+b2;
		
		int h =123456;
		float g = 123456.78f;
		int res = (int)((g-h)*100);
		System.out.println(res); // 78
		// 최대한 같은 크기를 맞춰줘야 한다.
//		int h =123456;
//		double g = 123456.78;
//		int res = (int)((g-h)*100);
//		System.out.println(res); // 77

	
		


	}

}
