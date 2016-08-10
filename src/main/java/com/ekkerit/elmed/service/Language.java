package com.ekkerit.elmed.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Service permettant de choisir la langue.
 * @author Zahir KALI
 *
 */
@RestController
public class Language {

	@RequestMapping("/language")
	public void setLanguage(String language){

	}
}
