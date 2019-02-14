package cn.bdqn.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import cn.bdqn.sys.entity.SmbmsRole;
import cn.bdqn.sys.service.ISmbmsRoleService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yanzhao
 * @since 2019-01-27
 */
@RestController
@RequestMapping("/sys/smbms-role")
public class SmbmsRoleController {

	@Autowired
	private ISmbmsRoleService ISmbmsRoleService;

	public List<SmbmsRole> RoleList() {
		List<SmbmsRole> RoleList = ISmbmsRoleService.list();
		return RoleList;
	}



}
