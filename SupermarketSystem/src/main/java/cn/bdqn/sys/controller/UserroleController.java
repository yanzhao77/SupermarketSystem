package cn.bdqn.sys.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import cn.bdqn.sys.entity.SmbmsRole;
import cn.bdqn.sys.entity.SmbmsUser;
import cn.bdqn.sys.entity.Userrole;
import cn.bdqn.sys.service.IUserroleService;

/**
 * <p>
 * VIEW 前端控制器
 * </p>
 *
 * @author yanzhao
 * @since 2019-01-27
 */
@Controller
@RequestMapping("/sys/userrole")
public class UserroleController {

	@Autowired
	private SmbmsRoleController SmbmsRoleController;
	@Autowired
	private IUserroleService IUserroleService;
	
	@RequestMapping("/FuzzySearchUser")
	public String FuzzySearchUserByUserCode(HttpServletRequest req,SmbmsUser user1,Page page) {
		System.out.println(user1.getUserName());
		System.out.println(user1.getUserRole());
		List<SmbmsRole> roleList= SmbmsRoleController.RoleList();
		IPage<Userrole> user= IUserroleService.FuzzySearchUserByUserCode(user1, page);
		req.setAttribute("userPage", user);
		req.setAttribute("roleList", roleList);
		req.setAttribute("oldUser", user1);
		req.setAttribute("pageCount", page.getPages());
		System.out.println("################################");
		return "userlist";
	}
}
