

package chang.cloud.oss.service;

import chang.cloud.common.utils.PageUtils;
import chang.cloud.oss.entity.SysOssEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 文件上传
 *
 * @author yc
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
