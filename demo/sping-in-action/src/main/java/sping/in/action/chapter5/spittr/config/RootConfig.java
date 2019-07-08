package sping.in.action.chapter5.spittr.config;

import java.util.regex.Pattern;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackages = {"sping.in.action.chapter5.spittr"},
        excludeFilters = {
                @Filter(type = FilterType.CUSTOM, value = RootConfig.WebPackage.class)
        })
public class RootConfig {

    /* 不会加载web包下的bean到spring容器中 */
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("sping\\.in\\.action\\.chapter5\\.spittr\\.web"));
        }
    }

}
