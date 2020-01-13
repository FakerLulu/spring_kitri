package aoptest2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("aoptest2/aop2.xml");

		Member mem = factory.getBean("member", Member.class);
		Board board = factory.getBean("board", Board.class);
		mem.login("id");
		board.insert(4);
		List list = board.getList();
		/*
		 * for (Object o : list) { System.out.println(o);
		 * 
		 * }
		 */

		mem.logout();
	}
}
