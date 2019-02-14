package cn.bdqn.sys.service;

import cn.bdqn.sys.entity.SmbmsUser;
import cn.bdqn.sys.entity.Userrole;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author yanzhao
 * @since 2019-01-27
 */
public interface IUserroleService extends IService<Userrole> {

   public IPage<Userrole> FuzzySearchUserByUserCode(SmbmsUser user,IPage page);
}
