import com.example.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaochoudecat on 2021/7/11
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People p = (People) context.getBean("people");
        p.getCat().shout();
        p.getDog().shout();

    }
}
