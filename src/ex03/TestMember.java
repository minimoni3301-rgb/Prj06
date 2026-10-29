package ex03;

import java.util.Objects;

// 자바의 모든 class는 기본으로 Object class 상속받는다. 
class A extends Object {}
// == class A {}
// a. 했을때 나오는 중요한 4가지 요소 아래 
// equals   : 객체 비교
// equals 는 문자열(String) 을 비교하면 값을 비교하도록 재정의되어 있다. 
// 일반 객체에서는 equals를 사용해도 주소로 비교한다.  [일반 객체에서는 기능적으로 == 와 같은일을 한다.]

// toString : 객체 이름을 출력할 때 
// hashCode : 객체의 heap 의 위치를 출력 
// getClass : class 정보를 가지고 올 때 


class Member extends Object {
	//Field
	private String name;
	private String phone;
	
	
	// 생성자 Constructor
	
	public Member() {
	   System.out.println("Member class 입니다.\n");
	}
	
	public Member(String name, String phone) {
		this(); // 기본 생성자를 호출한다. this 는 Member 
		// super();  // Object() 부모 클래스의 기본 생성자를 호출한다. 
		this.name = name;
		this.phone = phone;
	}

	
	// getter setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	// method (실제 출력용)
	
	public void info() {
		System.out.println("이름:" + name + ",전화번호:" + phone);	
	}

	
	
	// override (값이 맞는지 안맞는지 확인하는 용도[디버깅용]) 
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}
 
	// equals 재정의 
	// m1.equals(m)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	
	
	
	
}

public class TestMember {

	public static void main(String[] args) {
		//인스턴스 m1,m2,m3 
		
		Member mz = new Member();
		mz.setName("이승우");
		mz.info();
		
		Member m1 = new Member("손흥민", "010-5868-5454");
		Member m2 = new Member("안정환","010-8456-4651");
		Member m3 = new Member("차범근","010-4132-7878");
		
		
		m1.info();
		m2.info();
		m3.info();
	
		// 손흥민의 이름과 전화번호를 출력하고 싶다. (찾기위한 객체를 만듬)
		Member m = new Member("손흥민", "010-5868-5454");
		
		// 객체(인스턴스)를 비교할 때 '=='를 사용하면 객체의 위치값을 비교하는 것
		System.out.println( m1 == m); // false, 원칙
		
		// 비교 가능하게 만들어줘 -> equals를 재정의해서 값을 비교하도록 하는 것.
		// 비교를 (이름,전화)값으로 비교하도록 재정의 한다.   -> override 이용!!!
		System.out.println( m1.equals(m)); // flase -> true 
		
		
		
		
		
		
		A a = new A();
		// a.
		
		
		// heap 메모리 위치 = @ 뒤에 
		
		System.out.println("-------------------");
		
		System.out.println( m1 );           // ex03.Member@14dad5dc
		                  //[name=손흥민, phone=010-5868-5454]
		
		System.out.println( m1.toString()); // ex03.Member@14dad5dc
		                  //[name=손흥민, phone=010-5868-5454]
		
		System.out.println( m1.hashCode()); // 349885916 //-> 이걸 16진수로 하면 14dad5dc 이렇게 나옴 
		
		System.out.println( m1.getClass()); // class ex03.Member
		
		
		System.out.println("-------------------");
		System.out.println( m );             // ex03.Member@18b4aac2
		
	
	}

}
