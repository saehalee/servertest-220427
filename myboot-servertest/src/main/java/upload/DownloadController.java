package upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class DownloadController {
	@RequestMapping("/filedownloadlist")
	public ModelAndView downloadlist() {
		File f = new File("c:/upload");
		String[] filearray = f.list();
		ModelAndView mv = new ModelAndView();
		mv.addObject("filearray", filearray);
		mv.setViewName("upload/downloadlist");
		return mv;
	}
	
	@RequestMapping("/filedownloadresult")
	public void downloadresult(String filename, HttpServletResponse response) throws IOException {
		File f = new File("c:/upload/", filename);
		int len = (int)f.length();
		
		response.setContentType("application/download");
		response.setContentLength(len);
		response.setHeader("Content-Disposition", "attachment;filename=\"" + filename + "\"");
		
		//파일 전송
		OutputStream out = response.getOutputStream(); //브라우저 ㅈ응답 출력객체
		FileInputStream fin = new FileInputStream(f); //파일입력객체 생성
		FileCopyUtils.copy(fin,  out); //서버파일입력객체를 브라우저응답출력객체로 복사
		fin.close();
		out.close();
		
		
	}
}
