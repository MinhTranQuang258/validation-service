package vn.tqminh.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.tqminh.application.business.FirstValidator;
import vn.tqminh.application.business.SecondValidator;

@RestController
public class TestController {

	@Autowired
	private FirstValidator firstValidator;
	
	@Autowired
	private SecondValidator secondValidator;
	
	@RequestMapping("/test")
	public void test() {
		firstValidator.nextValidator(secondValidator);
		firstValidator.validate(null);
	}
	
}
