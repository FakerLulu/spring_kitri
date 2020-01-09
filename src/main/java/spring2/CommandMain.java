package spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommandMain {

	public static void main(String[] args) {
		ApplicationContext fac = new ClassPathXmlApplicationContext("spring2/command.xml");

		Command[] comArr = new Command[3];

		comArr[0] = fac.getBean("comm1", Command.class);
		comArr[1] = fac.getBean("comm2", Command.class);
		comArr[2] = fac.getBean("comm3", Command.class);

		for (int i = 0; i < comArr.length; i++) {
			comArr[i].run();
		}
	}

}
//게시판 : 실행중입니다
// 회원 : 관리중입니다
// 상품 : 등록중입니다