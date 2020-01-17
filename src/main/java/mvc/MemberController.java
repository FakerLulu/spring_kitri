package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MemberController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView moview = new ModelAndView();
		moview.addObject("inform", "회원가입후 로그인가능");
		moview.addObject("id", "member");

		moview.setViewName("member");

		return moview;
	}

	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest req,
	 * HttpServletResponse res) { req.setAttribute("inform", "회원가입후 로그인가능");// 데이터
	 * 넣어둠 return "member.jsp"; // 뷰이름 반환 }
	 */

}
