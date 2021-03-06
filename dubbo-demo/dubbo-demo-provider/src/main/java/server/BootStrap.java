package server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangxiong
 * @date 2017/4/27. Created by zhangxiong on 2017-04-29.
 */
public class BootStrap {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "provider.xml" });
        context.start();
        System.in.read();
    }
}
