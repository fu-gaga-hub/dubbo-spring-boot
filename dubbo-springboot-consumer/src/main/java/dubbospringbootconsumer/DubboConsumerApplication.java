package dubbospringbootconsumer;

import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author fuGaga
 * @Date 2021/1/8 13:26
 * @Version 1.0
 */
@EnableDubbo
@EnableNacosDiscovery
@SpringBootApplication
public class DubboConsumerApplication {
        public static void main(String[] args) {
                SpringApplication.run(DubboConsumerApplication.class,args);
        }
}
