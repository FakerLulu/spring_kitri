package kitri.edu.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping("/hello.a")
	public ModelAndView handleReq(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("model", "안뇽 푸시캣");
		mv.setViewName("hello");
		return mv;
	}

}
