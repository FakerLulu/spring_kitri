package board;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@Autowired
	BoardDAO boardDAO;

	@RequestMapping(value = "/write.board", method = RequestMethod.GET) // 쓰는 폼은 writeform.jsp
	public ModelAndView writeform() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/writeform");
		return mv;
	}

	/*
	 * @RequestMapping(value = "/write.board", method = RequestMethod.POST) // 쓰는 폼은
	 * writeform.jsp public void writeBoard( @ModelAttribute("vo") BoardVO bvo,
	 * HttpServletResponse res) { boardDAO.insertBoard(bvo); try {
	 * res.sendRedirect("./list.board"); } catch (IOException e) {
	 * e.printStackTrace(); } }
	 */
	@RequestMapping(value = "/write.board", method = RequestMethod.POST) // 쓰는 폼은 writeform.jsp
	public ModelAndView writeBoard(/* @ModelAttribute("vo") */ BoardVO bvo, HttpServletResponse res) {
		boardDAO.insertBoard(bvo);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/list");

		return mv;
	}

	@RequestMapping("/list.board")
	public ModelAndView viewBoardList() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", boardDAO.getBoardList());
		mv.setViewName("board/list");
		return mv;

	}

	@RequestMapping("/detail.board")
	public ModelAndView viewBoardDetail(int seq) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("detail", boardDAO.getOneBoard(seq));
		mv.setViewName("board/detail");
		return mv;

	}
}
