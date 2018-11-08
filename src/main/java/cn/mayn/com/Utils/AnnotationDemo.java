package cn.mayn.com.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service("Demo01")
public class AnnotationDemo {
    @Value("annotationDemo")
    private String name;

    @Value("01")
    private String id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AnnotationDemo.class);
        AnnotationDemo annotationDemo = annotationConfigApplicationContext.getBean(AnnotationDemo.class);
        System.out.println(annotationDemo.getName()+"---"+annotationDemo.getId());
    }
}


