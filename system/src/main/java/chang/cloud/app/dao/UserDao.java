

package chang.cloud.app.dao;

import chang.cloud.app.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author yc
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
