package dubbospringbootprovider.serviceImpl;

import org.apache.dubbo.config.annotation.DubboService;
import service.ProviderService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 服务接口实现类
 * @Author fuGaga
 * @Date 2021/1/8 14:22
 * @Version 1.0
 */
@DubboService(protocol = {"dubbo","rest"})
@Path("providerSecond")
public class ProviderServiceImpl implements ProviderService {

        @GET
        @Path("resultProvider")
        @Override
        public String resultProvider() {
                return "我是一个dubbo服务----second";
        }
}