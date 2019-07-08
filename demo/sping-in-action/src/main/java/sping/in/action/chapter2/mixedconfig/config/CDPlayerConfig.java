package sping.in.action.chapter2.mixedconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sping.in.action.chapter2.mixedconfig.bean.CDPlayer;
import sping.in.action.chapter2.mixedconfig.bean.CompactDisc;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
