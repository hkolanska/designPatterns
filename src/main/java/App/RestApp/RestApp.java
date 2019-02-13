package App.RestApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"App.RestControllers"})
public class RestApp {
    public static void main(String[] args){
        SpringApplication.run(RestApp.class,args);
    }
}
