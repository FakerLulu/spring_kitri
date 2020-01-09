package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tvmain {

	public static void main(String[] args) {
//		TV stv = new SamsungTV();
//		stv.powerOn();
//		stv.powerOff();
//
//		TV lg = new LGTV();
//		lg.powerOn();
//		lg.powerOff();
		ApplicationContext tvfac = new ClassPathXmlApplicationContext("spring/tvspring.xml");

		TV tv = (TV) tvfac.getBean("sstv");
		tv.powerOn();
		tv.powerOff();

		tv = (TV) tvfac.getBean("lgtv");
		tv.powerOn();
		tv.powerOff();

		TV tv2 = (TV) tvfac.getBean("lgtv");

		System.out.println(tv == tv2);
	}

}
