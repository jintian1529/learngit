package spring.learn.demo01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.learn.demo01.DiConfig;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService useFunctionService=
                context.getBean(UseFunctionService.class);

        System.out.println(context);
        System.out.println(useFunctionService.SayHello("di"));

        context.close();
    }
}
