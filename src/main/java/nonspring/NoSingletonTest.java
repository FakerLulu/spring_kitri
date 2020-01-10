package nonspring;

class NoSingleton {
	static int i = 0;

	public NoSingleton() {
		System.out.println(++i + "번째 생성자 호출");
	}
}

public class NoSingletonTest {

	public static void main(String[] args) {
		NoSingleton ns1 = new NoSingleton();
		NoSingleton ns2 = new NoSingleton();
		NoSingleton ns3 = new NoSingleton();
		System.out.println("생성 객체 : " + ns1);
		System.out.println("생성 객체 : " + ns2);
		System.out.println("생성 객체 : " + ns3);

	}
}