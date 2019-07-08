package sping.in.action.chapter2.mixedconfig.bean;

public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
