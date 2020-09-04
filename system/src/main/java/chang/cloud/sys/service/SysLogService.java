package chang.cloud.sys.service;


import chang.cloud.common.utils.PageUtils;
import chang.cloud.sys.entity.SysLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;


/**
 * 系统日志
 *
 * @author yc
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
