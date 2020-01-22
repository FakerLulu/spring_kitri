package mybatis.bakery;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BakeryMain {

	public static void main(String[] args) {
		SqlSessionFactoryBuilder ssfbuilder = new SqlSessionFactoryBuilder();
		try {
			SqlSessionFactory ssfactory = ssfbuilder.build(Resources.getResourceAsReader("mybatis/bakery/config.xml"));
			SqlSession session = ssfactory.openSession(true);
			BakeryDAO dao = new BakeryDAO();
			dao.setSession(session);
			BakeryService bakeryService = new BakeryServiceImpl();
			((BakeryServiceImpl) bakeryService).setDao(dao);

			// 1. bakeryid : bakery_seq.nextval
			// 2. bakeryname, price, balance, bakeryimage : 명령행 매개변수 입력
			// run-run onfigurations-arguments 설정
			// 소보로빵 1500 100 bbang1.jpg
			// insert - bakery 테이블에 넣음( 5회)
			BakeryVO vo = new BakeryVO();

			vo.setBakeryname(args[0]);
			vo.setPrice(Integer.parseInt(args[1]));
			vo.setBalance(Integer.parseInt(args[2]));
			vo.setBakeryimage(args[3]);

			for (int i = 0; i < 5; i++) {

				System.out.println(bakeryService.insertItem(vo));
			}

			// select - bakery테이블도 출력해본다.
			for (BakeryVO bv : bakeryService.getAllItems()) {
				System.out.println(bv);
			}
			// db 연결은 mybatis를 써야한다(xml 최소 2개) config, bakery-mapper.xml
			// 구현은 dao에서

			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
