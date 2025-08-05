/*
System.in.read() 메소드는 (입력 대기열로부터) 한 문자만 가져온다.
단, 입력받은 하나의 문자를 그대로 가져오는 것이 아니라
ASCII Code 값으로 반환하게 된다.
*/

// 실행 예)
// 한 문자 입력 : B 
// 한 자리 정수 입력 : 7

//>> 입력한 문자 : B 
//>> 입력한 정수 : 7


import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		//char ch; //--문자담을 변수 선언 
		//int ch;
		
		// 연산 및 처리
		//System.out.print("문자 하나를 입력하세요: ");
		//ch = System.in.read(); // ch=66; 자동형변환 규칙위배로 사용못함 -> 쓰려면  ch = (char)66;
		//ch = (char)System.in.read(); // - 명시적 형 변환 
		//ch = System.in.read();
		
		//System.out.print("한 문자 입력 : "); 
		//ch1 = (char)System.in.read();
		
		// 결과 출력 
		//System.out.println("ch : " + ch);
		
		// 주요 변수 선언 
		char ch; // 입력받은 문자를 담을 변수
		int n; // 입력받은 정수를 담을 변수 
		
		// 연산 및 처리
		// 사용자에게 안내 메시지 출력
		System.out.print("한 문자 입력 : "); // 입력대기열에 끌어올 값이 없으니 기다리는 상태. 
		// 사용자가 입력한 데이터 담아내기 
		ch = (char)System.in.read(); // 사용자가 입력한 문자를 받아들여오나 ch 값은 그대로 못받음 정수형 형태로 갖고 잇으므로 그래서 char로 형변환 하는 것임 
		
		// check~!!!
		// 입력 대기열에 남아있는 엔터(\r 과 \n) 을 건너뛰기(스킵)
		System.in.skip(2);
		// 매개변수 (2) 에 의해 두 글자를 읽지 않고 건너뛴다.(버린다.)
		
		// 사용자에게 안내 메시지 출력
		System.out.print("한 자리 정수 입력 : ");
		
		// 사용자가 입력한 데이터를 변수에 담아내기
		n = System.in.read();
		
		// 결과 출력 
		System.out.println(); //-개행
		System.out.println(">>입력한 문자 : " +  ch);
		System.out.println(">>입력한 정수 : " +  n);
	
		// 1 -> 49 / 2 -> 50 / 3 -> 51 1입력하면 48 증감되서 나오게끔 되어 있는 알고리즘 
	}
}

//실행결과
/*
문자 하나를 입력하세요: A
ch : 65
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : A
한 자리 정수 입력 : 1

>>입력한 문자 : A
>>입력한 정수 : 49
계속하려면 아무 키나 누르십시오 . . .


*/