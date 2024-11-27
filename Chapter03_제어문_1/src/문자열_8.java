/*
 *  = toUpperCase: 대문자 변환
 *  = toLowerCase: 소문자 변환
 *  = replace() : 지정된 데이터 변경
 *  = replaceAll() : 전체를 변경 ====> 정규식
 * 
 * 함수 : function
 * 메소드 : method
 * =================== 기능상으로는 동일 
 * */
public class 문자열_8 {

	public static void main(String[] args) {
//			String name="Hong Gil Dong";
//			System.out.println(name.toLowerCase());
			String data ="hello java";
			System.out.println(data.replace('a', 'k')); // a를 k로 변경
			System.out.println(data.replace("Java","Oracle")); 
		
	}

}
