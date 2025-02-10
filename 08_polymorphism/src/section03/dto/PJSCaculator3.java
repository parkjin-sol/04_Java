package section03.dto;
// inplement (구현하다) - 인터페이스 상속 키워드

/* 클래스가 다중 상속이 안되는 이유
 * - 상속 받은 같은 이름의 필드/메서드 호출 시
 *   어떤 부모로부터 상속 받았는지 알 수 없기 때문에! 
 *   
 *   (클래스 상속은 완성된 메서드를 상속 받는다고 가정)
 *   
 * */

/* 인터페이스 다중 상속 확인
 * - 다중 상속 가능 (개수 제한 없음)
 * 
 * - 인터페이스의 메서드는 
 * 	 default 
 * 
 * */
public class PJSCaculator3 implements Calculator, Machine {

	@Override
	public int plus(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mod(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int pow(int a, int x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double areaOfCircle(double r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void poweOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void poweOff() {
		// TODO Auto-generated method stub
		
	}

	
}
