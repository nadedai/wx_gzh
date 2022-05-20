package com.joolun;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * web容器中进行部署
 * 
 * @author ruoyi
 */
public class JooLunServletInitializer extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(JooLunWxApplication.class);
    }

}
