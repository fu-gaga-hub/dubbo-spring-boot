package dubbospringbootconsumer.mockImpl;

import org.springframework.stereotype.Component;
import service.ProviderService;

/**
 * 服务提供者mock实现类
 * @Author fuGaga
 * @Date 2021/1/29 9:43
 * @Version 1.0
 */
public class ProviderServiceMockImpl implements ProviderService {
        @Override
        public String resultProvider() {
                return "mock降级";
        }
}
