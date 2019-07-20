package apple.pangzi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springApplication.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getAddress());
    }
}
