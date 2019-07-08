package sping.in.action.chapter2.xmlconfig.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {

    @Autowired
    @Setter
    private CompactDisc compactDisc;

    @Getter
    @Setter
    private String name;

    public void play() {
        System.out.println(getName());
        compactDisc.play();
    }

}
