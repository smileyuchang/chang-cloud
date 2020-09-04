

package chang.cloud.common.validator;

import chang.cloud.common.exception.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 *
 * @author yc
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
