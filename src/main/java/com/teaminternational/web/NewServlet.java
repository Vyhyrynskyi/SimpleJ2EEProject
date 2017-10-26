package com.teaminternational.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teaminternational.HelloWorldGenerator;
import com.teaminternational.HelloWorldGeneratorImpl;
import com.teaminternational.web.BaseHttpServlet;;

public class NewServlet extends BaseHttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HelloWorldGeneratorImpl helloWorldGenerator = getBean(HelloWorldGenerator.COMPONENT_NAME);
		helloWorldGenerator.sayHello();
	}
}
