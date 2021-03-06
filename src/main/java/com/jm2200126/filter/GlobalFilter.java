package com.jm2200126.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class GlobalFilter implements Filter {

	public GlobalFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println(">> " + this.getClass().getSimpleName());
		System.out.println(request.getRemoteHost());
		System.out.println(request.getServerPort());
		System.out.println(request.getLocale());
		System.out.println(request.getLocalAddr());
		System.out.println(request.getServerName());
		
		chain.doFilter(request, response);
		System.out.println("<< " + this.getClass().getSimpleName());
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
