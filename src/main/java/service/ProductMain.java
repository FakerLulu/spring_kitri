package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("service/product.xml");
		ProductDao dao = applicationContext.getBean("dao", ProductDao.class);
		ProductService psg = applicationContext.getBean("psgen", ProductService.class);
		ProductService ps12 = applicationContext.getBean("ps12", ProductService.class);
		ProductService ps5 = applicationContext.getBean("ps5", ProductService.class);

		System.out.println("일반 : " + psg.sell());
		System.out.println("5월 : " + ps5.sell());
		System.out.println("12월 : " + ps12.sell());

	}

}
