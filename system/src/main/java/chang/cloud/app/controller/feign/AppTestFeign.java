package chang.cloud.app.controller.feign;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppTestFeign implements AppTestFeignClient{
    @Override
    public String top() {
        return "萨达是发到付";
    }
}
