package demo.c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 齐琪 on 2017/7/6.
 */
public class Service {
    public static void main(String[] args) {
     //   Business business = new Business();
       // business.setDeviceWriter(new UsbWriter());
        //business.write();
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontex.xml");
        Business business=(Business)applicationContext.getBean("business");
        business.write();

    }
}
