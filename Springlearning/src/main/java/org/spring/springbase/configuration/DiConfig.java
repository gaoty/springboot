package org.spring.springbase.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.spring.springbase.service.UseFunctionService;

/**
 * @Author:gaoty
 * @Description:
 * @Date：Created in 14:14 2017/12/20
 * @Modified By:
 **/
@Configuration
@ComponentScan("org.spring.springbase.service")
public class DiConfig {

}
