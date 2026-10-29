package ex02;


class Member {
	
	// Field (class 바로 밑에 생겨서 class 전체를 지배하는 변수) 
	private String name;
	private String email;
	
	// Constructor
	// 기본생성자 : 인자가 없는 생성자 NoArgsConstructor
	// 무조건 기본생성자 만들어 놓고 시작하기 
	public Member() {
		
	}
	
	// 모든 인자가 있는 생성자 : AllArgsConstructor
	public Member(String name, String email) {
		this.name = name;
		this.email = email;
		
	}
	
	// Getter, Setter
	/*
	public void setEmail(String email) {
		this.email = email;
	}*/
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	



	// Method
	public void info() {
		System.out.println("이름:" + name + "이메일:" + email);
	}

	
	
	}
	


public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member ("박찬호", "park123@naver.com");
		m1.info();
		
		Member m2 = new Member("류현진",  null);
		m2.info();
        
		// 류현진 email을 수정하기 위해서 
		m2.setEmail("jjin@naver.com");
		// m2.email = "jjin@naver.com"; // error : not visible (private 라서 접근 불가능)
		m2.info();
		
		
		//m2의 이름은 무엇인가?
		String m2Name = m2.getName();  // chamel case (m2Name 표현법) 
		System.out.println(m2Name);
		
		Member m3 = new Member();
		m3.setName("최동원");
		m3.setEmail("roy@gamil.com");
		m3.info();
	}

}
