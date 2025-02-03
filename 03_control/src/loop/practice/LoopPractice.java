package loop.practice;

import java.util.Scanner;

/**
 * 기능 제공용 클래스
 */
public class LoopPractice {
	
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 사용자로부터 한 개의 값을 입력 받아 
	 * 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		만일 1 미만의 숫자가 입력됐다면 
		“1 이상의 숫자를 입력해주세요“를 출력하세요.
	 */
	 public void practice1(){
		 System.out.println("1번 완성");
		 
	 }
	 
	 public void practice11() {
		 
		 System.out.println("------------------------------------------");
		 
		 
		 for(int row = 1 ; row <= input ; row++) {
			 
			 for(int col = 1 ; col <= 2 * input - 1 ; col++) {
				 
				 if (input - row >= col || input + row <= col) {
					 System.out.print("");
				 } else {
					 System.out.print("*");
				 }
			 }
			
		 }
		 System.out.println();
	 }
		 
	 public void practice12() {
		 System.out.print("정수 입력 :");
		 int input = sc.nextInt();
		 
		 for(int row = 1; row<= input ; row++) {
			 for (int col = 1 ; col <= input ; col++) {
			
				 if(row == 1 || row == input || col == 1 || col == input ) {
					 System.out.print("*");
				 } else {
					 System.out.print("");
				 }
			 }
			 System.out.println(""); // 줄바꿈
		 }
	 }
	 /**
	  * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 
	  * 소수의 개수를 출력하세요.
		* 단, 입력한 수가 2보다 작은 경우 
		* “잘못 입력하셨습니다.”를 출력하세요.
	  */
	 public void practice16(){
		 
		 System.out.print("숫자 : ");
		 int num = sc.nextInt();
		 
		 int count = 0; // 소수 개수를 세기 위한 변수
		 
		 // 2부터 입력 받은 수까지 1개씩 접근하는 for 문
		 for(int i=2 ; i<=num ; i++) {
			 
			 boolean flag = true;
			 
			 // 1과 자기자신(num)을 뺀 정수를 한 개씩 접근(x)
			 for(int x=2 ; x<i ; x++) {
				 
				 if(i % x == 0) { // 1, 자기자신 빼고 나누어 떨어지는 수 존재
					 flag = false;
					 break;
				 }
			 }
			 
			 if(flag) {
				 System.out.print(i + " ");
				 count++;
			 }
		 }

		 System.out.printf("\n2부터 %d까지 소수의 개수는 %d개 입니다\n ", num, count);
		 
		 

	 
	
	 }
}