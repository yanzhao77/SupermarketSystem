package cn.bdqn.sys.service.impl;

import cn.bdqn.sys.entity.SmbmsUser;
import cn.bdqn.sys.entity.Userrole;
import cn.bdqn.sys.mapper.SmbmsUserMapper;
import cn.bdqn.sys.mapper.UserroleMapper;
import cn.bdqn.sys.service.IUserroleService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author yanzhao
 * @since 2019-01-27
 */
@Service
public class UserroleServiceImpl extends ServiceImpl<UserroleMapper, Userrole> implements IUserroleService {

	@Autowired
	private UserroleMapper UserroleMapper;
	@Override
	public IPage<Userrole> FuzzySearchUserByUserCode(SmbmsUser user, IPage page) {
		// TODO Auto-generated method stub
		QueryWrapper<Userrole> mapper =new QueryWrapper<Userrole>();
		if(user.getUserName()!=null||user.getUserName()!=" ") {
			mapper.like("userName", user.getUserName());
		}
		if(user.getUserRole() != 0) {
			mapper.eq("userRole", user.getUserRole());
		}
		page.setTotal(3L);
		
		IPage arg1 = UserroleMapper.selectPage(page, mapper);
		return arg1;
	}

}
