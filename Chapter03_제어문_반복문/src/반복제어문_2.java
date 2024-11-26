
public class 반복제어문_2 {

	public static void main(String[] args) {
//		for (int i = 1; i <=3; i++) {
//			for (int j = 1; j <=3; j++) {
//				if(j==2) {
//					break;
//				}
//				System.out.println(i+" "+j);
//			}
//		}
		// 이름이 있는 break 
		outer :for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=3; j++) {
				if(j==2) {
					break outer;
				}
				System.out.println(i+" "+j);
			}
		}
		
		
	}
}
