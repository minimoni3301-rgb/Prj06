package ex05;

import java.text.MessageFormat;
import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		
		System.out.println("문자열갯수:" + "Hello".length());      //5
		System.out.println("문자열갯수:" + "안녕하세요".length()); //5
	
		//            012345 6 7 8 9
		String str = "Java 프로그래밍";
		System.out.println("1위치의 글자:"+str.charAt(1));
		System.out.println("5위치의 글자:"+str.charAt(5));
	   
		//             01234567890
		String str2 = "Hello World";
		System.out.println("부분문자열 substring "+str2.substring(0,4+1)); //0~4
		System.out.println("부분문자열 substring"+str2.substring(6)); //6~끝까지(10+1)
		
		//             012345
		String str3 = "banana";
		System.out.println("문자(a)의 위치"+ str3.indexOf('a') ); //1
		System.out.println("문자(a)의 위치"+ str3.indexOf('a',2) ); //3
		System.out.println("문자(a)의 위치"+ str3.lastIndexOf('a')); //5
	
		// ~로 포함하는 : 시작 , 중간, 끝 모두 존재할 수 있다.
		String str4 = "apple pie ver2";
		System.out.println("pie라는 문자를 포함하고 있는가? "+str4.contains("pie"));
		
		
		// ~ 로 시작되는
		String str5 = "filename.txt";
		System.out.println("file 이 시작하는가?:" + str5.startsWith("file"));
		System.out.println("file 의 위치:" + str5.indexOf("file"));
		
		//~ 로 끝나는
		System.out.println(".txt로 끝나는가? :"+str5.endsWith(".txt"));
		
		
		// 문자열 비교
		String str6 = "Java";
		String str7 = "java";
		System.out.println(str6.equals(str7));           
		System.out.println(str6.equalsIgnoreCase(str7)); // 대소문자 무시		
		
		// 대소문자 변환 
		System.out.println(str6.toUpperCase());
		System.out.println(str6.toLowerCase());
		
		// 앞뒤의 공백을 제거
		String str8 = "     Hello   ";
		System.out.println(str8.length());
		System.out.println(str8.trim().length());
		
		// 문자열 교체
		String str9 = "i like java";
		System.out.println(str9);
		System.out.println(str9.replaceAll("java", "jiwoo")); // 출력할때만
		System.out.println(str9); // str9는 변함 없음.
		str9 = str9.replace("java","roy");
		System.out.println(str9);
		
		// 문자열 분리 
		String str10 = "red,green,blue";
		System.out.println(str10);   // red,green,blue
		String [] colorArr = str10.split(",");
		System.out.println(colorArr); // [Ljava.lang.String;@58644d46
		                              // , 로 나누고 난 직후에는 고유주소값을 출력하도록 설계되어있어서,,!
		// 이작업을 해줘야함. 
		System.out.println(Arrays.toString(colorArr)); // [red, green, blue]
		                                               // 배열에 모든 값을 한눈에 확인하고 싶을 때 
		System.out.println(colorArr[0]);//red
		System.out.println(colorArr[1]);//green
		System.out.println(colorArr[2]);//blue 
        

		// 배열은 원래"" 나눠서 작성해야하는데 위에 ","로 한번에 묶어서
		// ,로 쪼개는 작업을 한 것!!  (Split) 
		String [] num = {"지우","서인","민우","애정"};
		System.out.println(num[1]);
		System.out.println(Arrays.toString(num));
		String numplus = String.join("-", num);
		System.out.println(numplus);
		
		
		String [] num3 = {"지우,서인,민우,애정"};
		String num5 = String.join("," ,num3);
		System.out.println(num5);
		
		
		//
		String empty = "";   //빈문자열   : length() : 0 
		String blank = "         ";   //공백문자열 : length() : 1
		
		System.out.println(empty.isEmpty()); // 빈문자열인가
		System.out.println(blank.isBlank()); // 공백문자열인가 
		
		
		// System.out.printf()를 쓰지않고 format을 쓰는 이유는 
		// printf()는 일회성 출력용으로 콘솔창에 쏴놓고 끝이지만
		// format을 통해서 변수에 저장하고 다시 쓸 수 있다. 
		String name = "summer";
		int    age  = 25;
		String msg = String.format("이름:%s 나이:%d",
				                   name, age);
		System.out.println(msg);
		
		// • %s, %d 방식은 무조건 순서대로 1대1 매칭이 되어야 해서 융통성이 없습니다.
		//• {0}, {1} 방식은 뒤에 적힌 변수 보따리에서 
		//내가 원하는 번호의 알맹이를 자석처럼 착착 끌어다가 배치할 수 있어서 훨씬 자유롭습니다.
		String msg2 = MessageFormat.format("이름:{0} 나이:{1}", name, age);
		
		System.out.println(msg); 
		
		
		// 배열을 합치는 것
		String result = String.join("-", colorArr);
		System.out.println(result);
		
		String result2 = String.join("-", "2026","10","19");
		System.out.println(result2);
		
		//
		String star = "*";
	    System.out.println(star.repeat(5));
		
		
		
		
		
		
		
		
		
		
		
	}

}
