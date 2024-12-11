
public class SaownUserMain {

	public static void main(String[] args) {
		Saown hong = new Saown(1,"홍길동","개발부","대리","2021-10-10",3600);
		// 초기화 => 생성자 => 변경이 불가능 
		// 나머지 변경 => setter 
		//출력
		System.out.println("====== 홍길동 사원 정보 =========");
		System.out.println("사번: "+hong.getSabun());
		System.out.println("이름: "+hong.getName());
		System.out.println("부서: "+hong.getDept());
		System.out.println("직위: "+hong.getJob());
		System.out.println("입사일: "+hong.getRegdate());
		System.out.println("연봉: "+hong.getPay());
		
		//변경
		hong.setDept("영업부");
		hong.setJob("부장");
		hong.setPay(4200);
		
		//변경 후 출력
		System.out.println("====== 홍길동 사원 정보 =========");
		System.out.println("사번: "+hong.getSabun());
		System.out.println("이름: "+hong.getName());
		System.out.println("부서: "+hong.getDept());
		System.out.println("직위: "+hong.getJob());
		System.out.println("입사일: "+hong.getRegdate());
		System.out.println("연봉: "+hong.getPay());

	}

}
