package member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
//가입, 리스트, 정보, 수정, 탈퇴

	@RequestMapping("/member/add")
	public void addMember() {
		System.out.println("회원가입");
	}

	@RequestMapping("/member/list")
	public String getMemberList() {
		System.out.println("회원목록처리중");
		return "/member/memberlist";
	}

	@RequestMapping("/member/delete")
	public String deleteMember() {
		System.out.println("회원 탈퇴후 리스트 출력");
//		return "/member/memberlist";
		return "redirect:/member/list";

	}

	@RequestMapping("/member/update")
	public ModelAndView updateMember() {
		// return "/member/memberlist";
		System.out.println("회원정보 수정이염");
		ModelAndView mv = new ModelAndView();
		mv.addObject("upid", "수정한id");
		mv.setViewName("member/update");
		return mv;

	}

	@RequestMapping("/member/get")
	public Model getMember(Model m) {
		// return "/member/memberlist";
		System.out.println("회원한명쓰1");
		m.addAttribute("id", "spring");
		m.addAttribute("name", "맛대맛");
		return m;

	}

	@RequestMapping("/member/get2")
	public Map<String, String> getMember2() {
		// return "/member/memberlist";
		System.out.println("회원한명쓰2");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "spring2");
		map.put("name", "맛대맛2");
		return map;
	}

	/////////////////////
	@ModelAttribute("listmodel")
	public ArrayList<MemberVO> getModel() {
		ArrayList<MemberVO> ar = new ArrayList<MemberVO>();
		System.out.println("회원목록처리중22");
		ar.add(new MemberVO("SPRING", "김순자"));
		ar.add(new MemberVO("mybatis", "이정철"));
		ar.add(new MemberVO("java", "박정권"));
		ar.add(new MemberVO("android", "최원영"));
		ar.add(new MemberVO("javascript", "권광국"));
		return ar;
	}

	@ModelAttribute("searchmodel")
	public ArrayList<String> getModel2() {
		ArrayList<String> ar = new ArrayList<String>();
		System.out.println("회원검색");
		ar.add("id검색");
		ar.add("이름검색");
		ar.add("메일검색");
		ar.add("연락처검색");

		return ar;
	}

	////// 모델 애트리뷰트 메소드 선언 : 공유
	@RequestMapping("/member/list2")
	public void getList2() {

	}

	@RequestMapping("/member/list3")
	public void getList3() {

	}

	@RequestMapping("/member/searchlist")
	@ModelAttribute("resultlist")
	public ArrayList<MemberVO> searchList(@RequestParam(name = "condition") String condition,
			@RequestParam(name = "searchword") String sword) {

		ArrayList<MemberVO> re = new ArrayList<MemberVO>();
		ArrayList<MemberVO> list = getModel();
		String cond = condition.split("검색")[0];
		System.out.println(cond + "찾아볼깜" + sword);
		if (cond.equals("id")) {
			for (MemberVO m : list) {

				if (m.getId().contains(sword)) {
					System.out.println(m);
					re.add(m);
				}
			}
		} else if (cond.equals("이름")) {
			for (MemberVO m : list) {
				if (m.getName().contains(sword)) {
					re.add(m);
				}
			}
		} else {
			re = list;
		}
		return re;
	}

}
