package com.example;

/**
 * Created by rjain on 4/12/17.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AuthApplication.class, args);
    }

}