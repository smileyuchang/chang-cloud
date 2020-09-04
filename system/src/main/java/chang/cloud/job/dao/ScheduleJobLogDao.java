

package chang.cloud.job.dao;

import chang.cloud.job.entity.ScheduleJobLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author yc
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
