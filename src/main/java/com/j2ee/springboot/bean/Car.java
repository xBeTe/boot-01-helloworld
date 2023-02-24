package com.j2ee.springboot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xzxie
 * @create 2022/9/22 18:21
 */
@ToString
@Data
@Component  // 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;
    private Integer price;

}
