package com.ekkerit.elmed.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Outil permettant de récupérer les messages des fichiers de propriétés.
 * @author Zahir KALI
 *
 */
public class MessageReader {
	/** Fichier des propriétés. */
	private static Properties properties = null;

	/** InputStream servant de lire le fichier des propriétes. */
	private static InputStream inputStream = null;

	/**
	 * Construire le InputStream et le fichier des propriétés.
	 * @param language
	 * 			Langue actuelle.
	 */
	public static void build(Language language) {
		properties = new Properties();
		if (language == null || language == Language.FR) {
			inputStream = MessageReader.class.getClassLoader().getResourceAsStream("messages/Message_fr_FR.properties");
		}

		if (language == Language.AMZ) {
			inputStream = MessageReader.class.getClassLoader()
					.getResourceAsStream("messages/Message_amz_AMZ.properties");
		}

		if (language == Language.EN) {
			inputStream = MessageReader.class.getClassLoader().getResourceAsStream("messages/Message_en_EN.properties");
		}

		if (language == Language.AR) {
			inputStream = MessageReader.class.getClassLoader().getResourceAsStream("messages/Message_ar_AR.properties");
		}

		try {
			if (inputStream == null) {
				System.out.println("Fichier de propriétés non trouvé.");
				return;
			}
			properties.load(inputStream);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Récupérer le message à partir d'une clé.
	 * @param key
	 * 		La clé du message à récupérer.
	 * @return
	 * 		Le message récupéré.
	 */
	public static String get(String key) {
		build(null);
		return properties.getProperty(key);
	}
}
