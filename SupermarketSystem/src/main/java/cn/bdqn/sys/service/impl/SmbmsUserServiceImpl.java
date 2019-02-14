package cn.bdqn.sys.service.impl;

import cn.bdqn.sys.entity.SmbmsUser;
import cn.bdqn.sys.mapper.SmbmsUserMapper;
import cn.bdqn.sys.service.ISmbmsUserService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yanzhao
 * @since 2019-01-27
 */
@Service
public class SmbmsUserServiceImpl extends ServiceImpl<SmbmsUserMapper, SmbmsUser> implements ISmbmsUserService {

	@Autowired
	private SmbmsUserMapper SmbmsUserMapper;
	@Override
	public SmbmsUser login(String userCode, String userPassword) {
		// TODO Auto-generated method stub
		QueryWrapper<SmbmsUser> mapper = new QueryWrapper<>();
		mapper.eq("userCode",userCode);
		mapper.eq("userPassword",userPassword);
		SmbmsUser user= SmbmsUserMapper.selectOne(mapper);
		return user;
	}

}
