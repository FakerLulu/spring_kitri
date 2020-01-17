package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView moview = new ModelAndView();
		moview.addObject("helloModel", "모래반지 빵야빵야");
		moview.setViewName("hello");

		return moview;
	}

	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest req,
	 * HttpServletResponse res) { req.setAttribute("helloModel", "모래반지 빵야빵야");// 데이터
	 * 넣어둠 return "hello.jsp"; // 뷰이름 반환 }
	 */

}
