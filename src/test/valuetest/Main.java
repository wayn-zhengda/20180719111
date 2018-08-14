package valuetest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String []args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig config = context.getBean(AppConfig.class);
        config.outSource();
    }
}
