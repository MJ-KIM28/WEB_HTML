/*=============================================
■■■ 자바의 개요 및 특징 ■■■
- 변수와 자료형
- 자바 기본 입출력 : BufferedReader 클래스 활용 
===============================================*/
// ■ 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요. : 최규석
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ====[결과]====
// 이름 : 최규석
// 총점 : 240
// 계속 하려면 아무 키나 누르세요... 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언 및 초기화
		String name1;
		int kor1, eng1, math1, sum1;
		
		// 연산 및 처리
		System.out.print("이름을 입력하세요. : ");
		name1 = br.readLine(); 		
		
		System.out.print("국어 점수 입력 :");
		kor1 = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수 입력 :");
		eng1 = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 입력 :");
		math1 = Integer.parseInt(br.readLine());
		
		sum1 = kor1 + eng1 + math1;
		
		System.out.println();
		System.out.println("====[결과]====");
		System.out.println("이름:" + name1);
		System.out.printf("총점: %d\n" ,sum1);
		*/
		
		// 주요 변수 선언
		
		//BufferedReader 인스턴스 생성
		InputStreamReader isr = new InputStreamReader(System.in); // 통역기 인스턴스 별도로 생성한 것
		BufferedReader br = new BufferedReader(isr); // 위에서 만든 isr을 밑에 넘긴다. 
		
		// BufferedReader br = new BufferedReader(isr);
		//
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 윗 줄이 이 뜻임
		
		String name;
		int kor, eng, mat;
		int tot;
		
		// 연산 및 처리
		
		// 결과 출력 
		
	}
}

//실행결과
/*

*/