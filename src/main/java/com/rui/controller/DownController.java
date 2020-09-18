package com.rui.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Controller
public class DownController {

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request) throws Exception {
        ServletContext servletContext = request.getServletContext ();
        String realPath = servletContext.getRealPath ("/images/index.jsp");
        //通过IO流对文件进行读写
        FileInputStream fileInputStream = new FileInputStream (realPath);
        byte[] bytes = new byte[fileInputStream.available ()];
        fileInputStream.read (bytes);
        fileInputStream.close ();
        HttpHeaders httpHeaders = new HttpHeaders ();
        httpHeaders.set ("Content-Disposition","attachment:filename=index.jsp");
        return new ResponseEntity<byte[]>(bytes,httpHeaders, HttpStatus.OK);
    }
}
