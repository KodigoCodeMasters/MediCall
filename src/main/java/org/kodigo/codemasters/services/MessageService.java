/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.services;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

	@Resource
	private MessageSource messageSource;

	private Locale locale = LocaleContextHolder.getLocale();

	public MessageService(Environment environment) {
	}

	public String getMessage(String code) {
		return messageSource.getMessage(code, null, locale);
	}
}