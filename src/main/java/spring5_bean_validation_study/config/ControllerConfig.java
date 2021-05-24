package spring5_bean_validation_study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring5_bean_validation_study.controller","spring5_bean_validation_study.survey"})
public class ControllerConfig {}
