package com.jm2200126.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyHttpServletRequestListener implements ServletRequestListener {

	public MyHttpServletRequestListener() {
	}

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("Request destroyed...");
	}

	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("Request created...");
	}

}
