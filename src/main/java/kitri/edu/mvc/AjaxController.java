package kitri.edu.mvc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping(value = "/ajax/login", method = RequestMethod.GET)
	public String loginform() {
		return "ajax/loginform";
	}
	/*
	 * ajax로 안할때. 페이지 넘기는용
	 * 
	 * @RequestMapping(value = "/ajax/login", method = RequestMethod.POST) public
	 * ModelAndView loginResult(String id, String pw) { ModelAndView mv = new
	 * ModelAndView(); if (id.equalsIgnoreCase("hr") && pw.equalsIgnoreCase("hr")) {
	 * mv.addObject("result", "정상휴먼"); mv.addObject("logintime",
	 * Calendar.getInstance().getTime());
	 * 
	 * } mv.setViewName("ajax/loginresult"); return mv; }
	 */

	@RequestMapping(value = "/ajax/login", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public String loginResult(String id, String pw) {
		HashMap<String, String> mv = new HashMap<String, String>();
		if (id.equalsIgnoreCase("hr") && pw.equalsIgnoreCase("hr")) {
			/*
			 * mv.put("result", "정상휴먼"); mv.put("logintime",
			 * Calendar.getInstance().getTime());
			 */
			return "{\"result\" : \"ok\", \"logintime\" : \"" + Calendar.getInstance().getTime() + "\"}";
		}
		return "{\"result\" : \"err\", \"logintime\" : \"=====\"}";

	}

	@RequestMapping(value = "/ajax/boardlist", produces = "application/json;charset=utf-8")
	@ResponseBody
	public Map<String, BoardVO> getBoardList() {
		HashMap<String, BoardVO> mv = new HashMap<String, BoardVO>();
		ArrayList<BoardVO> ba = new BoardDAO().getBoardList();
		for (int i = 1; i <= ba.size(); i++) {
			mv.put(String.valueOf(i), ba.get(i - 1));
		}

		return mv;

	}

	@RequestMapping(value = "/ajax/oneboard", produces = "application/json;charset=utf-8")
	@ResponseBody
	public BoardVO getBoard(int seq) {

		BoardVO ba = new BoardDAO().getOneBoard(seq);
		System.out.println(seq + "요청 출력" + ba);
		return ba;

	}
}
