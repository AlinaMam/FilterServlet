package com.example;

import javax.servlet.*;
import java.io.IOException;

public class TestFilter implements Filter {
    private String message;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //Выведем ip address подключения в консоль
        String ipAddress = servletRequest.getRemoteAddr();
        System.out.println(ipAddress);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
