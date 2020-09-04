

package chang.cloud.sys.dao;


import chang.cloud.sys.entity.SysLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author yc
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
