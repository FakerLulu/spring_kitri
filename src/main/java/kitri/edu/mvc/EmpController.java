package kitri.edu.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

	@Autowired
	EmpDAO empDAO;

	@RequestMapping("emp.spring")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		if (empDAO != null) {
			mv.addObject("empList", empDAO.getEmpList());
			mv.setViewName("emplist");
		}
		return mv;
	}

}
