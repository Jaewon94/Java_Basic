package oop;

class Student{
	
	// 필드와 메서드는 반드시 클래스 바로 하위(내부)에만 작성해야 한다.
	
	// 멤버 필드
	String name;
	int age;
	
	// 멤버 메서드
	void show() {
		int test =5;	// 이건 멤버 필드가 아니고, show함수의 지역변수이다.
		// 이클립스에서 멤버필드는 파란색, 지역변수는 갈색으로 표현한다.
		// 지역변수는 함수 실행중에만 유효하며, 함수가 종료되면 소멸한다.
		// 그러나, 멤버 필드는 함수 실행이 끝나도, 객체가 남아있다면 데이터가 유지된다.
		
		System.out.printf("이름은 %s이고, 나이는 %d살입니다.\n",name,age);
	}
	
	// 클래스 내부에는 곧바로 실행 코드를 작성할 수 없다.
	// 실행되어야 할 코드는 메서드 내부에서만 작성할 수 있다.
//	if(age>20) {
//		System.out.println("성인");
//	}
}

public class Ex02 {
	public static void main(String[] args) {
		// 클래스의 구성요소
		
		// 1. 객체는 속성정보를 저장할 수 있어야 한다(멤버 - 필드)
		// 2. 객체는 기능을 포함할 수 있어야 한다.(멤버 - 메서드)
		// 3. 객체는 생성과 소멸단계를 포함한 생명주기가 있다(생성자)
		// 4. 객체는 외부의 다른 객체와 상호작용할 수 있어야 한다.(접근제한자)
		// 5. 객체의 소멸은 자바 가상머신의 Garbage Collector가 처리한다.
		
		
		// 클래스를 활용하지 않은 형태로 코드를 진행한다면
		// 갯수가 많아진다면 일일이 다 만들어야 함
		String name = "홍길동";
		int age = 20;
		System.out.printf("이름은 %s이고, 나이는 %d살입니다.\n",name,age);
		
		// 클래스를 활용하여 코드를 진행한다면 
		// 1) 만들어진 클래스로 객체를 생성
		Student s1 = new Student();
		
		// 2) 객체의 멤버 필드는 일반 변수처럼 사용하면 된다. 
		// 갯수가 많아져도 처리하기 쉬워짐
		s1.name ="이지은";
		s1.age = 31;
		
		// 3) 객체의 멤버 메서드는 객체를 통하여 바로 호출할 수 있다.
		s1.show();	// 메서드의 내용이 아무리 길어도 호출을 통하여 손쉽게 지시할수 있다.
					// (만들어 놓으면 편하게 사용가능)
		
		// 자바의 특징 4가지
		// 캡슐화 (encapsulation)
		// 상속 (inheritance)
		// 추상화 (abstraction)
		// 다형성 (polymorphism)
		
		Student s2 = new Student();
		s2.name ="나단비";	// 멤버필드는 객체마다 다른 속성을 저장할 수 있다.
		s2.age=5;
		s2.show();// 같은 메서드를 호출해도 저장된 값이 다르니 결과가 달라진다.
	}
}