package sping.in.action.chapter2.autoconfig.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cdPlayer")
@Qualifier("cdPlayerQualifier")
public class CDPlayer implements MediaPlayer {

    /*
     * 无需设置属性Setter，即可完成注入（反射实现）
     */
    @Autowired
    private CompactDisc cd;

    public void play() {
        cd.play();
    }

}
