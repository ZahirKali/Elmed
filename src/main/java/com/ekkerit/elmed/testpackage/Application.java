package com.ekkerit.elmed.testpackage;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ekkerit.elmed.tools.AppContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		AppContext.getApplicationContext();
	}
}
