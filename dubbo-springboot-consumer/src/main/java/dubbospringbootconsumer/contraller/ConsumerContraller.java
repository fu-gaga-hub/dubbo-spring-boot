package dubbospringbootconsumer.contraller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProviderService;

/**
 * 消费者控制层
 * @Author fuGaga
 * @Date 2021/1/8 15:51
 * @Version 1.0
 */
@RestController
public class ConsumerContraller {

        /* 配置容错failfast(调用一次失败立即走mock降级)，500毫秒未返回结果则失败 */
        @DubboReference(//loadbalance = "roundrobin",
                                        protocol = "dubbo",
                                        mock = "dubbospringbootconsumer.mockImpl.ProviderServiceMockImpl",
                                        timeout = 500,
                                        cluster = "failfast")
        ProviderService providerService;

        @RequestMapping("getStringResult")
        public String getStringResult(){
               return  providerService.resultProvider();
        }
}
