package com.ac.servlet;

import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.ac.entity.LoginLog;
import com.ac.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author wenqing.chen  2021/10/12 19:12
 **/
@WebServlet(value = "/downloadServlet")
public class DownloadServlet extends HttpServlet {

    @Autowired
    private LoginLogService loginLogService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        //接收参数
        //String realname = URLDecoder.decode(request.getParameter("fileName"), "UTF-8");

        String name = "loginLog_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + ".xlsx";
        String header = request.getHeader("User-Agent").toUpperCase();
        if (header.contains("MSIE") || header.contains("TRIDENT") || header.contains("EDGE")) {
            name = URLEncoder.encode(name, "UTF-8");
        } else {
            name = new String(name.getBytes("UTF-8"), "ISO8859-1");
        }
        response.reset();
        // 设置文件MIME类型
        response.setContentType(getServletContext().getMimeType(name));
        // 设置Content-Disposition
        response.setHeader("Content-Disposition", "attachment;filename=" + name);
        OutputStream out = response.getOutputStream();

        List<LoginLog> list = loginLogService.selectAll();
        ExcelWriter writer = ExcelUtil.getWriter(true);
        writer.write(list, true);
        writer.flush(out, true);
        writer.close();
        IoUtil.close(out);
    }
}
