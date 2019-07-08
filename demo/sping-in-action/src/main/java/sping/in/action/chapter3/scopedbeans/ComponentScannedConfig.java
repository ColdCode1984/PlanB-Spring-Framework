package sping.in.action.chapter3.scopedbeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 组件扫描与自动装配
 */
@Configuration
@ComponentScan(excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = Configuration.class)})
public class ComponentScannedConfig {

}
