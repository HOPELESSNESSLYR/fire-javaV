package com.degson;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动程序
 * 
 * @author degson
 */
@SpringBootApplication
@MapperScan("com.degson.system.mapper")
//@ComponentScan(basePackages = {"com.degson.fire"})

public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  DEGSON后台启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
    }
}
