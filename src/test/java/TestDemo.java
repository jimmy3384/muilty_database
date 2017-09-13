/**
 * Created by xu.haifeng on 2017/8/10.
 */

import com.demo.Application;
import com.demo.biz.AppInfoBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.demo.mq.HelloSender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDemo {
    @Autowired
    private AppInfoBiz appInfoBiz;
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }
    /*@Test
    public void test() {
        DatabaseContextHolder.setDatabaseType(DatabaseType.DB2);
        AppInfoPo appInfoPo=appInfoBiz.getPo();
        System.out.println(appInfoPo.getAppKey());
    }*/

}
