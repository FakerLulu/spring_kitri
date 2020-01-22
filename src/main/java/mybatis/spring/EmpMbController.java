package mybatis.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpMbController {

	@Autowired
	EmpService service;
	@Autowired
	JobService jservice;

	@GetMapping("/mybatis/emplist")
	public void getEmpList(ModelMap modelMap) {
		modelMap.addAttribute("list", service.getAllEmp());
	}

	@GetMapping("/mybatis/insertemp")
	public ModelAndView loadInserEmpForm() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("jobids", jservice.getAllJobID());
		mv.setViewName("mybatis/insertempform");
		return mv;
	}

	@PostMapping("/mybatis/insertemp")
	public ModelAndView insertEmp(EmpVO vo) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("vo", vo);
		mv.addObject("result", service.insertEmp(vo));
		mv.setViewName("mybatis/insertempsuccess");
		return mv;
	}
}
