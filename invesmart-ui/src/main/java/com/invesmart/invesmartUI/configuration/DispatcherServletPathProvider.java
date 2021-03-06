package com.invesmart.invesmartUI.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DispatcherServletPathProvider implements org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPathProvider {

    @Value("${server.servlet.context-path}")
    private String servletContextPath;

    @Override
    public String getServletPath() {
        return servletContextPath;
    }

}