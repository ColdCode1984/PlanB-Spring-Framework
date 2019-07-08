package sping.in.action.chapter4.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class AopTest {

    @Autowired
    private Performance performance;

    @Test
    public void testAudience() {
        performance.perform();
        performance.thanksFor("xie tiao");
    }

    @Test
    public void testIntroduce() {
        // 利用aop为bean引入新功能缺点：需强制类型转换
        ((Encoreable) performance).performEncore();
    }
}