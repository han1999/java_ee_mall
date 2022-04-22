package com.hanxiao.mall.utils;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/22
 **/

public class HttpUtils {
    public static String getRequestBody(HttpServletRequest request) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            byteArrayOutputStream.write(bytes, 0, len);
        }
        String requestBody = byteArrayOutputStream.toString("utf-8");
        byteArrayOutputStream.close();
        inputStream.close();
        return requestBody;
    }
}
