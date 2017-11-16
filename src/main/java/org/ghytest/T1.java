/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ghytest;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.jasper.JspC;

/**
 *
 * @author ghy
 */
public class T1 {

//      private JspCServletContext context;
    public static void main(String[] args) {

        try {
//            String uriRoot = "E:\\develop\\workespace\\letvgit\\zyuser\\ZYUser\\src\\main\\webapp\\WEB-INF\\jsp\\user\\apply.jsp";
//            JspCServletContext context = new JspCServletContext(new PrintWriter(new OutputStreamWriter(System.out, "UTF-8")),
//                    new URL("file:" + uriRoot.replace('\\', '/') + '/'));
//            ConcurrentHashMap<String, TagLibraryInfo> taglibs = new ConcurrentHashMap<String, TagLibraryInfo>();
//            context.setAttribute(Constants.JSP_TAGLIBRARY_CACHE, taglibs);
            System.out.println("0");
            JspC jspc = new JspC();
           String[] arg0 = {"-uriroot", "E:\\develop\\workespace\\letvgit\\zyuser\\ZYUser\\src\\main\\webapp\\WEB-INF\\jsp", "-d", "E:\\develop\\workespace\\vue\\fis3-parser-vue-component\\test\\src\\html", 
                    "user\\apply.jsp" }; 
            jspc.setArgs(arg0);
//            jspc.setUriroot("E:\\develop\\workespace\\letvgit\\zyuser\\ZYUser\\src\\main\\webapp\\WEB-INF\\jsp");//web应用的root目录  
//            System.out.println("1");
//            jspc.setOutputDir("E:\\develop\\workespace\\vue\\fis3-parser-vue-component\\test\\src\\html");//.java文件和.class文件的输出目录  
//            System.out.println("2");
//            jspc.setJspFiles("user/apply.jsp");//要编译的jsp  
//            System.out.println("3");
//            jspc.setCompile(true);//是否编译 false或不指定的话只生成.java文件  
//            System.out.println("4");
            jspc.execute();
            System.out.println("5");
            System.out.println("end...");
//            System.out.println(context.getContextPath());
        } catch (Exception ex) {
            System.out.println("error........");
            Logger.getLogger(T1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
