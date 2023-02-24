package com.j2ee.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类、主配置类
 * |@SpringBootApplication: 这是一个SpringBoot应用
 *
 * @author xzxie
 * @create 2022/9/20 17:27
 */

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // 1、返回IOC容器
        /*ConfigurableApplicationContext run = */SpringApplication.run(MainApplication.class, args);
        // /2、查看容器里面的组件
       /* for (String name : run.getBeanDefinitionNames()) {
            System.out.println(name);
        }*/

       /* // 3、从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("组件：" + (tom01 == tom02));   //true

        // com.j2ee.springboot.config.MyConfig$$EnhancerBySpringCGLIB$$2310e6cb@29d334c
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        // 如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        // 保持组件单实例
        User user01 = bean.user01();
        User user02 = bean.user01();
        System.out.println(user01 == user02);

        User user03 = run.getBean("user01", User.class);
        Pet tom03 = run.getBean("tom", Pet.class);

        System.out.println("用户的宠物：" + (user03.getPet() == tom03));


        //5、获取组件
        for (String s : run.getBeanNamesForType(User.class)) {
            System.out.println(s);
            
        }

        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);*/

       /* boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件："+tom);//false

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件："+user01);//true

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中tom22组件："+tom22);//true

        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println("haha："+haha);//true
        System.out.println("hehe："+hehe);//true*/

    }
}
