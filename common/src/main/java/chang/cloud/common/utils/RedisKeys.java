

package chang.cloud.common.utils;

/**
 * Redis所有Keys
 *
 * @author yc
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
