package config.bean.spring;

public class LGTV implements TV {
	@Override
	public void powerOn() {
		System.out.println("lg 전원 켬");
	}

	@Override
	public void powerOff() {
		System.out.println("lg 전원 끔");

	}
}
