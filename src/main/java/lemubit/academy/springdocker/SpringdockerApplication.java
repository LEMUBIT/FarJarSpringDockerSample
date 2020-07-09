package lemubit.academy.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdockerApplication {
//https://medium.com/holisticon-consultants/dont-build-fat-jars-for-docker-applications-6252a5571248

    public static void main(String[] args) {
        SpringApplication.run(SpringdockerApplication.class, args);
    }

}
