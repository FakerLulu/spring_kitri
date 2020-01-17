package kitri.edu.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@RequestMapping("/boardwrite.mvc")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView moview = new ModelAndView();
		moview.addObject("name", "글쓰기임다");
		moview.setViewName("boardwrite");
		return moview;
	}

	/*
	 * @Override public String handleRequest(HttpServletRequest req,
	 * HttpServletResponse res) { req.setAttribute("name", "글쓰기임다");// 데이터 넣어둠
	 * return "board.jsp"; // 뷰이름 반환 }
	 */

}
