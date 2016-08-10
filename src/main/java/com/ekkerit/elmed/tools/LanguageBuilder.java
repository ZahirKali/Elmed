package com.ekkerit.elmed.tools;

/**
 * Outils facilitant la manipulations des langues.
 * @author Zahir KALI.
 */
public class LanguageBuilder {
	/**
	 * Construire la langue à partir d'une chaine de caractère.
	 * @param language
	 * @return
	 */
	public static Language getLanguageFromString(String language){
		/** Le français est la langue par défaut. */
		if (language == null){
			return Language.FR;
		}
		switch (language) {
		case "amz":
			return Language.AMZ;
		case "fr":
			return Language.FR;
		case "en":
			return Language.EN;
		case "ar":
			return Language.AR;
		default:
			return Language.FR;
		}
	}
}
