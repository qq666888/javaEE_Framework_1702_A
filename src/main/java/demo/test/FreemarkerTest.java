package demo.test;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by 齐琪 on 2017/7/19.
 */
public class FreemarkerTest {
    public static void main(String[] args) throws IOException, TemplateException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreeMarkerConfig freeMarkerConfig = (FreeMarkerConfig) applicationContext.getBean("freemarker");

        String model = "Student";

        Template template = freeMarkerConfig.getConfiguration().getTemplate("dao.ftl");
        Map<String, String> map = new HashMap<>();
        map.put("model", model);
        Writer writer = new FileWriter("src/main/java/demo/dao/" + model + "Dao.java");
        template.process(map, writer);
    }
}

/*
    Student
    fields:
        Integer id;
        String name;
        int age;
        double height;
        boolean married;
 */