package org.spring.service.el;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author:gaoty
 * @created 2018/1/24 20:09
 **/

@Data
public class DemElService {
    @Value("其他类的属性")
    private String author ;

}
