package com.sevenlist.restplayground

import org.springframework.web.WebApplicationInitializer

import javax.servlet.ServletContext
import javax.servlet.ServletException

class RestPlaygroundInitializer implements WebApplicationInitializer {

    @Override
    void onStartup(ServletContext servletContext) throws ServletException {
        println 'Hello, world!'
    }
}
