package upload;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	@RequestMapping(value="/fileupload", method=RequestMethod.GET)
	public String uploadform() {
		return "upload/uploadform";
	}
	
	@RequestMapping(value="/fileupload", method=RequestMethod.POST)
	public String uploadresult(@ModelAttribute("dto") UploadDTO dto) throws IOException {
		
		MultipartFile mf1 = dto.getFile1();
		MultipartFile mf2 = dto.getFile2();
		System.out.println(dto.getName());
		System.out.println(dto.getDescription());
		System.out.println(mf1.getOriginalFilename()); //MultipartFile toString메소드 오버라이딩되지 않으면 패키지명.클래스명
		System.out.println(mf2.getOriginalFilename());
		System.out.println(mf1.getSize()); //파일크기
		System.out.println(mf2.getSize());
		System.out.println(mf1.isEmpty()); //파일선택여부
		System.out.println(mf2.isEmpty());
		
		//파일내용 + 파일명 --> 서버 c:/upload 폴더 영구 저장
		String savePath = "c:/upload/";
		
		if(!mf1.isEmpty()) {
			String originName1 = mf1.getOriginalFilename();
			String beforeExt1 = originName1.substring(0, originName1.indexOf(".")); //확장자 이전파일명
			String ext1 = originName1.substring(originName1.indexOf("."));          //확장자 이후
			File serverFile1 = new File(savePath + beforeExt1+ "(" + UUID.randomUUID().toString()+ ")" + ext1); 
			mf1.transferTo(serverFile1);
		}
		if(!mf2.isEmpty()) {
			String originName2 = mf2.getOriginalFilename();
			String beforeExt2 = originName2.substring(0, originName2.indexOf(".")); //확장자 이전파일명
			String ext2 = originName2.substring(originName2.indexOf("."));          //확장자 이후
			File serverFile2 = new File(savePath + beforeExt2+ "(" + UUID.randomUUID().toString()+ ")" +ext2); 
			mf2.transferTo(serverFile2);
		}
		
		return "upload/uploadresult";
	}
}
