package com.global.util.HttpServlet;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpServletUtil {
    private static HttpServletRequest request;
    private static HttpServletResponse response;

    public static HttpServletRequest getServletRequest() {
        if (request == null) {
            request = ServletActionContext.getRequest();
        }
        return request;
    }

    public static HttpServletResponse getServletResponse() {
        if (response == null) {
            response = ServletActionContext.getResponse();
        }
        return response;
    }

    public static void sendJson(String json) {
//        response = getServletResponse();
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json");
//        PrintWriter out = null;
        try {
            getServletResponse().setCharacterEncoding("UTF-8");
            getServletResponse().setContentType("application/json");
            PrintWriter out = getServletResponse().getWriter();
            out.write(json);
//            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
