package sping.in.action.chapter3.externals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySources;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan(basePackages = {"sping.in.action.chapter3.externals"})
public class EnvironmentConfigWithPlaceHolder {

    /*
    * 指定属性文件
    */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        Resource resource = new ClassPathResource("/META-INF/properties/app.properties");
        propertySourcesPlaceholderConfigurer.setLocation(resource);
        return propertySourcesPlaceholderConfigurer;
    }

}
