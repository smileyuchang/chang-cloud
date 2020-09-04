package chang.cloud.app.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 权限过滤
 *
 * @author Chill
 */
@Data
@RefreshScope
@Component
@ConfigurationProperties("blade.secure")
public class AuthProperties {

    /**
     * 放行API集合
     */
    private final List<String> skipUrl = new ArrayList<>();

}