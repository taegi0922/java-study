
public class 자바제어문_단일조건문4 {
//60점이상이면 합격 /불합격
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		System.out.println(score);
		if(score >=60) {
			System.out.println("합격");
		}
		if(score < 60) {
			System.out.println("불합격");
		}
		
		System.out.println(score >=60 ? "합격" : "불합격");
	}

}
