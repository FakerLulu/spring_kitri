package springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
//		EmpVo vo = new EmpVo();
//		vo.setId(100);
//		vo.setName("야야야");
//		vo.setSalary(123900.99);
//
//		EmpDao dao = new EmpDao();
//		dao.setVo(vo);
//		EmpVo resultvo = dao.getVo();
//		System.out.println(resultvo);
// 빈 안쓰고 하는 경우

		ApplicationContext cont = new ClassPathXmlApplicationContext("springdi/emp.xml");
		EmpDao dao2 = (EmpDao) cont.getBean("dao");
		System.out.println(dao2.getVo());
	}
}
