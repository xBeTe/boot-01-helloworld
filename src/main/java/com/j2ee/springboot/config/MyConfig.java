package com.j2ee.springboot.config;

import ch.qos.logback.classic.db.DBHelper;
import com.j2ee.springboot.bean.Car;
import com.j2ee.springboot.bean.Pet;
import com.j2ee.springboot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true)（保证每个@Bean方法被调用多少次返回的组件都是单实例的）（默认）
 *      Lite(proxyBeanMethods = false)（每个@Bean方法被调用多少次返回的组件都是新创建的）
 *      组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *
 * 4、@Import({User.class, DBHelper.class})
 *      给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 *
 * 5、@ImportResource("classpath:beans.xml")
 *      导入Spring的配置文件
 *
 *
 * @author xzxie
 * @create 2022/9/22 17:02
 */
@EnableConfigurationProperties(Car.class)
@ImportResource("classpath:beans.xml")
@ConditionalOnMissingBean(name = "tom")
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)  //告诉SpringBoot这是一个配置类 == 配置文件
public class MyConfig {

    /**
     * |@Bean
     * 给容器中添加组件
     * 以方法名作为组件的id。
     * 返回类型就是组件类型。
     *
     * Full:外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     *
     * @return 返回的值，就是组件在容器中的实例
     */
    @Bean
    public User user01() {
        User zhangSan = new User("Zhang San", 18);
        // user组件依赖了Pet组件
        zhangSan.setPet(tomcatPet());
        return zhangSan;

    }

    @Bean("tom22")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }


}
