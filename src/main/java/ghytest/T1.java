/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghytest;

import java.util.logging.Level;
import java.util.logging.Logger;
import org2.apache.jasper.JspC;

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
            JspC jspc = new JspC();
//           String[] arg0 = {"-uriroot", "E:\\develop\\workespace\\letvgit\\zyuser\\ZYUser\\src\\main\\webapp\\WEB-INF\\jsp", "-d", "E:\\develop\\workespace\\vue\\fis3-parser-vue-component\\test\\src\\html", 
//                    "user\\apply.jsp" }; 
//            jspc.setArgs(arg0);
            jspc.setUriroot("E:\\develop\\workespace\\JAVAEE\\ghy\\javaee-jsp-api\\impl\\src\\main\\webapp");//web应用的root目录  
            jspc.setOutputDir("E:\\develop\\workespace\\JAVAEE\\ghy\\javaee-jsp-api\\impl\\src\\main\\java\\ghytest");//.java文件和.class文件的输出目录  
            jspc.setJspFiles("\\WEB-INF\\jsp\\newjsp.jsp");//要编译的jsp  
            jspc.setCompile(true);//是否编译 false或不指定的话只生成.java文件  
            jspc.execute();
//            System.out.println(context.getContextPath());
        } catch (Exception ex) {
            System.out.println("error........");
            Logger.getLogger(T1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
