package sping.in.action.chapter3.externals;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDiscWithPlaceHolder {

    private final String title;
    private final String artist;

    /*
     * 使用@Value指定默认值，必须使用@Autowired，否则报错
     */
    @Autowired
    public BlankDiscWithPlaceHolder(@Value("${disc.title}") String title,
                                    @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

}
