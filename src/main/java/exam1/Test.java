package exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("exam1/test.xml");
		System.out.println(ac.getBean("tsi", TestService.class).test());

		for (String s : ac.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}
}
