package sping.in.action.chapter2.javaconfig.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sping.in.action.chapter2.javaconfig.bean.CDPlayer;
import sping.in.action.chapter2.javaconfig.bean.CompactDisc;
import sping.in.action.chapter2.javaconfig.bean.SgtPeppers;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
