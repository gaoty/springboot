package org.spring.springbase.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author:gaoty
 * @Description:
 * @Date：Created in 14:14 2017/12/20
 * @Modified By:
 **/
@Configuration
@ComponentScan("org.spring.springbase.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
