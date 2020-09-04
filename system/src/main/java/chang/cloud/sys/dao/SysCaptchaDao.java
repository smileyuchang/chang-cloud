

package chang.cloud.sys.dao;

import chang.cloud.sys.entity.SysCaptchaEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author yc
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
