package com.global.util.HttpServlet;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpServletUtil {

    public static void sendJson(String json) {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.write(json);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(out);
        }
    }

    public static void close(PrintWriter x) {
        if (x != null) {
            x.close();
        }
    }
}
