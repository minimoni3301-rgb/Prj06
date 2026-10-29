package ex04;

import java.util.Objects;

class Member {
	
	//field
	private String name;
	private String phone;
	private int    bYear;
	

	
	// constructor 
	
	public Member() {}
	
	public Member(String name, String phone, int bYear) {
		super();
		this.name = name;
		this.phone = phone;
		this.bYear = bYear;
	}

	
	
	// getter
	
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public int getbYear() {
		return bYear;
	}
	
	

	// mArr[0] (this) == m (other)
	// mArr[0].equals(m)
	@Override
	public boolean equals(Object obj) { 
		Member other = (Member) obj;
		/* return bYear == other.bYear && Objects.equals(name, other.name) && Objects.equals(phone, other.phone);*/
	   return name.equals(other.name);
			   }
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + ", bYear=" + bYear + "]";
	}

	
	
	// method 
	

	
		
}

 

public class TestMember {

	public static void main(String[] args) {
		
		//객체 배열 
		Member [] mArr = new Member[3]; // 반드시 배열을 먼저 만들어야한다. 
		mArr[0] = new Member("강호동","010-8588-5555",1968);
		mArr[1] = new Member("서장훈","010-1111-0000",1960);
		mArr[2] = new Member("김연아","010-7777-2222",1993);
		
		// toString을 해야하는 이유 : 데이터는 배열 속에 아주 잘 들어있지만, 
		//자바가 "그 객체를 화면에 어떤 모양으로 보여줘야 할지 몰라서" 자기 마음대로 고유 주소값(해시코드)을 출력해 버리기 때문
		
		System.out.println("전체 목록");
		for (int i = 0; i < mArr.length; i++) {
			System.out.println(mArr[i]);
		}
		
		//위에 for문을 씀으로써 아래 sysout 을 반복적으로 쓰지 않아도 된다. 
      /*System.out.println(mArr[0]);
		System.out.println(mArr[1]);
		System.out.println(mArr[2]);
		*/
	
        // 김연아의 정보를 출력
		Member m = new Member("김연아", null, 0); // 찾을 데이터 
		System.out.println("찾은 정보: ");
        for (int i = 0; i < mArr.length; i++) {
			if (mArr[i].equals(m) )
				System.out.println( mArr[i]);
		}
	}

}
