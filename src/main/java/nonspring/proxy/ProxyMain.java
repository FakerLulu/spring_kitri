package nonspring.proxy;

public class ProxyMain {
	public static void main(String[] args) {
		B b = new B();
		b.setP(new A());
		b.action();
		b.setP(new C());
		b.action(); // 들어간 친구 = 핵심관심, B = 공통관심
	}
}
