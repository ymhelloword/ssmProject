import com.ym.ssm.entity.User;
import com.ym.ssm.service.LoginSeverceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginSeverceImp loginSeverceImp = applicationContext.getBean("loginSeverceImp", LoginSeverceImp.class);
        User user = loginSeverceImp.findUserByID(1) ;
        user.setName("ym");
        System.out.println(loginSeverceImp.updateUser(user)) ;
    }
}
