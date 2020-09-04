

package chang.cloud.job.service;

import chang.cloud.common.utils.PageUtils;
import chang.cloud.job.entity.ScheduleJobLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * 定时任务日志
 *
 * @author yc
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
