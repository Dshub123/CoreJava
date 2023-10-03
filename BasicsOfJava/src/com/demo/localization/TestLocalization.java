package com.demo.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocalization {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	
		Locale locale = new Locale("en", "US");
		ResourceBundle labels = ResourceBundle.getBundle("i18n.properties");
		System.out.println(labels.getString("message"));

		locale.setDefault(Locale.JAPANESE); //Set Japanese

	}

}
