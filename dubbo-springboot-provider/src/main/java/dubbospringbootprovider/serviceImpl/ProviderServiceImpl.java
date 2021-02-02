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
@Path("providerFirst")
public class ProviderServiceImpl implements ProviderService {

        @GET
        @Path("resultProvider")
        @Override
        public String resultProvider(){
//                try {
//                        Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                        e.printStackTrace();
//                }
//               System.out.println("哈哈");
                return "我是一个dubbo服务---first";
        }
}
