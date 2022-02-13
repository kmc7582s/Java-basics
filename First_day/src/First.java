/*
현실속의 객체 : 표현 할 수 있는 모든 것(속성, 기능) -> 클래스
현실속의 객체를 분석(속성, 기능)->클래스 (속성 : 맴버필드, 기능 : 메소드)
현실속의 객체 : 자동차 -> public class Car{ }
객체 분석 -> 속성 : 자동차 이름, 색상, 바퀴수, 속도, 종류.....
	      기능 : 전, 후, 좌, 우, 정.....
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

자바 main()메소드 : 단순히 프로그램의 시작을 나타낸다. 가장 먼저 객체가 생성되어야 할 클래스를
객체 생성후에 클래스가 가지고 있는 멤버필드나 메소드를 사용한다.

메소드 : 자바에서 특정 기능을 처리, 다른 프로그래밍 언어에서 함수 또는 멤버 함수하고 함. 메소드의 형태는 '메소드이름(){ }',
메소드에 따라서 파라미터(인자)가 있거나 없을 수 있다.

필드 : 객체의 상태를 나타내는 것으로 속성이라 함. 주로 '클래스변수이름.속성' 형식으로 사용
*/

/*

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello~~~~"); //개행문자 포함
		System.out.print("Hello~~~~"); //개행문자 포함X
		System.out.printf("%d", 1000); //서식지정
		
		System.out.printf("%d", 100, 200);
		//System.out.printf("%d %d", 100);
		System.out.println();
		// 문제) 100과 200을 더한 결과가 나오도록 서식문자를 사용하여 출력하라.
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

변수 : 어떤 값을 저장하기 위한 메모리 공간
데이터타입 : 정수형-int(4byte), 문자형-char(1byte)
		  실수형-float(4byte), 실수형-double(8byte)
		  부울형-boolean(1byte)
문자열 클래스 : 문자형의 클래스


public class First {
	public static void main(String[] args) {
		int a;
		float b = 200;
		
		a = 100;
		System.out.println("a : " + a); //문자연결연산자(+) : 문자열 + 문자열, 문자열 + 변수...
		System.out.println("b : " + b);
		//강제형변환 : 데이터 타입을 명시적으로 바꾼다.
		a = (int)123.45f;
		System.out.println("a : " + a);
		// = : 대입연산자(오른쪽(상수,변수,계산값)의 것이 왼쪽(변수)에 대입됨)
		boolean bool1, bool2;
		bool1=true;
		System.out.println("bool1 : " + bool1);
		
		bool2 = (10 == 20); // == : 같다
		System.out.println("bool2 : " + bool2);
		
		char ca, cb;
		a = 'A';
		System.out.println("a : " + a);
		System.out.println("a : " + (int)ca);
		
		cb = '가';
		System.out.println("cb : " + (int)cb);
		System.out.println("cb : " + (char)(cb+1));
		
		String str1 = "JAVA is very easy";
		String str2 = "20";
		System.out.println(str1 + str2); // 문자연결연산자
	}
}

산술연산자 : +, -, *, =, /(몫), %(나머지)
복합대입연산자 : +=, -=, *=, /=, %=
증감연산자 : 전위증감(증감후 계산), 후위즘감(계산후 증감), ++, --
관계션산자 : ==, !=, >, <, >=, <=
논리연산자(두가지 이상의 조건을 표현하는 경우 사용) : &&(AND, ||(OR), !(NOT)
비트연산자(정수나 문자등을 2진수로 변환한 다음 각 자리의 비트끼리 연산을 수행) : &(AND), |(OR), ^(XOR), ~(부정), <<(X두배), >>(X1/2)

*/

public class First {
	public static void main(String[] args) {
		// 문제) 변수에 20을 대입 후 변수를 3으로 나눈 나머지를 나타내라.
		
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
		
		// 문제) 다음의 증감연산를 직접 계산하여 x, y, z값을 각 라인별로 구하시오.
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
