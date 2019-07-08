package sping.in.action.chapter2.javaconfig.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sping.in.action.chapter2.javaconfig.bean.CompactDisc;
import sping.in.action.chapter2.javaconfig.bean.MediaPlayer;
import sping.in.action.chapter2.javaconfig.config.CDPlayerConfig;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

  @Rule
  public final StandardOutputStreamLog log = new StandardOutputStreamLog();

  @Autowired
  private MediaPlayer player;
  
  @Autowired
  private CompactDisc cd;
  
  @Test
  public void cdShouldNotBeNull() {
    assertNotNull("cd is null!", cd);
  }

  @Test
  public void play() {
    player.play();
    assertEquals(
            "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
            log.getLog());
  }

}
