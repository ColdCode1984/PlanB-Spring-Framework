package sping.in.action.chapter1.knight.config;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sping.in.action.chapter1.knight.bean.*;
import sping.in.action.chapter1.knight.bean.BraveKnight;
import sping.in.action.chapter1.knight.bean.SlayDragonQuest;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(stream());
    }

    @Bean
    public PrintStream stream() {
        return System.out;
    }

}
