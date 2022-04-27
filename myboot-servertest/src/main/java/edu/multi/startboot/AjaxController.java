package edu.multi.startboot;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
	
	public MemberDTO test() {
		return new MemberDTO("ID", "PASSWORD");
	}
}
