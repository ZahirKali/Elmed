package com.ekkerit.elmed.testpackage;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/elmed")
	public String index() {
		return "Test réussi! L'API Elmed est fonctionnelle.";
	}
}

