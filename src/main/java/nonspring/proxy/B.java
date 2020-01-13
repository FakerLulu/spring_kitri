package nonspring.proxy;

public class B implements ProxyInterface {
	ProxyInterface p;

	public void setP(ProxyInterface p) {
		this.p = p;
	}

	@Override
	public void action() {
		System.out.println("b의 액션 수행 1");

		p.action(); // 뭐가될진 몰라도 액션 수행.

		System.out.println("b의 액션 수행 2");
	}

}
