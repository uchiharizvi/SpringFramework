package kavish.practice.springframeworkbasics.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //Specify this class as a config metadata to spring
@PropertySource("classpath:application.properties")//Explicitly define property file | Default : Application.properties
@ComponentScan(basePackages = "kavish.practice.springframeworkbasics")
public class ApplicationConfigWithComponentScan {

}
