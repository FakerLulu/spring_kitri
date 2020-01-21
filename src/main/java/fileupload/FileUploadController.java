package fileupload;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FileUploadController {
	@RequestMapping(value = "/upload.file", method = RequestMethod.GET)
	public String fileup() {
		return "/file/upload_spring";
	}

	@RequestMapping(value = "/upload.file", method = RequestMethod.POST)
	public String uploadResult(@ModelAttribute UploadVO vo) throws IllegalStateException, IOException {

		// form 입력 데이터 name, description, file1, file2 입력받고 서버의 특정 디렉토리에 업로드하여 저장
		// c:\ upload폴더 생성
		String filename1 = vo.getFile1().getOriginalFilename();
		String filename2 = vo.getFile2().getOriginalFilename();

		System.out.println(vo.getName());
		System.out.println(vo.getDescription());
		System.out.println(vo.getFile1().getName());// 전송된 값의 이름 ( input태그의 name속성)
		System.out.println(filename1); // 파일명
		System.out.println(vo.getFile1().getSize()); // 파일명
		System.out.println(vo.getFile1().getContentType()); // 파일명

		String pathup = "c:/upload/";
		File directory = new File(pathup);
		String[] arr = directory.list();
		boolean hasfile1 = false, hasfile2 = false;
		for (String name : arr) {
			if (name.equals(filename1)) {
				hasfile1 = true;
				String ext = filename1.substring(filename1.lastIndexOf("."));
				String fname = filename1.substring(0, filename1.lastIndexOf("."));
//파일 이름 중복시 번호 붙여줌
				for (int i = 2;; i++) {
					File tfile = new File(pathup + fname + "(" + i + ")" + ext);
					if (!tfile.exists()) {
						filename1 = fname + "(" + i + ")" + ext;
						System.out.println("파일명 : " + filename1);

						break;
					}
				}

			} else if (name.equals(filename2)) {
				hasfile2 = true;
				// 파일 이름 중복시 번호 붙여줌
				String ext = filename2.substring(filename2.lastIndexOf("."));
				String fname = filename2.substring(0, filename2.lastIndexOf("."));
				for (int i = 2;; i++) {
					File tfile = new File(pathup + fname + "(" + i + ")" + ext);
					if (!tfile.exists()) {
						filename2 = fname + "(" + i + ")" + ext;
						System.out.println("파일명 : " + filename2);
						break;
					}
				}

			}
		}

		new File(pathup).mkdir();
		File file1 = new File(pathup + filename1);
		File file2 = new File(pathup + filename2);

		vo.getFile1().transferTo(file1);
		vo.getFile2().transferTo(file2);

		return "/file/uploadresult_spring";
	}
}
