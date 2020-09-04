

package chang.cloud.app.controller;


import chang.cloud.app.annotation.Login;
import chang.cloud.app.annotation.LoginUser;
import chang.cloud.app.entity.UserEntity;
import chang.cloud.common.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * APP测试接口
 *
 * @author yc
 */
@RestController
@RequestMapping("/app")
@Api("APP测试接口")
@RefreshScope
public class AppTestController {
    @Autowired AuthProperties authProperties;


    @Value("${conf.info}")
    private String configInfo;
    @Login
    @GetMapping("userInfo")
    @ApiOperation("获取用户信息")
    public R userInfo(@LoginUser UserEntity user){
        return R.ok().put("user", user);
    }

    @Login
    @GetMapping("userId")
    @ApiOperation("获取用户ID")
    public R userInfo(@RequestAttribute("userId") Integer userId){
        return R.ok().put("userId", userId);
    }

    @GetMapping("notToken")
    @ApiOperation("忽略Token验证测试")
    public R notToken(){
        return R.ok().put("msg", authProperties.getSkipUrl());
    }

}
