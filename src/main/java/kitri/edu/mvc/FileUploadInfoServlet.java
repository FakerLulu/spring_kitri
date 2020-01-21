package kitri.edu.mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 1. web.xml의
 *  DispatcherServlet 부분 주석처리하고 
 * FileUploadInfoServlet 매핑 부분 추가할 것!!!!!
<!-- 	<servlet>
		<servlet-name>file</servlet-name>
		<servlet-class>edu.kitri.board.FileUploadInfoServlet</servlet-class>
	</servlet>
		
	<servlet-mapping>
		<servlet-name>file</servlet-name>
		<url-pattern>/upload.file</url-pattern>
	</servlet-mapping> -->
 * 2. 웹서버 새로 시작
 * 3. webapp 폴더에 uploadform_servlet.jsp form 태그 action 확인!!!
 * ===non spring  환경으로 테스트하기 위한 설정
 * 
 * 4. 실습 후에 web.xml 파일 원상복귀할 것
 * 5.  실습 후에  webapp\\web-inf\\views\\uploadform_servlet.jsp 파일 복사 이름 변경!!!
 * */
public class FileUploadInfoServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();

		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<HEAD>");
		out.println("<TITLE>파일 업로드 테스트</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<H3>파일 올리기 성공</H3>");

		out.println("업로드 문서 타입 정보: [" + req.getContentType() + "]<BR>");
		out.println("업로드 문서 타입 길이: [" + req.getContentLength() + "]<BR>");
		out.println("<FONT color=blue>");
		InputStreamReader isr = new InputStreamReader(req.getInputStream(), "utf-8");
		BufferedReader br = new BufferedReader(isr);
		for (String line; (line = br.readLine()) != null;) {
			out.println(line + "<BR>");
		}
		out.println("</FONT>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}
}
