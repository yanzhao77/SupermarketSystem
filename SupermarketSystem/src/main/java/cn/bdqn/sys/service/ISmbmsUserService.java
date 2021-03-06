package cn.bdqn.sys.service;

import cn.bdqn.sys.entity.SmbmsUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yanzhao
 * @since 2019-01-27
 */
public interface ISmbmsUserService extends IService<SmbmsUser> {

	public SmbmsUser login(String userCode,String userPassword);
}
