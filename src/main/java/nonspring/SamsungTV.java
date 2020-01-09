package nonspring;

public class SamsungTV implements TV {
	@Override
	public void powerOn() {
		System.out.println("삼성 전원 켬");
	}

	@Override
	public void powerOff() {
		System.out.println("삼성 전원 끔");

	}
}
