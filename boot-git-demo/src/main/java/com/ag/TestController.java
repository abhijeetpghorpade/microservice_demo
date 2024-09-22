package com.ag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
public class TestController {
	
	@GetMapping("/testMethod")
	public String testMethod() {
		//added comment for git commit test
		return "git demo";
	}

}
