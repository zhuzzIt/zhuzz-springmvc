import com.zhuzz.springmvc.bean.User;
import com.zhuzz.springmvc.service.UserSearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by h3ilang on 2017/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AspectTest {
    @Autowired
    private UserSearchService userSearchService;

    @Test
    public void test(){
        User user = userSearchService.getUser("h3ilang");
        System.out.println("111");
    }
}
