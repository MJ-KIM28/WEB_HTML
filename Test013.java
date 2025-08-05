/*=============================================
■■■ 자바의 개요 및 특징 ■■■
- 변수와 자료형
- 자바 기본 입출력 : BufferedReader 클래스 활용 
===============================================*/

// □ 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아 
// 이 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예)
// 삼각형의 넓이 구하는 프로그램 
// - 삼각형의 밑변 입력 : 30 입력 후 엔터를 치면
// - 삼각형의 높이 입력 : 50 입력 하면

// >> 밑변이 30, 높이가 50인 삼각형의 넓이 : xxx 
// 계속하려면 아무 키나 누르세요...

// *. 삼각형의 넓이 = 밑변 * 높이 / 2 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException //-- int과 output에 문제상황이 생겼을때 냅다 던져줘 // IOE(<--약어)
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언 및 초기화
		int aa;
		int bb;
		double cc;
		
		// 연산 및 처리
		System.out.print("삼각형의 밑변 입력 : "); 
		aa = Integer.parseInt(br.readLine());
		
		System.out.print("삼각형의 높이 입력 : "); 
		bb = Integer.parseInt(br.readLine());
		
		cc = aa * bb / 2;
		
		// 최종 결과 출력 
		System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이 : %f\n", aa, bb, cc);
		*/
		
		//*. 문제 인식 및 분석
		// - 삼각형의 넓이 = 밑변 * 높이 / 2
		// - 사용자로부터 데이터를 입력받아 처리 -> BufferedReader 활용
		// - 밑변과 높이를 사용자로부터 입력받는다고 해서 BufferedReader 두 개를 활용할 필요는 없다. 
		
		// 주요 변수 선언 및 초기화
		//BufferedReader 인스턴스 생성구문 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 밑변, 높이, 넓이  
		int underLength, height; // -- 밑변과 높이(변수를 선언=마련만 해 둠)  
		//int area; 
		double area; //--넓이 check~!!! 
		
		// 연산 및 처리
		// 1) 사용자에게 안내 
		System.out.println("삼각형의 넓이 구하는 프로그램 ");
		System.out.print("삼각형의 밑변 입력 :");

		// 2) 사용자가 입력한 데이터(문자열)를 정수 형태로 변환한 후 
		// 변수 underLength 에 담아내기
		underLength = Integer.parseInt(br.readLine()); //-- 자바 심기 건드림 그래서 IOException 선언해줌. 
		
		// 3) 다시 사용자에게 안내 메시지 출력
		System.out.print("삼각형의 높이 입력 :");
		
		// 4) 사용자가 입력한 데이터(문자열)를 정수 형태로 변환한 후 
		// 변수 height 에 담아내기
		height = Integer.parseInt(br.readLine()); 
		
		// 5) 삼각형의 넓이 구하는 연산 처리 
		//	삼각형의 넓이 = 밑변 * 높이 / 2
		// area = underLength * height / 2; // / 나오면 피연산자가 실수가 있는지 체크해볼 필요가 있음. ->> 이거는 안된다. 
		//		정수형		정수형	정수형 -> 정수 기반의 연산이 수행된다(즉, 몫을 취하고 나머지는 버린다.) 
		//area = (double)(underLength * height / 2); -> x
		//area = (double)underLength * height / 2; ->> o
		//area = underLength * (double)height / 2; ->> o
		//area = underLength * height / (double)2; ->> o
		area = underLength * height / 2.0;
		//		정수형		정수형	  실수형 -> 실수 기반의 연산 수행 가능 
		
		// *. 실수 자료형이 결과값으로 나오는 과정에서
		// 실수 기반의 연산이 필요한 상황이다.
		// 정수형 [2]가 아닌 실수형 [2.0]으로 나눗셈 연산을 수행하게 되면
		// 이 연산을 실수 기반으로 처리하게 된다. 
		
		
		// 최종 결과 출력 
		System.out.println();	//--개행
		//System.out.print(); //<- 인자없이 쓰게되면 에러발생(컴파일 에러) 
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", underLength, height,area);
		
		
		
	}
}

//실행결과
/*
삼각형의 넓이 구하는 프로그램
삼각형의 밑변 입력 :3
삼각형의 높이 입력 :5

>> 밑변이 3, 높이가 5인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .
*/