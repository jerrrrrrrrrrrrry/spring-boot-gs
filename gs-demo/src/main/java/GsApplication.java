import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.gs")
public class GsApplication {

    public static void main(String[] args) {
        System.out.println("sg开始启动");
        SpringApplication.run(GsApplication.class, args);
    }

}
