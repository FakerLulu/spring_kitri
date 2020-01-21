package fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileDownloadController {

	@RequestMapping("/downloadform")
	public ModelAndView downloadForm() {
		ModelAndView mv = new ModelAndView();
		// c:upload 파일목록을 만들어줌

		mv.addObject("filelist", new File("c:/upload").list());
		mv.setViewName("file/download_spring");
		return mv;

	}

	@RequestMapping("/download")
	@ResponseBody
	public void downloadResult(String name, HttpServletResponse res) throws UnsupportedEncodingException {
		// 서블릿 응답 필요함
		// 파일찾기
		File f = new File("c:/upload/", name);
		// 다운로드에 필요한 설정

		res.setContentType("application/download");
		res.setContentLength((int) f.length());
		res.setHeader("Content-Disposition", "attachment;filename=\"" + URLEncoder.encode(name, "UTF-8") + "\"");
		// 스트림으로 내보낼 준비
		try {
			OutputStream os = res.getOutputStream();
			FileInputStream fis = new FileInputStream(f);
			byte[] tmp = new byte[1024];
			FileCopyUtils.copy(fis, os);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
