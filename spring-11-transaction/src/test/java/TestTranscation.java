import com.example.dao.UserMapper;
import com.example.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by zhaochoudecat on 2021/8/4
 */
public class TestTranscation {
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper mapper = (UserMapper) context.getBean("userDao");
        List<User> user = mapper.selectUser();
        System.out.println(user);
    }
}
