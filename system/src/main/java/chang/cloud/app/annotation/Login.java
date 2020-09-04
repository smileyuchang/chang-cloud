

package chang.cloud.app.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 *
 * @author yc
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
