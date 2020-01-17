package kitri.edu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/form")
	public ModelAndView loginform() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginform");
		return mv;
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public ModelAndView loginResult(@RequestParam(name = "id", defaultValue = "빠따성분") String id,
			@RequestParam(name = "pw", defaultValue = "") String pw) {
		ModelAndView mv = new ModelAndView();
		String success = "아이디나 암호를 확인하시오";
		if (id.equals("hr")) {
			if (pw.equals("hr")) {
				success = "로그인 성공";
			}
		}
		mv.addObject("id", id);
		mv.addObject("result", success);
		mv.setViewName("loginresult");
		return mv;
	}

	@RequestMapping(value = "/result2", method = RequestMethod.POST)
	public ModelAndView loginResult2(@ModelAttribute("model") LoginVO vo) {

		ModelAndView mv = new ModelAndView();
		String success = "아이디나 암호를 확인하시오";
		if (vo.getId().equals("hr")) {
			if (vo.getPw().equals("hr")) {
				success = "로그인 성공";
			}
		}

		mv.addObject("result", success);
		mv.setViewName("loginresult");
		return mv;
	}
}
