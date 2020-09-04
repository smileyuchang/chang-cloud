package chang.cloud.app.controller.feign;

import chang.cloud.common.launch.AppConstant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        value = AppConstant.SYSTEM_PREFIX
)
public interface AppTestFeignClient {
    @GetMapping("/top")
    String top();
}
