package bakery;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bakery")
public class BakeryController {

	@Autowired
	BakeryDAO dao;

	@RequestMapping(value = "/storeform", method = RequestMethod.GET)
	public void storeForm() {
		// 베이커리의 제품 이름, 가격, 수량, 사진파일
	}

	@RequestMapping(value = "/storeform", method = RequestMethod.POST)
	public ModelAndView storeResult(BakeryVO vo, HttpServletRequest request) throws IllegalStateException, IOException {
		// 베이커리의 제품 이름, 가격, 수량, 사진파일. DAO로 하시고 모델 값으로 상품 등록 완료를 보여줌
		String file1 = vo.getBakeryimage().getOriginalFilename();
		String uploadPath = request.getSession().getServletContext().getRealPath("/mvc/resources/images/");
		File filepath = new File("/mvc/resources/images");
		filepath.mkdir();
		/*
		 * String[] pathu = filepath.list(); for (String name : pathu) { if
		 * (name.equals(file1)) { String ext = file1.substring(file1.lastIndexOf("."));
		 * String fname = file1.substring(0, file1.lastIndexOf(".")); for (int i = 2;;
		 * i++) { File tmpf = new File(uploadPath + fname + "(" + i + ")" + ext); if
		 * (!tmpf.exists()) { file1 = fname + "(" + i + ")" + ext; break; } } } }
		 */
		String[] imagePath = this.getClass().getResource("").getPath().split("/");
		// 경로는 프로젝트 환경에따라 다 다를수밖에 없음;;알아서 잘 맞춰쓰자. git이면 git으로 바꾸고...워크스페이스 이름도 다르면 바꾸고
		String finPath = System.getProperty("user.home") + "\\eclipse-workspace\\" + imagePath[10]
				+ "\\src\\main\\webapp\\resources\\images";
		File imgfile = new File(finPath + "\\" + file1);

		System.out.println(imgfile.getAbsolutePath());

		vo.getBakeryimage().transferTo(imgfile);
		ModelAndView mv = new ModelAndView();
		mv.addObject("vo", vo);
		if (dao.insertBakery(vo)) {
			mv.addObject("result", vo.getBakeryname() + " 입력 성공");
		} else {
			mv.addObject("result", vo.getBakeryname() + " 입력 실패");
		}

		mv.setViewName("/bakery/storeresult");
		return mv;
	}
}
