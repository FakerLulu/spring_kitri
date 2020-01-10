package spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("lgtv")
public class LGTV implements TV {
	public LGTV() {
		System.out.println("쥐쥐 생성자");
	}

	@Override
	public void powerOn() {
		System.out.println("lg 전원 켬");
	}

	@Override
	public void powerOff() {
		System.out.println("lg 전원 끔");

	}
}
