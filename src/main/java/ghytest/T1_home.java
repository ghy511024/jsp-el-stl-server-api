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
public class T1_home {

//      private JspCServletContext context;
    public static void main(String[] args) {

        try {
            JspC jspc = new JspC();
            jspc.setUriroot("E:\\develop\\JAVAEE\\jsp-el-stl-server-api\\src\\main\\webapp");//web应用的root目录  
            jspc.setOutputDir("E:\\develop\\JAVAEE\\jsp-el-stl-server-api\\src\\main\\java\\ghytest");//.java文件和.class文件的输出目录  
            jspc.setJspFiles("\\WEB-INF\\jsp\\newjsp.jsp");//要编译的jsp  
            jspc.setCompile(true);//是否编译 false或不指定的话只生成.java文件  
            jspc.execute();
        } catch (Exception ex) {
            System.out.println("error........");
            Logger.getLogger(T1_home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
