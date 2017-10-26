package com.teaminternational.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseHttpServlet extends HttpServlet {
	
    protected <T> T getBean(String name) {
        return (T) getServletContext().getAttribute(name);
    }
}
