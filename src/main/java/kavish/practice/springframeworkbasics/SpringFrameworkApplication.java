package kavish.practice.springframeworkbasics;

import kavish.practice.springframeworkbasics.config.ApplicationConfigWithComponentScan;
import kavish.practice.springframeworkbasics.service.OutputService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

    public static void main(String[] args) throws InterruptedException {

        /***Nomral Java Code***/
        /*GreetingService greetingService = new GreetingService("Hello");
        TimeService timeService = new TimeService(true);
        OutputService outputService = new OutputService(greetingService, timeService);*/

        /***IOC Container***/
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfigWithComponentScan.class);// Constructor describes what type of Config metadata you require
        OutputService outputService = applicationContext.getBean(OutputService.class);

        for(int i=0;i<5;i++){
            outputService.generateOutput();
            Thread.sleep(5000);
        }
        /***SpringBoot***/
       /* SpringApplication.run(SpringFrameworkApplication.class, args);*/
    }

}
