package nonspring.proxy;

public class A implements ProxyInterface {

	@Override
	public void action() {
		System.out.println("a의 액션 수행");
	}

}
