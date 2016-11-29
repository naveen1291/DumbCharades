package com.dreamerz.filters;

/**
 * Created by naveen1291 on 27/11/16.
 */


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class CorsFilter implements Filter {


    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {


        HttpServletResponse response = (HttpServletResponse) res;
        System.out.println("mundu");
        chain.doFilter(req, response);
        System.out.println("tarvata");
        /*response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET");*/
        System.out.println("tarvata" + response.getHeader("Access-Control-Allow-Methods"));
        System.out.println("tarvata" + response.getHeader("Access-Control-Allow-Origin"));
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

}