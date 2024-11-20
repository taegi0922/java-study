
public class 연산자_이항연산자_비교연산자 {

	public static void main(String[] args) {
		char a =(char)((Math.random()*26)+65);
		char b =(char)((Math.random()*26)+65);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a <= b);
	}

}
