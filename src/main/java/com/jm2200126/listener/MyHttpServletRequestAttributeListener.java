package com.jm2200126.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyHttpServletRequestAttributeListener implements ServletRequestAttributeListener {

	public MyHttpServletRequestAttributeListener() {
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println(srae.getName() + " attribute delete with value: " + srae.getValue());
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println(srae.getName() + " attribute added with value: " + srae.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println(srae.getName() + " attribute replaced with value: " + srae.getValue());
	}

}
