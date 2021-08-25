package br.com.teste.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.validation.ObjectError;

public class MessageUtil {
	
	public static List<String> getMessages(List<ObjectError> list) {
		List<String> messages = new ArrayList<String>();
		Iterator<ObjectError> it = list.iterator();
		
		while (it.hasNext()) {
			messages.add(it.next().getDefaultMessage());
		}
		
		return messages;
	}
	
	public static List<String> getMessages(String message) {
		List<String> messages = new ArrayList<String>();
		
		messages.add(message);
		
		return messages;
	}

}
