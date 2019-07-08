package sping.in.action.chapter2.xmlconfig.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sping.in.action.chapter2.xmlconfig.bean.CompactDisc;
import sping.in.action.chapter2.xmlconfig.bean.MediaPlayer;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/spring/chapter-2-xmlconfig.xml"})
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    @Qualifier("cdPlayer1")
    private MediaPlayer cdPlayer1;

    @Autowired
    @Qualifier("cdPlayer2")
    private MediaPlayer cdPlayer2;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull("cd is null!", cd);
    }

    @Test
    public void play1() {
        cdPlayer1.play();
    }

    @Test
    public void play2() {
        cdPlayer2.play();
    }

}
