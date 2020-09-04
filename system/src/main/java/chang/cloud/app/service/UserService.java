

package chang.cloud.app.service;


import chang.cloud.app.entity.UserEntity;
import chang.cloud.app.form.LoginForm;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户
 *
 * @author yc
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回用户ID
	 */
	long login(LoginForm form);
}
