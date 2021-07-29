import com.example.config.MyConfig;
import com.example.pojo.Dog;
import com.example.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaochoudecat on 2021/7/13
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.name);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.println(dog.name);
    }
}
