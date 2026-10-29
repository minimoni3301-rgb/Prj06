package ex01;

public class TestString {

	public static void main(String[] args) {
        //문자를 만드는 법 2가지
		//직접 ""로 넣기
		String  name1 = "이순신";
		String  name2 = "이순신";
		
		//new로 넣기
		String  name3 = new String("이순신"); // new는 Heap 새로 메모리 생성하라는 의미 
		String  name4 = new String("이순신");
		
	    System.out.println(name1);
	    System.out.println(name2);
	    System.out.println(name3);
	    System.out.println(name4);
	    
	    // 주소비교
	    // 같은 이름인가 -> 틀린 표현 : 문자열 비교는 '==' 쓰지 않는다. 
	    if( name1 == name2) // 주소비교 : Heap의 위치 
	        System.out.println("같은 이름");
	    else
	    	System.out.println("다른 이름");
	    
	    if( name3 == name4)
	        System.out.println("같은 이름");
	    else
	    	System.out.println("다른 이름");

	    
	    // data 비교 -> 정상적인 문자열 비교 ****외우기**** (p91)
	    if( name1.equals(name2) )
	        System.out.println("같은 이름");
	    else
	    	System.out.println("다른 이름");
	    
	    if( name3.equals(name4))
	        System.out.println("같은 이름");
	    else
	    	System.out.println("다른 이름");
	    
	    // 문자열의 >, < 비교의 목적은 문자열의 순서를 따짐 : 정렬을 위해서 (오름차순, 내림차순)
	    // name5 > name6 : 자바에서 비교 불가능 
	    String name5 = "이순신";
	    String name6 = "이이";
	    // if (name5 > name 6) //에러 : 문자열은 >로 비교 불가능 
	    if (name5.compareTo(name6) > 0) // name5 > name6 
	    { System.out.println("이순신이 크다");	
	    } else {
	    	if(name5.compareTo(name6)==0) {
	    		System.out.println("같은 이름이다");
	    	} else {
	    		if(name5.compareTo(name6)<0) {
	    			System.out.println("이순신이 작다");
	    		}
	    	}
	    } 
	}

}   // 문자열 비교는 equals나 compareTo를 사용한다. 
