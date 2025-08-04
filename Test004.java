/*==================================
■■■ 자바의 개요 및 특징 ■■■
- 변수와 자료형
- 키워드 및 식별자
====================================*/

public class Test004
{
		public static void main(String[] args)
		{
		double height = 171.7; 
		int age = 25;
		char grade = 'A'; 
		
		String name = "김주형"; 
		//int tel = 01023451234;  --(X)
		//long tel = 01023451234; --(X)
		//long tel = 01023451234L; --(X)
		//==>> 숫자로만 구성된 데이터라 할지라도
		// 맨 앞에 0이 올 수 있는 구조라면 숫자 형식으로 처리해서는 안된다.ex)사번,주민번호,전화번호  
		
		String _tel = "01023451234"; 
		String 주소 = "강서구 마두동"; 
		//-- 문법적으로 한글 단어를 변수명으로 사용할 수 있지만 실무적인 측면에서 접근한다면
		// 절대로 한글 단어를 변수명으로 사용해서는 안 된다.
		
		// 결과 출력
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);
		
		//char name = "김주형"; // 오류 char은 2byte 밖에 담지 못 하므로 
		//String name = "이유빈"; //-- 스코프 영역 안에서 변수명은 식별자~!!
		
		//String #name = "조경진"; << 변수명은 [ $ ]와 [ _ ] 만 허용 
		// -- '$' 와 [ ] 를 제외한 다른 특수문자는
		// 그나마 사용 가능한 이들 특수문자도 함부로 사용하지 말아야 한다.
		// (일반적으로 규칙을 갖고 사용할 수 있도록 처리) 	
		}
}

//실행결과
/*
name : 김주형
age : 25
_tel : 01023451234
주소 : 강서구 마두동
*/