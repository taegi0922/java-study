
public class 반복문_7 {

	public static void main(String[] args) {
		// 10개의 정수를 추출해서 최소값 , 최대값을 구하는 프로그램 
		int min =100 ,max =1;
		for(int i=1;i<=10;i++) {
			int num =(int)(Math.random()*100)+1;
			System.out.println(num);
			if(min>num) {
				min =num;
			}
			if(max<num) {
				max =num;
			}
		}
		System.out.println("최대값 "+max);
		System.out.println("최소값 "+min);
	}

}
