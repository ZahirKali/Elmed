package com.ekkerit.elmed.tools;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.ekkerit.elmed.testpackage.Application;

/**
 * Contexte Spring de l'application.
 * @author Zahir KALI
 *
 */
public class AppContext {
	/* Contexte Spring. */
	private static ApplicationContext appContext;

	/**
	 * Récuperer le context Spring actuel.
	 * @return
	 * 		Contexte Spring.
	 */
	public static ApplicationContext getApplicationContext(){
		if (appContext == null){
			appContext = SpringApplication.run(Application.class);
		}
		return appContext;
	}
}
