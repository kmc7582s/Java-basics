
/*

추상클래스 : 여러 클래스의 공통된 특성(필드, 메소드)를 추출해서 선언한 것을 추상클래스라고 한다.
- 실체 클래스(객체 생성용 클래스)들의 공통적인 특성을 추출해서 선언
- 추상클래스와 실체 클래스는 부모, 자식 클래스로서 상속관계를 가짐
- 실체 클래스와 인스턴스 생성 불가능하여 추상클래스 사용하려면 지식클래스에서 추상클래스를 상속 후 자식 클래스의 인스턴스를 생성해야 함.
- 추상 : abstract 키워드 사용
- 직접 객체를 생성할 수 없지만 자식 객체가 생성될 때 객체화 .

추상메소드 : 메소드 선언만 통일하고 실행 내용은 실체 클래스마다 달라야하는 경우
- abstract키워드로 선언되고 중괄호가 없는 메소드
- 자식클래스는 반드시 재정의해서 실행내용을 채워야 함.

abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켠다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끈다.");
	}
	
	abstract void sms(); //추상메소
}

class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internet() {
		System.out.println("인터넷 검색");
	}
	
	public void sms() {
		System.out.println("메세지 보내기");
	}
}

public class SeventhDay {
	
	public static void main(String[] args) {
		
		//Phone p = new Phone("고길동");
		
		SmartPhone sp = new SmartPhone("강민찬");
		sp.turnOn();
		sp.internet();
		sp.sms();
		sp.turnOff();
		
	}
}

인터페이스 : 추상클래스와 마찬가지로 직접 인스턴스 생성 불가
- 인터페이스는 필드, 추상메소드를 가질 수 있지만 추상클래스와 달리 일반 메소드, 생성자를 가질 수 없음.
- 필드도 static final을 붙인 상수화 필드만 사용할 수 있으며 반드시 초기화해야 함.
- 개발 코드를 수정하지 않으면서 객체 교환이 가능

interface Car {
	
	static final int CarCount = 0;
	
	public void work();
}

class Sedan implements Car {
	public void work() {
		System.out.println("사람을 태운다");
	}
}

class Truck implements Car {
	public void work() {
		System.out.println("짐을 싣는다");
	}
}

public class SeventhDay {
	public static void main(String[] args) {
		
		Sedan sd = new Sedan();
		sd.work();
		
		Truck t = new Truck();
		t.work();
	}
}

--------------------------------------------
interface Remocon {
	int maxVol = 10;
	int minVol = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVol(int vol);
	
}

class TV implements Remocon {
	private int vol;
	public void turnOn() {
		System.out.println("TV를 켠다");
	}
	
	public void turnOff() {
		System.out.println("TV를 끈다");
	}
	
	public void setVol(int vol) {
		if (vol > Remocon.maxVol) {
			this.vol = Remocon.maxVol;
		} else if (vol < Remocon.minVol) {
			this.vol = Remocon.minVol;
		} else {
			this.vol = vol;
		}
		System.out.println("현재 TV 볼륨 : " + this.vol);
	}
}

public class SeventhDay {
	public static void main(String[] args) {
		Remocon[] rc = new Remocon[2];
		rc[0] = new Audio();
		rc[1] = new TV();
		rc[0].turnOn();
		rc[0].setVol(5);
		rc[0].turnOff();
		
		rc[1].turnOn();
		rc[1].setVol(8);
		rc[1].turnOff();
			
	}
}

StarCraft 미션1

//부모클래스
class StarCraft {
	public StarCraft(String s) {
		System.out.println("스타 공격");
	}
}

//자식클래스
//테란
class Terran extends StarCraft {
	public Terran(String s) {
		super(s);
	}
	
	public void attack() {
		System.out.println("테란 공격");
	}
}

//저그
class Zerg extends StarCraft {
	public Zerg(String s) {
		super(s);
	}
	
	public void attack() {
		System.out.println("저그 공격");
	}
}

//프로토스
class Protos extends StarCraft {
	public Protos(String s) {
		super(s);
	}
	
	public void attack() {
		System.out.println("프로토스 공격");
	}
}

public class SeventhDay {
	
	public static void main(String[] args) {
		
	}
}

StarCraft 미션2

class StarCraft implements Terran {
	public StarCraft(String s) {
		System.out.println(s + "시작");
	}
	
	public void attack(String name) {
		System.out.println(name + "공격");
	}
	
	public void defence(String name) {
		
	}
	
	public void mineral(String name) {

	}
}

interface Terran {
	public void attack(String name);
	public void defence(String name);
	public void mineral(String name);
}

interface Zerg {
	public void attack(String name);
	public void defence(String name);
	public void mineral(String name);
}

interface Protos {
	public void attack(String name);
	public void defence(String name);
	public void mineral(String name);
}

public class SeventhDay {
	public static void main(String[] args) {
		StarCraft[] sc = new StarCraft[3];
		sc[0] = new StarCraft("테란부모");
		sc[0].attack("테란");
		sc[0].defence("테란");
		sc[0].mineral("테란");
	}
}


문제) 다중상속 예제

interface Car {
	public void move();
}

interface Cannon {
	public void shoot();
	
}

class Tank implements Car, Cannon {
	public void move() {
		System.out.println("움직인다");
	}
	public void shoot() {
		System.out.println("대포발사");
	}
}

public class SeventhDay {
	public static void main(String[] args) {
		Tank t = new Tank();	
		t.move();
		t.shoot();
	}
}

패키지 : 프로젝트 개발 시 클래스를 체계적으로 관리하기 위해 사용
- 클래스와 클래스의 멤버 사용범위에 맞게 접근 제한자를 활용
- 물리적인 형태는 파일 시스템의 폴더
- 패키지는 클래스의 일부분으로 클래스를 유일하게 만들어주는 역할
- 구성 : 상위패키지.하위패키지.클래스
- 선언 : 클래스 적성시 해당 클래스가 어떤 패키지에 속할 것 인지 선언
- import 문을 이용

접근제한자 : 클래스와 인터페이스 및 이들이 가진 멤버의 접근 제한
- public : 외부 클래스가 자유롭게 사용할 수 있음
- protected : 같은 패키지 또는 자식 클래스에서 사용할 수 있도록 함
- private : 외부에서 사용할 수 없음
- default : 같은 패키지에 소속된 클래스에서만 사용할 수 있음

*/
















