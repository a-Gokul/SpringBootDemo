# Spring Application Using @Configuration & @Componentscan Annotation 

- Here we create a class containing the configuration, and it contains the information about the 
  different configuration in the application.

### Example 

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

`@Configuration
@ComponentScan(basePackages = "beans")
public class BeanConfig {

}`