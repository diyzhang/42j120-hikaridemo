package cn.toj.hikaridemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.toj.hikaridemo")
public class HikaridemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HikaridemoApplication.class, args);
    }

}
