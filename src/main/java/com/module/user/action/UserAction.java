package com.module.user.action;

import com.alibaba.fastjson.JSON;
import com.global.util.HttpServlet.HttpServletUtil;
import com.module.user.model.UserDO;
import com.module.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAction extends ActionSupport {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    private UserDO user;

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }

    public void queryUserAction() {
        Map map = new HashMap();
        int total = 0;
        List<UserDO> list = userService.find(UserDO.class, user);
        if (list != null) {
            total = list.size();
        } else {
            list = new ArrayList<UserDO>();
        }
        map.put("total", total);
        map.put("rows", list);
        HttpServletUtil.sendJson(JSON.toJSONString(map));
    }

    public void testAction() {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        try {
            PrintWriter out = response.getWriter();
            out.write("{\"firstName\": \"Bill\",\"lastName\": \"Gates\"}");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
