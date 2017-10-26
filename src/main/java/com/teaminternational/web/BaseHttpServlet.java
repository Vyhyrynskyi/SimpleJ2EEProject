package com.teaminternational.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teaminternational.HelloWorldGenerator;
import com.teaminternational.HelloWorldGeneratorImpl;

public abstract class BaseHttpServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HelloWorldGeneratorImpl helloWorld = getBean("HelloWorldGenerator");
		helloWorld.sayHello();
	}
    protected <T> T getBean(String name) {
        return (T) getServletContext().getAttribute(name);
    }
}
