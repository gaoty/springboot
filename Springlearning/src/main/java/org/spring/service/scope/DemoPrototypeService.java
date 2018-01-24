package org.spring.service.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author:gaoty
 * @created 2018/1/24 19:33
 **/

@Service
@Scope("prototype")
public class DemoPrototypeService {
}
