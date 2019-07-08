package sping.in.action.chapter2.mixedconfig.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:/META-INF/spring/chapter-2-mixedconfig.xml")
public class SoundSystemConfig {

}
