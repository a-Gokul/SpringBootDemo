# Spring Application Using @Configuration & @Componentscan Annotation 

- Here we create a class containing the configuration, and it contains the information about the 
  different configuration in the application.

### Example 

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

```@Configuration
@ComponentScan(basePackages = "beans")
public class BeanConfig {

}
```

### Creating Bean with @bean Annotaion in Bean Configuration file.

- Remove @component from PremAddress class
- Update the Bean config file :

```
@Configuration
@ComponentScan(basePackages = "beans")
public class BeanConfig {

    @Bean
    public PermAddress perm(){
       
       return new PermAddress();
    }
}

```
