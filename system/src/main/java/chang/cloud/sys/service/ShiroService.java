

package chang.cloud.sys.service;


import chang.cloud.sys.entity.SysUserEntity;
import chang.cloud.sys.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 *
 * @author yc
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
