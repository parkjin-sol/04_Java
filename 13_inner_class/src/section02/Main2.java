package section02;

import section01.OuterClass2;

public class Main2 {
	public static void main(String[] args) {
		
		// 인스턴스 내부 클래스 생성 방식
//		OuterClass2 outer = new OuterClass2();
//		OuterClass2.StaticInnerClass inner = outer.new StaticInnerClass();
		
		/* 정적 내부 클래스 생성 방법 
		 * - 외부 인스턴스 생성 없이 바로 내부 클래스 이용 가능
		 * */
		OuterClass2.StaticInnerClass inner 
			= new OuterClass2.StaticInnerClass();
		
		inner.display();
		// 참조 변수를 이용한 static 호출 권장X 
    // inner.staticDisplay();
		OuterClass2.StaticInnerClass.staticDisplay();
		
		
	}
}
