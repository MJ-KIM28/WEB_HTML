/*=============================================
���� �ڹ��� ���� �� Ư¡ ����
- ������ �ڷ���
- �ڹ� �⺻ ����� : BufferedReader Ŭ���� Ȱ�� 
===============================================*/

// �� �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾� 
// �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �ﰢ���� ���� ���ϴ� ���α׷� 
// - �ﰢ���� �غ� �Է� : 30 �Է� �� ���͸� ġ��
// - �ﰢ���� ���� �Է� : 50 �Է� �ϸ�

// >> �غ��� 30, ���̰� 50�� �ﰢ���� ���� : xxx 
// ����Ϸ��� �ƹ� Ű�� ��������...

// *. �ﰢ���� ���� = �غ� * ���� / 2 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException //-- int�� output�� ������Ȳ�� �������� ���� ������ // IOE(<--���)
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int aa;
		int bb;
		double cc;
		
		// ���� �� ó��
		System.out.print("�ﰢ���� �غ� �Է� : "); 
		aa = Integer.parseInt(br.readLine());
		
		System.out.print("�ﰢ���� ���� �Է� : "); 
		bb = Integer.parseInt(br.readLine());
		
		cc = aa * bb / 2;
		
		// ���� ��� ��� 
		System.out.printf("�غ��� %d, ���̰� %d�� �ﰢ���� ���� : %f\n", aa, bb, cc);
		*/
		
		//*. ���� �ν� �� �м�
		// - �ﰢ���� ���� = �غ� * ���� / 2
		// - ����ڷκ��� �����͸� �Է¹޾� ó�� -> BufferedReader Ȱ��
		// - �غ��� ���̸� ����ڷκ��� �Է¹޴´ٰ� �ؼ� BufferedReader �� ���� Ȱ���� �ʿ�� ����. 
		
		// �ֿ� ���� ���� �� �ʱ�ȭ
		//BufferedReader �ν��Ͻ� �������� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �غ�, ����, ����  
		int underLength, height; // -- �غ��� ����(������ ����=���ø� �� ��)  
		//int area; 
		double area; //--���� check~!!! 
		
		// ���� �� ó��
		// 1) ����ڿ��� �ȳ� 
		System.out.println("�ﰢ���� ���� ���ϴ� ���α׷� ");
		System.out.print("�ﰢ���� �غ� �Է� :");

		// 2) ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ�� �� 
		// ���� underLength �� ��Ƴ���
		underLength = Integer.parseInt(br.readLine()); //-- �ڹ� �ɱ� �ǵ帲 �׷��� IOException ��������. 
		
		// 3) �ٽ� ����ڿ��� �ȳ� �޽��� ���
		System.out.print("�ﰢ���� ���� �Է� :");
		
		// 4) ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ�� �� 
		// ���� height �� ��Ƴ���
		height = Integer.parseInt(br.readLine()); 
		
		// 5) �ﰢ���� ���� ���ϴ� ���� ó�� 
		//	�ﰢ���� ���� = �غ� * ���� / 2
		// area = underLength * height / 2; // / ������ �ǿ����ڰ� �Ǽ��� �ִ��� üũ�غ� �ʿ䰡 ����. ->> �̰Ŵ� �ȵȴ�. 
		//		������		������	������ -> ���� ����� ������ ����ȴ�(��, ���� ���ϰ� �������� ������.) 
		//area = (double)(underLength * height / 2); -> x
		//area = (double)underLength * height / 2; ->> o
		//area = underLength * (double)height / 2; ->> o
		//area = underLength * height / (double)2; ->> o
		area = underLength * height / 2.0;
		//		������		������	  �Ǽ��� -> �Ǽ� ����� ���� ���� ���� 
		
		// *. �Ǽ� �ڷ����� ��������� ������ ��������
		// �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		// ������ [2]�� �ƴ� �Ǽ��� [2.0]���� ������ ������ �����ϰ� �Ǹ�
		// �� ������ �Ǽ� ������� ó���ϰ� �ȴ�. 
		
		
		// ���� ��� ��� 
		System.out.println();	//--����
		//System.out.print(); //<- ���ھ��� ���ԵǸ� �����߻�(������ ����) 
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", underLength, height,area);
		
		
		
	}
}

//������
/*
�ﰢ���� ���� ���ϴ� ���α׷�
�ﰢ���� �غ� �Է� :3
�ﰢ���� ���� �Է� :5

>> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/