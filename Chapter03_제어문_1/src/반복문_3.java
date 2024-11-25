
public class 반복문_3 {

	public static void main(String[] args) {
		int total = 0;
		int total1= 0;
		int total2= 0;
		for (int i = 1; i < 101; i++) {	
				total+=i;
			if(i%2 ==0) {
				total1+=i;
			}else {
				total2+=i;
			}
		}
		System.out.println("총합: "+total);
		System.out.println("짝수의총합: "+total1);
		System.out.println("홀수의총합: "+total2);

	}

}
