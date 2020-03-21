package com.jm2200126.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/login")
public class LoginFilter implements Filter {

	List<String> users = new ArrayList<>();

	public LoginFilter() {
		users.add("atul");
		users.add("a");
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// pre-processing
		System.out.println(">> " + this.getClass().getSimpleName());
		HttpServletRequest req = (HttpServletRequest) request;
		String username = req.getParameter("username");

		if (username != null && users.contains(username)) {
			System.out.println("You are bloacked");
		} else {
			// processing
			chain.doFilter(request, response);
		}
		// post-processing
		System.out.println("<< " + this.getClass().getSimpleName());
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
