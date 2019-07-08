package sping.in.action.chapter1.knight.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sping.in.action.chapter1.knight.bean.Knight;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/META-INF/spring/chapter-1-knight.xml"})
public class KnightXMLInjectionTest {

  @Autowired
  Knight knight;

  @Test
  public void shouldInjectKnightWithSlayDragonQuest() {
    knight.embarkOnQuest();
  }

}
