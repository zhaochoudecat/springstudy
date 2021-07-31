import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaochoudecat on 2021/7/31
 */

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意： 动态代理 代理的是接口
        UserService service = (UserService) context.getBean("service");
        service.add();
    }
}