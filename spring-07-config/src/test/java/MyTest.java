import com.example.config.AppConfig;
import com.example.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaochoudecat on 2021/7/13
 */
public class MyTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) applicationContext.getBean("getUser");
        System.out.println(user.name);
    }
}
