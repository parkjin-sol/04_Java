package section02;

public class Person {
	private String name;
	private int age;
	
	// 기본 생성자 
	public Person() {
		System.out.println("[Person 기본 생성자로 생성됨");
	}


	// 매개 변수 생성자 자동 생성 : alt + shift + s -> o                                                                                                                          
		public Person(String name, int age) {         
  		super();                                     
  		this.name = name;                            
  		this.age = age;                              
  	}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}                
		
		public String toString() {
	    return String.format("이름: %s, 나이: %d", name, age);
	}
	
  	                                              
}
