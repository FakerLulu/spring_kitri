package kitri.edu.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@RequestMapping("/member.mvc")
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
