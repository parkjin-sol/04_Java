package conditon.run;

// 다른 패키지에 있는 클래스 가져오기
import conditon.service.ConditionService;
/**
 * 실행용 클래스
 * */
public class CondtionRun {
	
	// main method : 자바 실행 메서드
	public static void main(String[] args) {
		
		// ConditionService 객체 생성
		ConditionService service = new ConditionService();
		
//		service.method1();
		
//		service.method2();
		
//		service.method3();	
		
		service.displayMenu();
		}
}
