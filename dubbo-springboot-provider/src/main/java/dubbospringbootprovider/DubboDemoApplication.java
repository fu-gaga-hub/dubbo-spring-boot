package dubbospringbootprovider;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableNacosDiscovery
@EnableDubbo
@SpringBootApplication
public class DubboDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboDemoApplication.class, args);
    }

}
