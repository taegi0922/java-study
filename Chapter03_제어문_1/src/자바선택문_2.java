/*
 * 3,4,5 => 봄
 * 6,7,8 => 여름
 * 9,10,11 => 가을
 * 12,1,2 => 겨울 
 * => 난수 처리
 * */
public class 자바선택문_2 {

	public static void main(String[] args) {
		int num =(int)((Math.random()*12)+1);
		switch (num) {
		case 12,1,2: 
			System.out.println(num+"은 겨울");
			break;
		
		case 6,7,8: 
			System.out.println(num+"은 여름");
			break;
		
		case 9,10,11: 
			System.out.println(num+"은 가을");
			break;
		
		case 3,4,5: {
			System.out.println(num+"은 봄");
			break;
		}
		
		default:
			System.out.println("~~~");
		}

	}

}
