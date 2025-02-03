package abstraction;

public class ConstructorRun {
	
	public static void main(String[] args) {
		
		Student std1 = new Student(); // Student 기본 생성자를 이용해 객체 생성
		
		// 생성자 
		// - 객체가 생성될 때 수행할 명령어를 작성한 특수한 메서드 
		// - 객체 생성 시 1회만 수행
		// - 모든 클래스에는 생성자가 최소 1개 이상 존재
		// - 단, 하나도 작성되지 않으면 컴파일러가 기본 생성자 추가
		
		System.out.println(std1.toString());
		
		System.out.println("-----------------------------------");
		
		// Student(String, String) 매개 변수가 있는 생성자 이용
		Student std2 = new Student("20250004", "맹구");
		
		System.out.println(std2.toString()); // 학번, 이름 세팅 확인
		
		System.out.println("------------------------------------");
		
		// Student 객체의 필드를 모두 초기화하는 생성자 이용
		Student std3 = new Student("2025005", "유리", 40, 70, 90, 100);
		System.out.println(std3.toString());
		
		Student std4 = new Student("2025006", "수지", 100, 100, 90, 90); 
		System.out.println(std4.toString());
		
	}
}
