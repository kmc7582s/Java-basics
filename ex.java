import java.util.Random;
import java.util.Scanner;

/*
조건문
1. if 문

- 단순 if : 조건이 참인 경우에만 실행
	if(조건식){
		실행문;
	}

- if ~ else : 조건이 참인 경우와 거짓인 경우를 각각 실행
	if(조건식){
		조건 참인 경우 실행문;
	} else {
		조건 거짓인 경우 실행문;
	}
	
- if ~ else if .... else : 조건이 여러개 인 경우
	if(조건식1){
		조건1 참인 경우 실행문;
	} else if(조건식2){
		조건2 참인 경우 실행문;
	} ...... {
	  ......
	} else {
		모든 조건 거짓인 경우 실행문;
	}
	

- 주의!!!! : dangling else
else 문장은 가장가까운 if와 짝이라고 착각한다.
if 및 else 구문을 실행문의 갯수의 관계없이 { }으로 묶어준다


public class SecondDay {

	public static void main(String[] args) {
		int a = 199;
		if (a < 100) {
			System.out.println("그렇다...100보다 작다");
			System.out.println("100보다 크면 출력 안됨");
		}
		System.out.println("100보다 크면 다음 조건 실행");
		if (a > 100) {
			System.out.println("그렇다...100 보 크다");
		}
		
		// 단순 if -> if ~ else
		 * 
		System.out.println("--- if ~ else로 변환 ---");
		
		if (a < 100) {
			System.out.println("그렇다...100보다 작다");
		} else {
			System.out.println("그렇다...100 보 크다");
		}
		
		System.out.println("--- if ~ else를 중괄호 없이 변환 ---");
		
		if (a < 100)
			System.out.println("그렇다...100보다 작다");
		else
			System.out.println("그렇다...100 보 크다");
	}
}


// dsngling else
 

public class SecondDay {

	public static void main(String[] args) {
		
		int a = 3, b = 5;
		if (a < 2) {
			if (a == 1) {
				System.out.println("a : " + a);
			}
		} else {
				System.out.println("a : " + (a+2));
		}
	}	
}
	
	문제) 숫자 10을 변수 입력 후 짝수인지 홀수인지 판단하시오.
	

public class SecondDay {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// 클래스의 객체 생성 : 클래스타입 클래스변수 = new 클래스생성자();
		
		System.out.println("숫자를 입력하세요 : ");
		int a = scan.nextInt(); 
		
		if (a % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
		}
	}
	
}



// 중첩 if문
public class SecondDay {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 하세요(0보다 큰 자연수) : ");
		
		int a = scan.nextInt();
		System.out.println("입력한 " + a + "는(은)");
		if (a > 50) {
			if (a < 100) {
				System.out.println("50보다 크지만 100보다 작다.");
			} else {
				System.out.println("100보다 크다");
			}
		} else {
			System.out.println("50보다 작다");
		}
		
	}
	
}


//중첩 if문 -> if ~ else if ~ else
public class SecondDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 하세요(0보다 큰 자연수) : ");
		
		int a = scan.nextInt();
		System.out.println("입력한 " + a + "는(은)");
		if (a > 50 && a < 100) {
			System.out.println("50보다 크지만 100보다 작다.");
		} else if (a >= 100) {
			System.out.println("100보다 크다");
		} else {
			System.out.println("50보다 작다");
		}
	}
}

2. switch ~ case : if ~ else if ~ else 개선

switch(값) {
	case 값1:
		실행문;
		break; // switch 문을 빠져나온다
	case 값2:
		실행문;
		break; // switch 문을 빠져나온다
	......
	case 값n:
		실행문;
		break; // switch 문을 빠져나온다
	default:
		실행문;
		break;
}



public class SecondDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 하세요(1~4) : ");
		
		int a = scan.nextInt();
		System.out.println("입력한 " + a + "는(은)");
		
		switch (a) {
		case 1:
			System.out.println("커피");
			break;
		case 2:
			System.out.println("콜라");
			break;
		case 3:
			System.out.println("사이다");
			break;
		case 4:
			System.out.println("물");
			break;
		default:
			System.out.println("숫자오류(1~4만 입력)");
			break;
		}
	}
	
}



// if ~ else if ~ else -> switch ~ case

public class SecondDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 하세요(1~4) : ");
		
		int a = scan.nextInt();
		System.out.println("입력한 " + a + "는(은)");
		
		if (a == 1) {
			System.out.println("커피");
		} else if (a == 2) {
			System.out.println("콜라");
		} else if (a == 3) {
			System.out.println("사이다");
		} else if (a == 4) {
			System.out.println("물");
		} else {
			System.out.println("숫자오류(1~4만 입력)");
		}
		
	}
}



// switch문을 이용하여 날짜를 입력 후 해당 날짜의 요일을 출력 하시오. 단, 현재 월을 기준으로 작성 할 것.

public class SecondDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 하세요(1~31) : ");
		
		int a = scan.nextInt();
		System.out.println("입력한 " + a + "날짜는");
		
		switch (a%7) {
		case 0:
			System.out.print("목");
			break;
		case 1:
			System.out.print("금");
			break;
		case 2:
			System.out.print("토");
			break;			
		case 3:
			System.out.print("일");
			break;
		case 4:
			System.out.print("월");
			break;
		case 5:
			System.out.print("화");
			break;				
		default:
			System.out.print("수");
			break;
		}
		System.out.println("요일 입니다.");
	}
}



// 1. if ~ else if ~ else 로 학점 계산 프로그램 작성. 95~100 : A+, 90~94 : A, 85~89 : B+, 80~84 : B, 
//										   75~79 : C+, 70~74 : C, 65~69 : D+, 60~64 : D, 그외 F
// 2. if ~ else if ~ else -> switch 변환




public class SecondDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 하세요(0~100) : ");
		
		int a = scan.nextInt();
		System.out.println("입력한 " + a + "점수는");
		
		if (a >= 95) {
			System.out.println("A+");
		} else if (a >= 90) {
			System.out.println("A");
		} else if (a >= 85) {
			System.out.println("B+");
		} else if (a >= 80) {
			System.out.println("B");
		} else if (a >= 75) {
			System.out.println("C+");
		} else if (a >= 70) {
			System.out.println("C");
		} else if (a >= 65) {
			System.out.println("D+");
		} else if (a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
//		switch (a/5) {
//		case 20:
//		case 19:
//			System.out.println("A+");
//			break;
//		case 18:
//			System.out.println("A");
//			break;
//		case 17:
//			System.out.println("B+");
//			break;
//		case 16:
//			System.out.println("B");
//			break;
//		case 15:
//			System.out.println("C+");
//			break;
//		case 14:
//			System.out.println("C");
//			break;
//		case 13:
//			System.out.println("D+");
//			break;
//		case 12:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			break;
//		}
		
		switch (a/10) {
		case 10:
		case 9:	
			System.out.print("A");
			break;
		case 8:	
			System.out.print("B");
			break;
		case 7:	
			System.out.print("C");
			break;
		case 6:	
			System.out.print("D");
			break;
		default:
			System.out.print("F");
			break;
		}
		if (a % 10 >= 5 && a >= 60) {
			System.out.println("+");
		}
	}
	
}

*/

// 문제) 가위, 바위, 보 게임

public class SecondDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 숫자 입력 하세요(1. 가위  2. 바위  3. 보) : ");
		int user = scan.nextInt();
	
		Random rand = new Random();
		int com = rand.nextInt(3)+1;
		
		System.out.println("사용자 번호 : " + user);
		System.out.println("컴퓨터 번호 : " + com);
		
		// 사용자와 컴퓨터의 번호를 비교해서 승자와 패자를 출력
// 1. 가장 일반적인 방법
		
//		if (user == 1) {
//			if (com == 2) {
//				System.out.println("사용자 승");
//			} else if (com == 3) {
//				System.out.println("컴퓨터 승");
//			} else {
//				System.out.println("무승부");
//			}
//		} else if (user == 2) {
//			if (com == 1) {
//				System.out.println("사용자 승");
//			} else if (com == 3) {
//				System.out.println("컴퓨터 승");
//			} else {
//				System.out.println("무승부");
//			}
//		} else if (user == 3) {
//			if (com == 1) {
//				System.out.println("컴퓨터 승");
//			} else if (com == 2) {
//				System.out.println("사용자 승");
//			} else {
//				System.out.println("무승부");
//			}
//		}
		
// 2. 조합을 이용한 알고리즘 방법
//		if (user == com) {
//			System.out.println("비김");
//		} else if (user + com == 4) {  // 즉, 합이 사일 경우에는 숫자가 작은 쪽이 이긴다.(예외상항)
//			if (user < com) {
//				System.out.println("사용자승");
//			} else {
//				System.out.println("컴퓨터승");
//			}
//		} else {
//			if (user < com) {
//				System.out.println("컴퓨터승");
//			} else {
//				System.out.println("사용자승");
//			}
//		}
//	}
//}

//3. 조합을 이용한 알고리즘 방법
		if (user == com) {
			System.out.println("비김");
		} else if (com > (user+1)%3) { // 가위바위보를 숫자의 경우를 수를 늘여서 확인한 후, 
									   //무조건 오른쪽 바로 옆수가 이긴다.
			System.out.println("사용자승");
		} else {
			System.out.println("컴퓨터승");
		}
	}
	
}
