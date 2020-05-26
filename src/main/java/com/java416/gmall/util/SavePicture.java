package com.java416.gmall.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Date;

public class SavePicture {
    //文件保存到服务器上
    public static void savePicture(MultipartFile file, HttpServletRequest request)
            throws IOException, FileNotFoundException {
        String ImagePath = request.getSession().getServletContext().getRealPath("upload");
        File targetfile = new File(ImagePath, file.getOriginalFilename());
        Date date = new Date(System.currentTimeMillis());
        if(targetfile.exists()){
            String[] s = file.getOriginalFilename().split("\\.");
            s[0] += date.getTime();
            targetfile = new File(ImagePath, s[0] + "." + s[1]);
        }
        InputStream ins = file.getInputStream();
        FileOutputStream fos = new FileOutputStream(targetfile);

        byte b[] = new byte[1024];
        int temp = 0;

        while((temp = ins.read(b)) != -1){
            fos.write(b, 0, temp);
        }

        fos.close();
        ins.close();
    }
}
