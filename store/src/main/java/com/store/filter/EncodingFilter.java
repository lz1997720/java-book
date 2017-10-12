package com.store.filter;

import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodingFilter extends OncePerRequestFilter {

	private String sessionKey;


	private Pattern excepUrlPattern;

	public void destroy() {
		// TODO Auto-generated method stub

	}
/*
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		chain.doFilter(req, resp);
	}
*/

	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");

		// 不过滤的uri
		String[] notFilter = new String[] {"/login","/register"};

		// 请求的uri
		String uri = request.getRequestURI();
		// 是否过滤
		boolean doFilter = true;
		for (String s : notFilter)
		{
			if (uri.indexOf(s) != -1)
			{
				// 如果uri中包含不过滤的uri，则不进行过滤
				doFilter = false;
				break;
			}
		}

		if (doFilter)
		{
			// 执行过滤
			// 从session中获取登录者实体
			Object obj = request.getSession().getAttribute("name");
			if (null == obj)
			{
				boolean isAjaxRequest = isAjaxRequest(request);
				if (isAjaxRequest)
				{
					response.setContentType("UTF-8");
					response.sendError(HttpStatus.UNAUTHORIZED.value(), "您已经太长时间没有操作,请刷新页面");
					return ;
				}
				response.sendRedirect("../mystore/login");
				return;
			}
			else
			{
				// 如果session中存在登录者实体，则继续
				filterChain.doFilter(request, response);
			}
		}
		else
		{
			// 如果不执行过滤，则继续
			filterChain.doFilter(request, response);
		}
	}
	public static boolean isAjaxRequest(HttpServletRequest request)
	{
		String header = request.getHeader("X-Requested-With");
		if (header != null && "XMLHttpRequest".equals(header))
			return true;
		else
			return false;
	}
}
