package org.spring.springbase.aop;

import java.lang.annotation.*;

/**
 * @Author:gaoty
 * @Description:
 * @Date：Created in 15:04 2017/12/20
 * @Modified By:
 **/
//
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
