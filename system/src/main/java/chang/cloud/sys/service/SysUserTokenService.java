

package chang.cloud.sys.service;

import chang.cloud.common.utils.R;
import chang.cloud.sys.entity.SysUserTokenEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户Token
 *
 * @author yc
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
