/*
���Ǽ��� ��ü : ǥ�� �� �� �ִ� ��� ��(�Ӽ�, ���) -> Ŭ����
���Ǽ��� ��ü�� �м�(�Ӽ�, ���)->Ŭ���� (�Ӽ� : �ɹ��ʵ�, ��� : �޼ҵ�)
���Ǽ��� ��ü : �ڵ��� -> public class Car{ }
��ü �м� -> �Ӽ� : �ڵ��� �̸�, ����, ������, �ӵ�, ����.....
	      ��� : ��, ��, ��, ��, ��.....
public class Car{
	String carName;
	String carcolor;
	int velocity;
	String carType;
	
	public void go(){
	
	}
	public void back(){
	
	}
}

�ڹ� main()�޼ҵ� : �ܼ��� ���α׷��� ������ ��Ÿ����. ���� ���� ��ü�� �����Ǿ�� �� Ŭ������
��ü �����Ŀ� Ŭ������ ������ �ִ� ����ʵ峪 �޼ҵ带 ����Ѵ�.

�޼ҵ� : �ڹٿ��� Ư�� ����� ó��, �ٸ� ���α׷��� ���� �Լ� �Ǵ� ��� �Լ��ϰ� ��. �޼ҵ��� ���´� '�޼ҵ��̸�(){ }',
�޼ҵ忡 ���� �Ķ����(����)�� �ְų� ���� �� �ִ�.

�ʵ� : ��ü�� ���¸� ��Ÿ���� ������ �Ӽ��̶� ��. �ַ� 'Ŭ���������̸�.�Ӽ�' �������� ���
*/

/*

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello~~~~"); //���๮�� ����
		System.out.print("Hello~~~~"); //���๮�� ����X
		System.out.printf("%d", 1000); //��������
		
		System.out.printf("%d", 100, 200);
		//System.out.printf("%d %d", 100);
		System.out.println();
		// ����) 100�� 200�� ���� ����� �������� ���Ĺ��ڸ� ����Ͽ� ����϶�.
		System.out.printf("%d + %d = %d", 100, 200, 100+200);
		//System.out.printf("%d / %d = %f", 100, 200, 0.5);
		System.out.printf("%d / %d = %f", 100, 200, 0.5);
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);
		System.out.printf("%s\n", "Hi~JANA");
		System.out.printf("%10s\n", "Hi~JANA");
	}
}

���� : � ���� �����ϱ� ���� �޸� ����
������Ÿ�� : ������-int(4byte), ������-char(1byte)
		  �Ǽ���-float(4byte), �Ǽ���-double(8byte)
		  �ο���-boolean(1byte)
���ڿ� Ŭ���� : �������� Ŭ����


public class First {
	public static void main(String[] args) {
		int a;
		float b = 200;
		
		a = 100;
		System.out.println("a : " + a); //���ڿ��Ῥ����(+) : ���ڿ� + ���ڿ�, ���ڿ� + ����...
		System.out.println("b : " + b);
		//��������ȯ : ������ Ÿ���� ��������� �ٲ۴�.
		a = (int)123.45f;
		System.out.println("a : " + a);
		// = : ���Կ�����(������(���,����,��갪)�� ���� ����(����)�� ���Ե�)
		boolean bool1, bool2;
		bool1=true;
		System.out.println("bool1 : " + bool1);
		
		bool2 = (10 == 20); // == : ����
		System.out.println("bool2 : " + bool2);
		
		char ca, cb;
		a = 'A';
		System.out.println("a : " + a);
		System.out.println("a : " + (int)ca);
		
		cb = '��';
		System.out.println("cb : " + (int)cb);
		System.out.println("cb : " + (char)(cb+1));
		
		String str1 = "JAVA is very easy";
		String str2 = "20";
		System.out.println(str1 + str2); // ���ڿ��Ῥ����
	}
}

��������� : +, -, *, =, /(��), %(������)
���մ��Կ����� : +=, -=, *=, /=, %=
���������� : ��������(������ ���), ������(����� ����), ++, --
����ǻ��� : ==, !=, >, <, >=, <=
��������(�ΰ��� �̻��� ������ ǥ���ϴ� ��� ���) : &&(AND, ||(OR), !(NOT)
��Ʈ������(������ ���ڵ��� 2������ ��ȯ�� ���� �� �ڸ��� ��Ʈ���� ������ ����) : &(AND), |(OR), ^(XOR), ~(����), <<(X�ι�), >>(X1/2)

*/

public class First {
	public static void main(String[] args) {
		// ����) ������ 20�� ���� �� ������ 3���� ���� �������� ��Ÿ����.
		
		int a = 20;
		System.out.println("a : " + 20 % 3);
		
		a += 10; // a = a+10
		System.out.println("a : " + a);
		
		++a;
		System.out.println("a : " + a);
		a++;
		System.out.println("a : " + a);
		System.out.println("a : " + ++a);
		System.out.println("a : " + a++);
		System.out.println("a : " + a);	
		
		// ����) ������ �������긦 ���� ����Ͽ� x, y, z���� �� ���κ��� ���Ͻÿ�.
		int x = 3, y= 3;
		int z;
		
		z = ++x + y-- - x++;
		z = x++ - ++y;
		z = --x + ++y + --y;
		x = x++ + ++x - x++;
		y = (--y - --y - y--);
		z = --x - ++y + y-- + x++;
		System.out.println("x : " + x + " y : " + y + "z : " + z);
		
		int aa = 99;
		System.out.println("AND : " + ((aa >= 100) && (aa <= 200)));
		System.out.println("AND : " + ((aa >= 100) || (aa <= 200)));
		
		System.out.println("<< : " + (aa<<1));
		System.out.println("<< : " + (aa>>1));
	}
}
